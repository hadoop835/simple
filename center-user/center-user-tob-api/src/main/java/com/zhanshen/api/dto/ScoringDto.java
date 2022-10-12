package com.zhanshen.api.dto;

import com.zhanshen.api.dto.UserDto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author chenzhh
 *
 */
public class ScoringDto implements Serializable {
    private  Integer id;
    private BigDecimal account;
    private UserDto userDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public String toString() {
        return "ScoringDto{" +
                "id=" + id +
                ", account=" + account +
                ", userDto=" + userDto +
                '}';
    }
}
