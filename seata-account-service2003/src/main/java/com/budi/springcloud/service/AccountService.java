package com.budi.springcloud.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface AccountService {
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
