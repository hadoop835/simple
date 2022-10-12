package com.zhanshen.impl;

import com.zhanshen.api.dto.ScoringDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhanshen.dao.ScoringMapper;

/**
 * @author chenzhh
 */
@Service
public class UserTobServiceImpl  implements UserTobService {

    ScoringMapper scoringMapper;

    @Autowired
    public UserTobServiceImpl(ScoringMapper scoringMapper) {
         this.scoringMapper = scoringMapper;
    }

    @Override
    public void save(ScoringDto scoringDto) {

    }
}
