package com.mshd.common.security.handler;

import com.mshd.common.core.web.domain.RequestResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import com.mshd.common.core.exception.FileException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 文件操作异常
     */
    @ExceptionHandler(FileException.class)
    public RequestResponseBody handleNotPermissionException(FileException e, HttpServletRequest request)
    {
        String requestURI = request.getRequestURI();

        //To-Do
        return new RequestResponseBody();
        //return RequestResponseBody.error();
    }
}
