package com.mshd.common.core.web.controller;

import com.mshd.common.core.web.domain.RequestResponseBody;

public class BaseController {

    protected RequestResponseBody toRequestResponseBody(boolean result) {
        return result ? success() : error();
    }

    /**
     * 返回成功
     */
    public RequestResponseBody success() {
        return RequestResponseBody.success();
    }

    /**
     * 返回失败消息
     */
    public RequestResponseBody error() {
        return RequestResponseBody.error();
    }

    /**
     * 返回成功消息
     */
    public RequestResponseBody success(String message) {
        return RequestResponseBody.success(message);
    }

    /**
     * 返回失败消息
     */
    public RequestResponseBody error(String message) {
        return RequestResponseBody.error(message);
    }
}
