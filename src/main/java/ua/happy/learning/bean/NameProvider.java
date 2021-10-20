package ua.happy.learning.bean;

import org.springframework.stereotype.Component;

@Component
public class NameProvider {
    private static final String NAME = "Andriy";

    public String getName() {
        return NAME;
    }

}
