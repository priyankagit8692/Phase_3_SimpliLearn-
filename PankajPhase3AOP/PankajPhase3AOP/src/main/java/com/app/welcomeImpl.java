package com.app;

import org.springframework.stereotype.Component;

@Component(value = "welcome")
public class welcomeImpl implements welcome {

    @Override
    public String sayWelcome(String name) {
        return "welcome" + name;
    }

    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
