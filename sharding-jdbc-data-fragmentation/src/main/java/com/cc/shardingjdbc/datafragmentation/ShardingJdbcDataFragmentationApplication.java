package com.cc.shardingjdbc.datafragmentation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description
 *
 * @author wangchen
 * @createDate 2020/09/16
 */
@SpringBootApplication
@MapperScan(basePackages = "com.cc.shardingjdbc.datafragmentation.mapper")
public class ShardingJdbcDataFragmentationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDataFragmentationApplication.class,args);
    }
}
