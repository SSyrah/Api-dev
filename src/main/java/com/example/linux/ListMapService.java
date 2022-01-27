package com.example.linux;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ListMapService {
    public static ArrayList<String> getList(){
        System.out.println("This is ListMap - service");
        ArrayList<String> list = new ArrayList<>();
        list.add("Heikki");
        list.add("Santeri");
        list.add("Ville");
        return list;
    }

    public static HashMap<String, String> getMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Suomi", "Tampere");
        map.put("Ruotsi", "Tukholma");
        map.put("Hollanti", "Amsterdam");
        return map;
    }
}
