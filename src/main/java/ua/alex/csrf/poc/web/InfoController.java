package ua.alex.csrf.poc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
@RequestMapping("/info")
public class InfoController {

    @RequestMapping(method = GET)
    public String info() {
        return "info";
    }

}
