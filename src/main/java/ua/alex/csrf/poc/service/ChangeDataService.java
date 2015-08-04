package ua.alex.csrf.poc.service;

import com.google.common.collect.Multimap;
import org.springframework.stereotype.Service;
import ua.alex.csrf.poc.entity.MaliciousUserActivity;

import java.security.Principal;
import java.util.Collection;
import java.util.Random;

import static com.google.common.collect.ArrayListMultimap.create;

/**
 * @author Alexander Krasnyanskiy
 */
@Service
public class ChangeDataService {

    private Multimap<String, MaliciousUserActivity> statistic = create();

    public Collection<MaliciousUserActivity> change(Principal principal) {
        MaliciousUserActivity activity = new MaliciousUserActivity("doAction-" + new Random().nextInt(20), principal);
        statistic.put(principal.getName(), activity);
        return statistic.values();
    }

    public Multimap<String, MaliciousUserActivity> getStatistic() {
        return statistic;
    }
}
