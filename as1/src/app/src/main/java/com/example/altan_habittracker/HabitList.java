package com.example.altan_habittracker;

import java.util.ArrayList;

/**
 * Created by Avery on 10/2/2016.
 */
//list that stores instances of habits
public class HabitList {
    //constructor
    public ArrayList<Habit> myNewHabitList = new ArrayList<Habit>();

    //return the list of current actively recorded habits
    public ArrayList<Habit> getHabitList() {
        return myNewHabitList;
    }

    //adds a habit to habitlist so it can be tracked
    public void addHabit(Habit newHabit) {
        myNewHabitList.add(newHabit);
    }

    //returns whether a habit is contained within a habitlist
    public boolean contains(Habit newHabit) {
        return myNewHabitList.contains(newHabit);
    }
}
