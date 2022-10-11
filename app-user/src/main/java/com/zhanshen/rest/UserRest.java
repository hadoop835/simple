package com.zhanshen.rest;

import com.zhanshen.api.UserApi;
import com.zhanshen.api.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhh
 */
@RestController
public class UserRest {
    private UserApi userApi;

    @Autowired
    public UserRest(UserApi userApi) {
        this.userApi = userApi;
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody  UserDto userDto) {
        userApi.add(userDto);
    }
}
