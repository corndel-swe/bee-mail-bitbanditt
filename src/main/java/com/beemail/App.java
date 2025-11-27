package com.beemail;

public class App {

    private static App instance;

    // create empty constructor
    private App () {};

    // getter
    public static App getInstance() {
        if (instance == null) {instance = new App();}
        return instance;}

    // user class



}
