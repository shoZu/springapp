package pl.shozu.springapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.shozu.springapp.domain.Knight;
import pl.shozu.springapp.domain.repository.KnightRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnightService {

    @Autowired
    KnightRepository repository;

    public List<Knight> getKnights(){
        return new ArrayList<>(repository.getAllKnights());
    }
}
