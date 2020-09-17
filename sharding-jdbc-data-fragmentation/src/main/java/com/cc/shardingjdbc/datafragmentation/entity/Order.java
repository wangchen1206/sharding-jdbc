package com.cc.shardingjdbc.datafragmentation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author wangchen
 * @since 2020-09-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "orders")   //这个表名称要和shardingjdbc使用的逻辑表一致
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer userId;


}
