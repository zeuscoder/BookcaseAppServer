package cn.zeus.bookcase.component.user.service;

import cn.zeus.bookcase.component.user.entity.Account;

/**
 * Created by lvzimou on 16-8-22.
 */
public interface UserService {

    Account userLogin(String name);

    /**
     * 检查
     *
     * @param userId
     * @return
     */
    boolean checkToken(int userId, String token);

    /**
     * 设置
     *
     * @param userId
     * @return
     */
    void setRedisToken(int userId, String token);

    /**
     * 生成token
     *
     * @param userId
     * @return
     */
    String createToken(int userId, String name, String pwd);
}
