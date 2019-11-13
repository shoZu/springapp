package pl.shozu.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.shozu.springapp.domain.Quest;
import pl.shozu.springapp.domain.Repository.KnightRepository;
import pl.shozu.springapp.domain.Repository.QuestRepository;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {
    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();

    public void assignRandomQuest(String knightName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        knightRepository.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }

}
