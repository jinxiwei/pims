package com.jrgd.pims;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author jinwei
 * @Create 2018/04/08 9:03
 * @Desc
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("username","jinwei22222");
        model.addAttribute("password","123213213123");
        model.addAttribute("male","yes");
        return "index";
    }

}
