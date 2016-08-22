package cn.zeus.bookcase.common;

/**
 * Created by lvzimou on 16-8-22.
 */
public enum ErrorNum {

    //注意枚举以分号结束
    NO_ERR(0, "没有错误"),
    SYS_UNKNOWN(1, "系统未知错误"),
    PARAMS_ERROR(3, "参数错误"),
    ACCESS_TOKEN_USERID_ILLEGAL(100, "安全验证请求API服务失败，请重新登录！"),
    ACCESS_TOKEN_EMPTY(209, "AnjubaoAccessToken为空"),
    SYS_ERR(-999, "系统内部错误，请联系管理员");

    public String name;
    public int index;

    private ErrorNum(Integer index) {
        this.index = index;
    }

    private ErrorNum(Integer index, String name) {
        this.name = name;
        this.index = index;
    }

    public String getName(int index) {
        for (ErrorNum error : ErrorNum.values()) {
            if (error.index == index) {
                return error.name;
            }
        }
        return null;
    }

}
