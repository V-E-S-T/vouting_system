package voting.system.repository;

import voting.system.model.Vote;

import java.util.HashSet;

public class VoteRepository {

    HashSet<Vote> getAllVotes(int restourantId){
        return new HashSet<>();
    }

    HashSet<Vote> getVotesPerDay(int restourantId){
        return new HashSet<>();
    }
}
