package pl.shozu.springapp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.shozu.springapp.domain.Repository.DBKnightRepository;
import pl.shozu.springapp.domain.Repository.InMemoryRepository;
import pl.shozu.springapp.domain.Repository.KnightRepository;

@Configuration
public class MainConfig {

    @Bean(name = "InMemoryRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepository(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name = "DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBKnightRepository(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}
