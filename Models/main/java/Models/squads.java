package Models;

import java.util.ArrayList;
import java.util.List;


//Initialize the squads and features of each squad
public class squads {
    private String name;
    private String cause;
    private int maxSize;
    private ArrayList<heroes> heroes;
    private static ArrayList<squads> squadInstances = new ArrayList<>();
    private int id;

    public squads(String name, String cause, int size, ArrayList<heroes> heroes){
        this.name =name;
        this.cause=cause;
        this.maxSize=size;
        this.heroes=heroes;
        squadInstances.add(this);
        this.id = squadInstances.size();
    }

    public String getName() {
        return this.name;
    }

    public String getCause() {
        return this.cause;
    }

    public int getSize() {
        return this.maxSize;
    }

    public ArrayList<heroes> getHeroes() {
        return this.heroes;
    }

    public static ArrayList<squads> getSquadInstances() {
        return squadInstances;
    }

    public int setId(int id) {
        return this.id=id;
    }

    public static void clearAllSquads() {
        squadInstances.clear();
    }

    public static squads findById(int id) {
        try {
            return squadInstances.get(id-1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public int getId() {
        return id;
    }
}