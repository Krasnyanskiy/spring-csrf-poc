package ua.alex.csrf.poc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.alex.csrf.poc.entity.UserActivity;
import ua.alex.csrf.poc.service.ChangeDataService;

import java.security.Principal;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Alexander Krasnyanskiy
 */
@Controller
@RequestMapping("/activity")
public class UserActivityController {

    @Autowired
    private ChangeDataService changeDataService;

    @RequestMapping(method = GET)
    public String info(Model model) {
        Collection<UserActivity> activityStatistic = changeDataService.getStatistic().values();
        model.addAttribute("totalActivityCount", activityStatistic.size());
        model.addAttribute("activityStatistic", activityStatistic);
        return "userActivityStatistic";
    }


    @RequestMapping(method = POST)
    public String info(Principal principal, Model model) {
        Collection<UserActivity> activityStatistic = changeDataService.change(principal);
        model.addAttribute("totalActivityCount", activityStatistic.size());
        model.addAttribute("activityStatistic", activityStatistic);
        return "userActivityStatistic";
    }

    @RequestMapping(value = "/updatePage", method = GET)
    public String updatePage(Model model) {
        return "redirect:/activity";
    }

}
