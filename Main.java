import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hero {
    private int age;
    private String name;
    private String specialPower;
    private String weakness;

    public Hero(int age, String name, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }
}

class Squad {
    private String cause;
    private int maxSize;
    private String name;
    private List<Hero> heroes;

    public Squad(int maxSize, String name, String cause) {
        this.cause = cause;
        this.heroes = new ArrayList<>();
        this.maxSize = maxSize;
        this.name = name;
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

    public int getMaxSize() {
        return maxSize;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter squad name: ");
        String squadName = scanner.nextLine();

        System.out.print("Enter squad cause: ");
        String squadCause = scanner.nextLine();

        System.out.print("Enter max squad size: ");
        int maxSize = scanner.nextInt();

        Squad squad = new Squad(maxSize, squadName, squadCause);

        scanner.nextLine(); // Consume newline

        System.out.println("\nSquad created:");
        System.out.println("Name: " + squad.getName());
        System.out.println("Cause: " + squad.getCause());
        System.out.println("Max Size: " + squad.getMaxSize());

        while (squad.getCurrentSize() < squad.getMaxSize()) {
            System.out.println("\nEnter hero details:");

            System.out.print("Enter hero name: ");
            String heroName = scanner.nextLine();

            System.out.print("Enter hero age: ");
            int heroAge = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter hero special power: ");
            String specialPower = scanner.nextLine();

            System.out.print("Enter hero weakness: ");
            String weakness = scanner.nextLine();

            Hero hero = new Hero(heroAge, heroName, specialPower, weakness);
            if (squad.addHero(hero)) {
                System.out.println("Hero added to the squad!");
            } else {
                System.out.println("Squad is full. Hero could not be added.");
                break;
            }
        }

        scanner.close();
    }
}
