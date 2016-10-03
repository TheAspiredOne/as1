package com.example.altan_habittracker;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Avery on 10/2/2016.
 */
public class Habit {
    //define and initialize class attributes
    private String habitName;
    private Date creationDate;
    private String description;
    private boolean monday = false;
    private boolean tuesday = false;
    private boolean wednesday = false;
    private boolean thursday = false;
    private boolean friday = false;
    private boolean saturday = false;
    private boolean sunday = false;
    private int timeCompleted;
    private ArrayList<Date> datesCompleted;

    //coonstructor for habits class
    public Habit(String name, String descrption, boolean mon, boolean tues, boolean wed, boolean thur, boolean fri, boolean sat, boolean sun){
        this.habitName = name;
        this.description = descrption;
        this.creationDate = new Date();
        this.datesCompleted = new ArrayList<Date>();
        this.monday = mon;
        this.tuesday = tues;
        this.wednesday = wed;
        this.thursday = thur;
        this.friday = fri;
        this.saturday = sat;
        this.sunday = sun;
        this.timeCompleted = 0;
    }

    //returns name of habit
    public String getName() {
        return habitName;
    }
    
    //returns description of habit
    public String getDescription(){return description;}

    //specifies function to increment habit counter and add a new record of completion
    public void performHabit(){
        this.timeCompleted += 1;
        Date date = new Date();
        //add date to datesCompleted
        this.datesCompleted.add(date);
    }

    //returns the number of total times habit is completed
    public int getCompletedCount(){
        return timeCompleted;
    }

    //gets a list of dates which the habit was completed
    public ArrayList<Date> getPastCompletions(){
        return datesCompleted;
    }

    //adds boolean values corresponding to days in which habits are to be completed
    public ArrayList<Boolean> getDatesToBeCompleted() {
        ArrayList<Boolean> dates = new ArrayList<Boolean>();
        dates.add(monday);
        dates.add(tuesday);
        dates.add(wednesday);
        dates.add(thursday);
        dates.add(friday);
        dates.add(saturday);
        dates.add(sunday);
        return dates;
    }

    //returns the creation date
    public Date getFirstDate() {
        return creationDate;
    }


}
