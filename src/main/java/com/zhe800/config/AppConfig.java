package com.zhe800.config;


import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@Configurable
@ComponentScan(basePackages = "com.zhe800")
@MapperScan("com.zhe800.mappers")
public class AppConfig {

    @Bean
    public DataSource dataSource()
    {
        return new PooledDataSource("com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost:3306/cmdb", "root", "123456");
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception
    {
        SqlSessionFactoryBean sessionFactory = new
                SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }


}
