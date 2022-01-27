package com.example.linux;

import org.springframework.stereotype.Service;
// Service handles "heavy duty"
@Service
public class MonsterService {
    public Monster getNewMonster(){
        Monster monster = new Monster("Otus", 12, true);
        return monster;
    }
}

