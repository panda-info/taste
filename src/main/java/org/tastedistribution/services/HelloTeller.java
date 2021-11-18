package org.tastedistribution.services;

import org.springframework.stereotype.Service;
import org.tastedistribution.models.User;

@Service
public class HelloTeller {

    public String sayHello(User user) {
        return "Hello " + user.getName();
    }
}
