package ua.alex.csrf.poc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.alex.csrf.poc.service.ChangeDataService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
public class HomeController {

    @Autowired
    private ChangeDataService changeDataService;

    @RequestMapping(value = {"/", "/index", "/home"}, method = GET)
    public String home() {
        //
        // Let's redirect to activity page
        //
        return "redirect:/activity";
    }

}