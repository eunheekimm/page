package com.eunhee.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UrlDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Map<String,String> selectUrls(){
        Map<String, String> map = new HashMap<>();
        jdbcTemplate.query("SELECT * FROM HR.MY_URL", (rs, rowNum) ->
                        map.put(rs.getString("site"), rs.getString("url")));
        return map;
    }

}
