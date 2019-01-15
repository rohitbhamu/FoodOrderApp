package com.example.rohitkumarbhamu.foodorderapp.Model;

public class User {

    private  String name;
    private  String password;

    public User(String name) {
        name = name;
    }

    public User(String name, String password) {
        name = name;
        password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }
}
