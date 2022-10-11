package com.zhanshen.dao;

import com.zhanshen.api.dto.UserDto;
import com.zhanshen.domain.UserEo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenzhh
 */
@Mapper
public interface UserMapper {
    /**
     * 保存用户数据
     *
     * @param userEo
     */
    void insert(UserEo userEo);

    /**
     * 查询用户信息
     *
     * @param userEo
     * @return
     */
    List<UserEo> list(UserEo userEo);
}
