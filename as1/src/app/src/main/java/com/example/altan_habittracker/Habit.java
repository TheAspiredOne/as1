package com.example.altan_habittracker;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Avery on 10/2/2016.
 */
public class Habit {
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

    public String getName() {
        return habitName;
    }

    public String getDescription(){return description;}

    public void performHabit(){
        this.timeCompleted += 1;
        Date date = new Date();
        //add date to datesCompleted
        this.datesCompleted.add(date);
    }

    public int getCompletedCount(){
        return timeCompleted;
    }

    public ArrayList<Date> getPastCompletions(){
        return datesCompleted;
    }

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

    public Date getFirstDate() {
        return creationDate;
    }


}
