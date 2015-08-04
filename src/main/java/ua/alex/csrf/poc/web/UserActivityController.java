package ua.alex.csrf.poc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.alex.csrf.poc.entity.MaliciousUserActivity;
import ua.alex.csrf.poc.service.ChangeDataService;

import java.security.Principal;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
@RequestMapping("/activity")
public class UserActivityController {

    @Autowired
    private ChangeDataService changeDataService;

    @RequestMapping(method = GET)
    public String info(Principal principal, Model model) {
        Collection<MaliciousUserActivity> activityStatistic = changeDataService.change(principal);
        model.addAttribute("data", "abc");
        model.addAttribute("totalActivityCount", activityStatistic.size());
        model.addAttribute("activityStatictic", activityStatistic);
        return "userActivityStatistic";
    }

}
