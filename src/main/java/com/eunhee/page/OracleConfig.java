package com.eunhee.page;

import oracle.jdbc.datasource.impl.OracleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class OracleConfig {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource oracleDataSource(){
        OracleDataSource oracleDataSource;
        try {
            oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL(url);
            oracleDataSource.setUser(username);
            oracleDataSource.setPassword(password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return oracleDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource oracleDataSource){
        return new JdbcTemplate(oracleDataSource);
    }

}
