package com.zhanshen.api.impl;

import com.zhanshen.api.UserApi;
import com.zhanshen.api.dto.UserDto;
import com.zhanshen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenzhh
 */
@RestController
@RequestMapping(value = "/v2/user")
public class UserApiImpl implements UserApi {

    private UserService userService;

    @Autowired
    public UserApiImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add(UserDto userDto) {
        userService.save(userDto);
    }

    @Override
    public List<UserDto> list(UserDto userDto) {
        return userService.list(userDto);
    }
}
