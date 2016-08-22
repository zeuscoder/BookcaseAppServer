package cn.zeus.bookcase.filter;

import cn.zeus.bookcase.common.ErrorNum;

/**
 * accessToken与登录token不一致时,将会抛出该异常
 * <p>
 * Created by lvzimou on 16-8-22.
 */
public class AccessTokenException extends Exception {

    private static final long serialVersionUID = 1L;
    private String errorMessage = "";
    private int errorNum = 0;

    public AccessTokenException() {
        errorNum = ErrorNum.ACCESS_TOKEN_USERID_ILLEGAL.index;
        errorMessage = ErrorNum.ACCESS_TOKEN_EMPTY.ACCESS_TOKEN_USERID_ILLEGAL.name;
    }

    public String getMessage() {
        return errorMessage;
    }

    public int getErrorNum() {
        return errorNum;
    }
}
