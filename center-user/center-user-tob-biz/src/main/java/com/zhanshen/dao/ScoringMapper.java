package com.zhanshen.dao;

import com.zhanshen.domain.Scoring;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenzhh
 */
@Mapper
public interface ScoringMapper {

    void  insert(Scoring scoring);
}
