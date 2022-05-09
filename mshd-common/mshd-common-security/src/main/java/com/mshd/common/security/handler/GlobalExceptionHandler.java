package com.mshd.common.security.handler;

import com.mshd.common.core.constant.HttpStatus;
import com.mshd.common.core.exception.FileException;
import com.mshd.common.core.web.domain.RequestResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 文件操作异常
     */
    @ExceptionHandler(FileException.class)
    public RequestResponseBody handleNotPermissionException(FileException e, HttpServletRequest request) {
        return RequestResponseBody.error(HttpStatus.FORBIDDEN, "无权限访问");
    }
}
