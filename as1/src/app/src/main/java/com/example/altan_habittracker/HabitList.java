package com.example.altan_habittracker;

import java.util.ArrayList;

/**
 * Created by Avery on 10/2/2016.
 */
public class HabitList {
    public ArrayList<Habit> myNewHabitList = new ArrayList<Habit>();


    public ArrayList<Habit> getHabitList() {
        return myNewHabitList;
    }

    public void addHabit(Habit newHabit) {
        myNewHabitList.add(newHabit);
    }

    public boolean contains(Habit newHabit) {
        return myNewHabitList.contains(newHabit);
    }
}
