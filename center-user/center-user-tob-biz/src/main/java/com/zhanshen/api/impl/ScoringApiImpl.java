package com.zhanshen.api.impl;

import com.zhanshen.ScoringApi;
import com.zhanshen.api.dto.ScoringDto;
import com.zhanshen.impl.UserTobService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v2/user")
public class ScoringApiImpl implements ScoringApi {
    UserTobService userTobService;
    public ScoringApiImpl(UserTobService userTobService){
        this.userTobService = userTobService;
    }
    @Override
    public void save(ScoringDto scoringDto) {
        System.out.println(scoringDto.toString());
    }
}
