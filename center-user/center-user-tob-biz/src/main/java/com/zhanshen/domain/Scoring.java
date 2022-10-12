package com.zhanshen.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 积分
 * @author chenzhh
 */
public class Scoring implements Serializable {
    private  Integer id;
    private BigDecimal account;

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
}
