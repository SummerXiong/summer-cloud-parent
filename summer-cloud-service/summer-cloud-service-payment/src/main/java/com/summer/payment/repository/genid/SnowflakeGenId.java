package com.summer.payment.repository.genid;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import tk.mybatis.mapper.genid.GenId;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 17:44
 */
public class SnowflakeGenId implements GenId<Long> {

    @Override
    public Long genId(String s, String s1) {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        return snowflake.nextId();
    }

}
