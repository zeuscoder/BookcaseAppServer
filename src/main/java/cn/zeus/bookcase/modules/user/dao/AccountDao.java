package cn.zeus.bookcase.modules.user.dao;

import cn.zeus.bookcase.modules.user.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvzimou on 16-8-22.
 */
@Repository("accountDao")
public class AccountDao {

    private static final String NAMESPACE_USER = "cn.zeus.bookcase.modules.user.dao.AccountDao.";

    @Autowired
    private SqlSession sqlSession;

    public Account findByNameAndPwd(String name) {
        return sqlSession.selectOne(NAMESPACE_USER + "findAccount", name);
    }
}
