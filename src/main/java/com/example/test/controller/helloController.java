package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller

public class helloController {

    @RequestMapping(value = "/rule")
    @ResponseBody
    public Map<String, Object>[] getMap() {
        Map<String, Object> fin = new HashMap<>();
        fin.put("code", 0);
        fin.put("msg", "");

        Map<String, Object>[] ret = new Map[7];

        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[0] = map;

        map = new HashMap<>();
        map.put("id", 2);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[1] = map;

        map = new HashMap<>();
        map.put("id", 2);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[2] = map;

        map = new HashMap<>();
        map.put("id", 2);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[3] = map;

        map = new HashMap<>();
        map.put("id", 2);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[4] = map;

        map = new HashMap<>();
        map.put("id", 2);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[5] = map;

        map = new HashMap<>();
        map.put("id", 2);
        map.put("url", "http://blog.itcodai.com");
        map.put("reg_expr", "*");
        map.put("reg_expr_name", "*");
        map.put("is_default", 0);
        map.put("jump", "drop");
        map.put("local_level", 1);
        map.put("global_level", 2);
        map.put("note", "");
        ret[6] = map;

        fin.put("data", ret);
        fin.put("count", ret.length);
        return ret;
    }

}