package com.example.bharati03;

import java.util.ArrayList;
import java.util.List;

public class DBuser {
    private List<user> userTable = new ArrayList<user>();

    public DBuser() {
        userTable.add(new user(1, "Ramu", 40));
        userTable.add(new user(2, "Ram", 30));

    }

    public List<user> getAllTable() {
        return userTable;
    }

    public user getAuser(int id) {

        for (user user : userTable) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public user getAuser(String name) {

        for (user user : userTable) {
            if (user.getName().equals(name) )
                return user;
        }
        return null;
    }
    public user addUser(user user){
        userTable.add(user);
        return user;
    }
}