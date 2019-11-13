package pl.shozu.springapp.domain.Repository;

import pl.shozu.springapp.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    Knight removeKnight(String name);

    void build();
}
