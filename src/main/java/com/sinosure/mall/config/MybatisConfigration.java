package com.sinosure.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 用来配置mapper
 */
@Configuration
@MapperScan("com.sinosure.mall.mapper")
public class MybatisConfigration {
}
