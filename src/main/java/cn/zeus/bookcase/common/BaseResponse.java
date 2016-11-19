package cn.zeus.bookcase.common;

import java.io.Serializable;

/**
 * 基础返回对象
 * <p>
 * Created by lvzimou on 16-8-22.
 */
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 7620544582929442162L;

    /**
     * 基础返回数据字段
     */
    private int result; //0-表示请求成功；非0-表示出现错误或者异常；
    private String message = "";
    private T data;
    private long total = 0L;

    /**
     * 设置响应的错误信息
     */
    public void setError(int result, String errMsg) {
        this.result = result;
        this.message = errMsg;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
