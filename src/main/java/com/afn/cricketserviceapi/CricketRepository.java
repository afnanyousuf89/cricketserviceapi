package com.afn.cricketserviceapi;

import java.util.Collection;
import java.util.HashMap;

public class CricketRepository implements ICricket<Player> {

    private HashMap<Integer, Player> repository;


    public CricketRepository(){
        repository = new HashMap<>();
        //repository.put(1,new Player(1, "Javed Miandad", "Pakistan", 37.2f, 5));
        //repository.put(2,new Player(2, "Amir Sohail", "Pakistan", 31f, 50));
    }


    @Override
    public void save(Player t) {
        repository.put(t.getId(), t);
    }

    @Override
    public Collection<Player> viewAll() {
       return repository.values();
    }

    @Override
    public void update(Player t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Player t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
