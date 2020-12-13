package voting.system.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Restaurant {

    private Integer id;
    //one to many relationship by key "restaurantId" in the entity "Meal"
    private ArrayList<Meal> menu = new ArrayList<>();
    private String name;
    //one to many relationship by key "restaurantId" in the entity "Vote"
    private HashSet<Vote> voteHashSet = new HashSet<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public ArrayList<Meal> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public HashSet<Vote> getVoteHashSet() {
        return voteHashSet;
    }

    public void setName(String name) {
        this.name = name;
    }


}
