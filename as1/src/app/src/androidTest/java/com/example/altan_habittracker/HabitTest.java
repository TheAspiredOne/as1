package com.example.altan_habittracker;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Avery on 10/3/2016.
 */
public class HabitTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public HabitTest() {
        super(MainActivity.class);
    }

    //testing habit addition
    public void testAddHabit(){
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
        assertTrue("Habit does not contain the right habit name ", habitName.equals(newHabit.getName()));
        assertTrue("Habit does not contain th right description", description.equals(newHabit.getDescription()));
        assertTrue("Habit does not show being chosen to be done on the right days", monday == newHabit.getDatesToBeCompleted().get(0));
        assertTrue("Habit does not show being chosen to be done on the right days", tuesday == newHabit.getDatesToBeCompleted().get(1));
        assertTrue("Habit does not show being chosen to be done on the right days", wednesday == newHabit.getDatesToBeCompleted().get(2));
        assertTrue("Habit does not show being chosen to be done on the right days", thursday == newHabit.getDatesToBeCompleted().get(3));
        assertTrue("Habit does not show being chosen to be done on the right days", friday == newHabit.getDatesToBeCompleted().get(4));
        assertTrue("Habit does not show being chosen to be done on the right days", saturday == newHabit.getDatesToBeCompleted().get(5));
        assertTrue("Habit does not show being chosen to be done on the right days", sunday == newHabit.getDatesToBeCompleted().get(6));
    }
}
