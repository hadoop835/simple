package com.zhanshen.service.impl;

import com.zhanshen.api.dto.UserDto;
import com.zhanshen.dao.UserMapper;
import com.zhanshen.domain.UserEo;
import com.zhanshen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author chenzhh
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public boolean save(UserDto userDto) {
        UserEo userEo = new UserEo();
        userEo.setId(userDto.getId());
        userEo.setUsername(userDto.getUsername());
        userEo.setPassword(userDto.getPassword());
        userMapper.insert(userEo);
        return false;
    }

    @Override
    public List<UserDto> list(UserDto userDto) {
        UserEo userEo = new UserEo();
        List<UserEo> list = userMapper.list(userEo);
        return null;
    }
}
