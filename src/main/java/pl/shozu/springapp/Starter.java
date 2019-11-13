package pl.shozu.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.shozu.springapp.domain.Repository.InMemoryRepository;
import pl.shozu.springapp.domain.Repository.KnightRepository;
import pl.shozu.springapp.domain.Repository.QuestRepository;
import pl.shozu.springapp.services.QuestService;

@Component
public class Starter implements CommandLineRunner {
    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... args) throws Exception {
        questRepository.createRandomQuest();
        System.out.println(questRepository);
        questRepository.createRandomQuest();
        System.out.println(questRepository);
        questRepository.createRandomQuest();
        System.out.println(questRepository);
        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");

    }
}
