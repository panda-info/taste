package org.tastedistribution.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tastedistribution.models.User;
import org.tastedistribution.services.HelloTeller;

@RestController
public class HelloTellerController {

    private HelloTeller helloTeller;

    public HelloTellerController(HelloTeller helloTeller) {
        this.helloTeller = helloTeller;
    }

    @GetMapping("/")
    public String sayHello() {
        User user = new User("Zouhair");
        return  helloTeller.sayHello(user);
    }
}
