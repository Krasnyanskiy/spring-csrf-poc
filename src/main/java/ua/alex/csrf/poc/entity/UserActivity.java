package ua.alex.csrf.poc.entity;

import java.security.Principal;

/**
 * @author Alexander Krasnyanskiy
 */
public class UserActivity {

    private String actionDescription;
    private Principal principal;

    public UserActivity(String actionDescription, Principal principal) {
        this.actionDescription = actionDescription;
        this.principal = principal;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public Principal getPrincipal() {
        return principal;
    }

    @Override
    public String toString() {
        return "MaliciousUserActivity{" +
                "actionDescription='" + actionDescription + '\'' +
                ", principal=" + principal +
                '}';
    }
}

