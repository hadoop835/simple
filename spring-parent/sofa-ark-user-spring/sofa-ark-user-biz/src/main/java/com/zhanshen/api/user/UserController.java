package com.zhanshen.api.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhh
 */
@RestController
public class UserController {

    @GetMapping(value = "/")
    public String hello() {
        return "hello to ark dynamic deploy";
    }
}
