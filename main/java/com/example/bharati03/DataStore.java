package com.example.bharati03;

import java.util.HashMap;

public class DataStore {
    private HashMap<String,String> store = new HashMap<String,String>();
    public DataStore(){

        store.put("Sachin", "A great Batsman");
        store.put("ram", "A great singer");
        store.put("karma", "A great man");

    }
    public String getfromDB(String word){

        return store.get(word);
    }
}
