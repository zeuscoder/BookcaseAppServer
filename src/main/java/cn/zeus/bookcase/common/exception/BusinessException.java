package cn.zeus.bookcase.common.exception;

/**
 * 业务异常,一般由GlobalExceptionHandler统一处理
 * <p>
 * Created by lvzimou on 16-8-22.
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 6617608551398142384L;

    private int errNum;

    public BusinessException(int errNum, String message, Throwable cause) {
        super(message, cause);
        this.errNum = errNum;
    }

    public BusinessException(int errNum, String message) {
        super(message);
        this.errNum = errNum;
    }

    public BusinessException(int errNum, Throwable cause) {
        super(cause);
        this.errNum = errNum;
    }

    public int getErrNum() {
        return errNum;
    }

}
