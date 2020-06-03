package com.summer.payment.repository.entity;

import com.summer.payment.repository.genid.SnowflakeGenId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/30 16:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_payment")
public class Payment implements Serializable {

    @Id
    @KeySql(genId = SnowflakeGenId.class)
    @Column(name = "id")
    private Long id;

    @Column(name = "serial")
    private String serial;

}
