package com.zhanshen.service;

import com.zhanshen.api.dto.UserDto;
import com.zhanshen.domain.UserEo;

import java.util.List;

/**
 * @author chenzhh
 */
public interface UserService {
    /**
     * 保存数据
     * @param userDto
     * @return
     */
    boolean  save(UserDto userDto);

    /**
     * 查询数据
     * @param userDto
     * @return
     */
    List<UserDto> list(UserDto userDto);
}
