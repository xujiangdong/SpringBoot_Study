package com.example.springboot_jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author XuJD
 * @create 2018-10-29 13:41
 **/
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index2(Map<String,Object> map){
        map.put("name","123");
        return "index";
    }
}
