package Models;

import java.util.ArrayList;

//Initialize the heroes attributes 
public class heroes {

    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<heroes> instances = new ArrayList<>();
    private static int id;
    private boolean squadMember;

    public heroes(String name, int age, String power, String weakness) {
        this.name=name;
        this.age=age;
        this.power=power;
        this.weakness=weakness;
        instances.add(this);
        this.id =instances.size();   
    }

    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public String getPower() {
        return this.power;
    }

    public String getWeakness() {
        return this.weakness;
    }

    public static ArrayList<heroes> getAllInstances() {
        return instances;
    }

    public static int getId() {
        return id;
    }

    public boolean isSquadMember() {
        return squadMember;
    }

    public void updateHeroStatus(boolean squadMember){
        this.squadMember=squadMember;
    }

    public void deleteHero() {
        instances.remove(id-1);
    }

    public static void clearAllHeroes() {
        instances.clear();
    }

    public static heroes findById(int id) {
        try {
            return instances.get(id-1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static void setId(int id) {
        heroes.id = id;
    }

}