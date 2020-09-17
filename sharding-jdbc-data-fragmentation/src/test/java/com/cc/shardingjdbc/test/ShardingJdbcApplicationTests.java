package com.cc.shardingjdbc.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cc.shardingjdbc.datafragmentation.ShardingJdbcDataFragmentationApplication;
import com.cc.shardingjdbc.datafragmentation.entity.Order;
import com.cc.shardingjdbc.datafragmentation.entity.OrderConfig;
import com.cc.shardingjdbc.datafragmentation.mapper.OrderConfigMapper;
import com.cc.shardingjdbc.datafragmentation.mapper.OrderMapper;
import com.cc.shardingjdbc.datafragmentation.service.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Description
 *
 * @author wangchen
 * @createDate 2020/09/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcDataFragmentationApplication.class)
public class ShardingJdbcApplicationTests {

    @Autowired
    private OrderConfigMapper orderConfigMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private IOrderService orderService;

    @Test
    public void testOrderConfigSelect() {
        OrderConfig orderConfig = orderConfigMapper.selectById(1);
        System.out.println(orderConfig);
    }

    @Test
    public void testOrdersSelect() {
        Order orders = orderMapper.selectById(1);
        System.out.println(orders);
    }

    @Test
    public void testSelectByUserId() {
        Order one = orderService.getOne(new QueryWrapper<Order>().lambda().eq(Order::getUserId, 3));
        System.out.println(one);
    }

    @Test
    public void testOrdersInsert() {
        Order order = new Order();
        order.setUserId(8);
        orderService.save(order);
    }

    @Test
    public void testSelectByUserIds() {
        List<Integer> userIds = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Order> orders = orderService.list();
        orders.stream().forEach(System.out::println);

        List<Order> orders1 = orderService.list(new QueryWrapper<Order>().lambda().in(Order::getUserId, userIds));
        orders1.stream().forEach(System.out::println);

//        List<Order> orders2 = orderService.list(new QueryWrapper<Order>().between("user_id", 1, 4));
//        orders2.stream().forEach(System.out::println);
    }

}
