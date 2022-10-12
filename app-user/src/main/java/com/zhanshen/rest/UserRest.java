package com.zhanshen.rest;

import com.zhanshen.ScoringApi;
import com.zhanshen.api.UserApi;
import com.zhanshen.api.dto.ScoringDto;
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
     UserApi userApi;

     ScoringApi scoringApi;

    @Autowired
    public UserRest(UserApi userApi,ScoringApi scoringApi) {
        this.userApi = userApi;
        this.scoringApi=scoringApi;
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody  UserDto userDto) {
        userApi.add(userDto);
    }

    @PostMapping(value = "/score")
    public void score(@RequestBody ScoringDto scoringDto) {
        this.scoringApi.save(scoringDto);
    }

}
