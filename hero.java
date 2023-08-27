import java.util.ArrayList;
import java.util.Scanner;

public class Hero {
    private int age;
    private String name;
    private String specialPower;
    private String weakness;

    public Hero(String name, int age, String specialPower, String weakness) {
        this.age = age;
        this.name = name;
        this.specialPower = specialPower;
        this.weakness = weakness;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

}
