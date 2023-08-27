import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Squad {
    private int maxSize;
    private String name;
    private String cause;
    private List<Hero> heroes;

    public Squad(int maxSize, String name, String cause) {
        this.maxSize = maxSize;
        this.name = name;
        this.cause = cause;
        this.heroes = new ArrayList<>();
    }

    public boolean addHero(Hero hero) {
        if (heroes.size() < maxSize) {
            heroes.add(hero);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public int getCurrentSize() {
        return heroes.size();
    }

}
