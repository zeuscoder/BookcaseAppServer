package cn.zeus.bookcase.web.controller.user;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.common.exception.BusinessException;
import cn.zeus.bookcase.component.user.entity.Account;
import cn.zeus.bookcase.component.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvzimou on 16-8-22.
 */
@RestController
@RequestMapping("/center/account")
public class UserController {

    Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /**
     * 登录
     *
     * @param name
     * @param pwd
     * @return
     * @throws BusinessException
     */
    @RequestMapping(value = "/login")
    public BaseResponse<Account> login(
            @RequestParam(required = true, value = "name") String name,
            @RequestParam(required = true, value = "pwd") String pwd) throws BusinessException {
        LOG.debug("访问【/login】路径,  进入了 login 方法");
        Account account = userService.userLogin(name);
        BaseResponse<Account> br = new BaseResponse<Account>();
        account.setToken(userService.createToken(account.getId(), account.getName(), account.getPwd()));
        br.setData(account);
        if (account != null && pwd.equals(account.getPwd())) {
            return br;
        } else {
            throw new BusinessException(2, "用户名或密码错误");
        }
    }
}
