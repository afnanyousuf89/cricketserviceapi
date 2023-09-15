package com.afn.cricketserviceapi;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("cricket")
public class CricketController {
   
    CricketRepository repo;

    public CricketController(){
        repo = new CricketRepository();
    }

    @GetMapping("all")
    public Collection<Player> getAll(){
        return repo.viewAll();
    }


    @PostMapping("add")
    public String addplayer(@RequestBody Player p){
        repo.save(p);
        return "Player Saved as "+p.getName();
    }


}
