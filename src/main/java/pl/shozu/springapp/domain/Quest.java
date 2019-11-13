package pl.shozu.springapp.domain;

import org.springframework.stereotype.Component;

public class Quest {
    private String description;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
