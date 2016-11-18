package cn.zeus.bookcase.common.exception;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.common.ErrorNum;
import cn.zeus.bookcase.web.interceptor.AccessTokenException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller异常统一处理类
 * <p>
 * Created by lvzimou on 16-8-22.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Log LOG = LogFactory.getLog(GlobalExceptionHandler.class);

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handle(CustomException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug(ex);
        rep.setError(ex.getErrorNum(), ex.getErrorMessage());
        return rep;
    }

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handle(JsonMappingException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug(ex);
        rep.setError(ErrorNum.PARAMS_ERROR.index, "传送的JSON格式有误，请检查！错误消息: " + ex.getMessage());
        return rep;
    }

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handle(AccessTokenException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug(ex);
        rep.setError(ErrorNum.PARAMS_ERROR.index, ex.getMessage());
        return rep;
    }

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handle(HttpRequestMethodNotSupportedException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug(ex);
        rep.setError(ErrorNum.PARAMS_ERROR.index, ex.getMessage());
        return rep;
    }

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handleTypeMismatch(TypeMismatchException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.error(ex);
        rep.setError(ErrorNum.PARAMS_ERROR.index, ex.getMessage());
        return rep;
    }

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handle(MissingServletRequestParameterException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug(ex);
        rep.setError(ErrorNum.PARAMS_ERROR.index, ex.getMessage());
        return rep;
    }

    /**
     * 统一处理业务异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handle(BusinessException ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug(ex);
        rep.setError(ex.getErrNum(), ex.getMessage());
        return rep;
    }

    @ExceptionHandler
    public
    @ResponseBody
    BaseResponse<String> handleAllException(Exception ex) {
        BaseResponse<String> rep = new BaseResponse<String>();
        LOG.debug("系统错误：", ex);
        rep.setError(ErrorNum.SYS_ERR.index, ErrorNum.SYS_ERR.name);
        rep.setData(ex.getMessage());
        return rep;
    }
}
