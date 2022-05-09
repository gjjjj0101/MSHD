package com.mshd.common.core.web.domain;


import com.mshd.common.core.constant.HttpStatus;

import java.util.HashMap;

public class RequestResponseBody extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;
    /**
     * 状态码
     */
    public static final String CODE_TAG = "status";
    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";
    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";

    public RequestResponseBody() {
    }

    /**
     * 初始化一个新创建的 RequestResponseBody 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public RequestResponseBody(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 RequestResponseBody 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public RequestResponseBody(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (data != null) {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static RequestResponseBody success() {
        return RequestResponseBody.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static RequestResponseBody success(Object data) {
        return RequestResponseBody.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static RequestResponseBody success(String msg) {
        return RequestResponseBody.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static RequestResponseBody success(String msg, Object data) {
        return new RequestResponseBody(HttpStatus.SUCCESS, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static RequestResponseBody error() {
        return RequestResponseBody.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static RequestResponseBody error(String msg) {
        return RequestResponseBody.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static RequestResponseBody error(String msg, Object data) {
        return new RequestResponseBody(HttpStatus.ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static RequestResponseBody error(int code, String msg) {
        return new RequestResponseBody(code, msg, null);
    }

    /**
     * 方便链式调用
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public RequestResponseBody put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
