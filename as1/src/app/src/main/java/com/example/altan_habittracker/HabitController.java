package com.example.altan_habittracker;

/**
 * Created by Avery on 10/2/2016.
 */
//supposed to be a controller
public class HabitController {
    private static HabitList habitList = null;
    static public HabitList getHabitList(){
        if (habitList == null){
            habitList = new HabitList();
        }
    return habitList;
    }
}
