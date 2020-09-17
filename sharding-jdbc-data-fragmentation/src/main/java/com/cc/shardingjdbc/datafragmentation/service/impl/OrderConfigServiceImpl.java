package com.cc.shardingjdbc.datafragmentation.service.impl;

import com.cc.shardingjdbc.datafragmentation.entity.OrderConfig;
import com.cc.shardingjdbc.datafragmentation.mapper.OrderConfigMapper;
import com.cc.shardingjdbc.datafragmentation.service.IOrderConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单配置表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2020-09-16
 */
@Service
public class OrderConfigServiceImpl extends ServiceImpl<OrderConfigMapper, OrderConfig> implements IOrderConfigService {

}
