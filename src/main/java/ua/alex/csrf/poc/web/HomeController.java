package ua.alex.csrf.poc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/index", "/home"}, method = GET)
    public String home() {
        return "index";
    }

}