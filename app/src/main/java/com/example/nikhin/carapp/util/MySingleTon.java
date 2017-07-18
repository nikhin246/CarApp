package com.example.nikhin.carapp.util;

/**
 * Created by Nikhin on 5/8/2017.
 */

public class MySingleTon {


    public static String make;
    public static String model;
    public static String year;
    private static MySingleTon instance;


    private MySingleTon() {
    }

    public static MySingleTon instance()
        {
            //if no instance is initialized yet then create new instance
            //else return stored instance
            if (instance == null)
            {
                instance = new MySingleTon();
            }
            return instance;
        }

}
