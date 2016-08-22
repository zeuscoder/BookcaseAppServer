package cn.zeus.bookcase.modules.user.service.impl;

import cn.zeus.bookcase.modules.user.dao.AccountDao;
import cn.zeus.bookcase.modules.user.entity.Account;
import cn.zeus.bookcase.modules.user.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by lvzimou on 16-8-22.
 */
@Service
public class UserServiceImpl implements UserService {

    Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    AccountDao accountDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Value("${userinfo.session.expireTime}")
    private long EXPIRE_TIME;

    @Override
    public Account userLogin(String name) {
        Account account = accountDao.findByNameAndPwd(name);
        return account;
    }

    @Override
    public boolean checkToken(int userId, String token) {
        String redisToken = redisTemplate.opsForValue().get(userId + "");
        if (redisToken.equals(token)) {
            redisTemplate.expire(userId + "", EXPIRE_TIME, TimeUnit.SECONDS);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setRedisToken(int userId, String token) {
        redisTemplate.opsForValue().set(userId + "", token, EXPIRE_TIME, TimeUnit.SECONDS);
    }

    @Override
    public String createToken(int userId, String name, String pwd) {
        String token = DigestUtils.sha1DigestAsHex(userId + "_" + name + "_" + pwd + "_" + System.currentTimeMillis());
        return token;
    }
}
