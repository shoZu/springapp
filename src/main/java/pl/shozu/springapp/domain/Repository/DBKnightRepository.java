package pl.shozu.springapp.domain.Repository;

import org.springframework.stereotype.Repository;
import pl.shozu.springapp.domain.Knight;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.PostConstruct;
import java.util.Collection;

public class DBKnightRepository implements KnightRepository {
    @Override
    public void createKnight(String name, int age) {
        System.out.println("Uzywam bazy danych ");
    }

    @Override
    public Collection<Knight> getAllKnights() {
        System.out.println("Uzywam bazy danych ");
        throw new NotImplementedException();
    }

    @Override
    public Knight getKnight(String name) {
        System.out.println("Uzywam bazy danych ");
        throw new NotImplementedException();
    }

    @Override
    public Knight removeKnight(String name) {
        System.out.println("Uzywam bazy danych ");
        throw new NotImplementedException();
    }

    @Override
    @PostConstruct
    public void build() {

    }
}
