package com.cc.shardingjdbc.datafragmentation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cc.shardingjdbc.datafragmentation.entity.Order;
import com.cc.shardingjdbc.datafragmentation.mapper.OrderMapper;
import com.cc.shardingjdbc.datafragmentation.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2020-09-16
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
