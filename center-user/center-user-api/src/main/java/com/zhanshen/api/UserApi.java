package com.zhanshen.api;

import com.zhanshen.api.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author chenzhh
 */
@FeignClient(
        name = "${center.user.api.name:center-user}",
        contextId = "com.zhanshen.UserApi",
        path = "/v2/user",
        url = "${center.user.api:}"
)
public interface UserApi {

    @PostMapping(value = "/add")
    void add(@RequestBody UserDto userDto);

    @GetMapping(value = "/list")
    List<UserDto> list(@RequestBody UserDto userDto);
}
