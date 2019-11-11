package pl.shozu.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.shozu.springapp.domain.Castle;
import pl.shozu.springapp.domain.Knight;
import pl.shozu.springapp.domain.Quest;

@Component
public class Starter implements CommandLineRunner {
    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);
        Knight lancelot = new Knight("Lancelot", "30", new Quest("Uratuj Ksiezniczke"));
        Knight percival = new Knight("Percival", "30");
        percival.setQuest(new Quest("Zabij smoka"));
        System.out.println(lancelot);
        System.out.println(percival);

    }
}
