package com.cc.shardingjdbc.soraw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description
 *
 * @author wangchen
 * @createDate 2020/09/17
 */
@SpringBootApplication
@MapperScan("com.cc.shardingjdbc.soraw.mapper")
public class ShardingJdbcSORAWApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcSORAWApplication.class,args);
    }
}
