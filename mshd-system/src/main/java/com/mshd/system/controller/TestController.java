package com.mshd.system.controller;

import com.mshd.common.core.web.controller.BaseController;
import com.mshd.common.core.web.domain.RequestResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController extends BaseController {

    @GetMapping("/hello/{string}")
    public RequestResponseBody testHello(@PathVariable("string") String s){
        return this.success("hello" + s);
    }

}
