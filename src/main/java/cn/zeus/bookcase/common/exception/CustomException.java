package cn.zeus.bookcase.common.exception;

import cn.zeus.bookcase.common.ErrorNum;

/**
 * 自定义异常处理类
 * <p>
 * Created by lvzimou on 16-8-22.
 */
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 36677227487776757L;

    Integer errorNum = ErrorNum.SYS_UNKNOWN.index;
    String errorMessage = ErrorNum.SYS_UNKNOWN.name;

    public CustomException(ErrorNum error) {
        this.errorNum = error.index;
        this.errorMessage = error.name;
    }

    public CustomException(Integer errorNum, String errorMessage) {
        this.errorNum = errorNum;
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return errorMessage;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
