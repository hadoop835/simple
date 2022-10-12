package com.zhanshen;

import com.zhanshen.api.dto.ScoringDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author chenzhh
 */
@FeignClient(
        name = "${center.user.tob.api.name:center-user}",
        contextId = "com.zhanshen.ScoringApi",
        path = "/v2/user",
        url = "${center.user.api:}"
)
public interface ScoringApi {

    @PostMapping(value = "/scoring")
    void  save(@RequestBody  ScoringDto scoringDto);
}
