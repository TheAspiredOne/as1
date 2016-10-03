package com.example.altan_habittracker;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Avery on 10/3/2016.
 */
public class HabitListTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public HabitListTest() {
        super(MainActivity.class);
    }

    //testing habit addition to habit list
    public void addHabitToHabitListTest(){
        HabitList newHabitList = new HabitList();
        String habitName = "wash the dishes";
        String description = "I want to wash dishes more often";
        boolean monday = true;
        boolean tuesday = false;
        boolean wednesday = true;
        boolean thursday = false;
        boolean friday = true;
        boolean saturday = false;
        boolean sunday = false;
        Habit newHabit = new Habit(habitName, description, monday, tuesday, wednesday, thursday, friday, saturday, sunday);
        newHabitList.addHabit(newHabit);
        assertTrue("habit list does not contain habit!!", newHabitList.contains(newHabit));
    }


}
