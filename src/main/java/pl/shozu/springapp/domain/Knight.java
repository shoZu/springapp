package pl.shozu.springapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {
    private String name;
    private int age;
    private Quest quest;

    public Knight() {
        this.name = "Lancelot";
        this.age = 29;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setQuest(Quest quest){
        System.out.println("ustawiam zadanie dla rycerza. ");
        this.quest = quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " ( " + age + " ). Zadanie: " + quest;
    }
}
