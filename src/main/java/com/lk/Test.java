package com.lk;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Test {
    @Resource
    JdbcTemplate jdbcTemplate;


    @RequestMapping(value = "/test/rest")
    @ResponseBody
    public Map<String, Object> test() {
        HashMap<String, Object> map = new HashMap<>();
        String sql = "select * from haha";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        map.put("code", 0);
        map.put("result", maps.get(0));
        return map;
    }
}
