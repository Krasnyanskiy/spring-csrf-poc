package ua.alex.csrf.poc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = GET)
    public String login(Model model,
                        @RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout) {
        if (error != null) {
            model.addAttribute("error", "Invalid username and/or password!");
        }
        if (logout != null) {
            model.addAttribute("message", "You've been logged out successfully.");
        }
        return "login";
    }

}
