package pl.shozu.springapp.domain.Repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.shozu.springapp.domain.Knight;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InMemoryRepository implements KnightRepository {

    Map<String, Knight> knights = new HashMap<>();

    public InMemoryRepository() {

    }


    @Override
    public void createKnight(String name, int age) {
        knights.put(name, new Knight(name, age));
    }

    @Override
    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    @Override
    public Knight getKnight(String name){
        return knights.get(name);
    }

    @Override
    public  Knight removeKnight(String name){
        return knights.remove(name);
    }


    @Override
    @PostConstruct
    public void build() {
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }

    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
