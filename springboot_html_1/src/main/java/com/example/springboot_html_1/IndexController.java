package com.example.springboot_html_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author XuJD
 * @create 2018-10-29 11:58
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/index1")
    public String index1(Model model,Map<String, Object> map){
        map.put("name","map传参");
        model.addAttribute("name1","Model传参");
        return "index";
    }

    @RequestMapping("/index2")
    public ModelAndView index2(ModelAndView modelAndView){
        //ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name","ModelAndView传参");
        modelAndView.addObject("name1","ModelAndView传参");
        return modelAndView;
    }

}
