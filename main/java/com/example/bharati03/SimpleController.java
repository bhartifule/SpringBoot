package com.example.bharati03;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//http://localhost:8080/bharti
public class SimpleController {
    @GetMapping("bharti")
    public String SayHii() {

        return " Hii Bharti Fule";
    }
// http://localhost:8080/searh?q=ram -> query parameter
    @GetMapping("/searh")
    public String searchAWord(@RequestParam String q) {
        DataStore db = new DataStore();
        return db.getfromDB(q);

    }
// http://localhost:8080/users/2 -> get the data by using the id
    @GetMapping("/users/{id}")
    public user getAuser(@PathVariable int id) {
        DBuser db = new DBuser();
        return db.getAuser(id);
    }
   // http://localhost:8080/user?q=Ramu -> get the data by using name and using query parameter
    @GetMapping("/user")
    public user getAuser(@RequestParam String q) {
        DBuser db = new DBuser();
        return db.getAuser(q);
    }
    //http://localhost:8080/userss -> all data of the list
    @GetMapping("/userss")
    public List<user> getAllTable(){
        DBuser db = new DBuser();
        return db.getAllTable();
    }
    // POST API
 @PostMapping("userg")
    public user createUser(@RequestBody user user){
     DBuser db = new DBuser();
     return db.addUser(user);
 }

}