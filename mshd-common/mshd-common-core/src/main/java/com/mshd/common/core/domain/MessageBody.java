package com.mshd.common.core.domain;

import com.mshd.common.core.constant.Constants;

import java.io.Serializable;

/**
 * 响应消息主体
 * @param <T>
 */
public class MessageBody<T> implements Serializable {
    /**
     * 成功
     */
    public static final int SUCCESS = Constants.SUCCESS;
    /**
     * 失败
     */
    public static final int FAIL = Constants.FAIL;
    private static final long serialVersionUID = 1L;
    private int code;

    private String msg;

    private T data;

    public static <T> MessageBody<T> ok() {
        return restResult(null, SUCCESS, null);
    }

    public static <T> MessageBody<T> ok(T data) {
        return restResult(data, SUCCESS, null);
    }

    public static <T> MessageBody<T> ok(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> MessageBody<T> fail() {
        return restResult(null, FAIL, null);
    }

    public static <T> MessageBody<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> MessageBody<T> fail(T data) {
        return restResult(data, FAIL, null);
    }

    public static <T> MessageBody<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    public static <T> MessageBody<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    private static <T> MessageBody<T> restResult(T data, int code, String msg) {
        MessageBody<T> apiResult = new MessageBody<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
