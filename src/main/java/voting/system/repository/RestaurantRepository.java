package voting.system.repository;

import voting.system.model.Meal;
import voting.system.model.Restaurant;
import voting.system.model.Vote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RestaurantRepository {

    Restaurant save(Restaurant restaurant){
        return restaurant;
    }

    // false if not found
    boolean delete(int id){
        return true;
    }

    int getVoteCountsPerDay(int restourantId){
        return 0;
    }

    List<Meal> getMealList (int restourantId){
        return new ArrayList<>();
    }





}
