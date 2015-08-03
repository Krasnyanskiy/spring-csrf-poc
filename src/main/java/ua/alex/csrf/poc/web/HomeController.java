package ua.alex.csrf.poc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/index", "/home"}, method = GET)
    public String home() {
        return "index";
    }

    /*
    @RequestMapping(value = {"/403"}, method = GET)
    public String accessDenied() {
        return "403";
    }
    */

}