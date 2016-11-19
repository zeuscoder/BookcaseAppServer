package cn.zeus.bookcase.component.user.dao;

import cn.zeus.bookcase.component.user.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by lvzimou on 16-8-22.
 */
@Repository("AccountDao")
public class AccountDao {

    private static final String NAMESPACE_USER = "cn.zeus.bookcase.component.user.dao.AccountDao.";

    @Autowired
    private SqlSession sqlSession;

    public Account findByNameAndPwd(String name) {
        return sqlSession.selectOne(NAMESPACE_USER + "findAccount", name);
    }
}
