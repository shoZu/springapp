package pl.shozu.springapp.domain;

public class Knight {
    private String name;
    private String age;
    private Quest quest;

    public Knight(String name, String age, Quest quest ) {
        this.name = name;
        this.age = age;
        this.quest = quest;
    }

    public Knight(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setQuest(Quest quest){
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " ( " + age + " ). Zadanie: " + quest;
    }
}
