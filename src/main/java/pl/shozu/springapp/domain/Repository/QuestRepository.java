package pl.shozu.springapp.domain.Repository;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import pl.shozu.springapp.domain.Quest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {
    List<Quest> questList = new ArrayList<>();
    Random rand = new Random();

    public void createQuest(String description) {
        questList.add(new Quest(description));
    }

    public List<Quest> getAll() {
        return questList;
    }

    public void deleteQuest(Quest quest) {
        questList.remove(quest);
    }

    @PostConstruct
    public void init() {

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();
        descriptions.add("Uratuj Księżniczkę");
        descriptions.add("Wez udział w trunieju");
        descriptions.add("Zabij smoka");
        descriptions.add("Zabij bande goblinow");
        String description = descriptions.get(rand.nextInt(descriptions.size()));
        System.out.println("Utworzyłem zadanie o opisie " + description);
        createQuest(description);
    }
}

