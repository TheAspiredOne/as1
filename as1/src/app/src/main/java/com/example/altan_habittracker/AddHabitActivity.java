package com.example.altan_habittracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Avery on 10/2/2016.
 */
public class AddHabitActivity extends AppCompatActivity {
    //add attributes of activity
    private EditText habitName;
    private EditText habitDescription;
    private CheckBox mondayCheckBox;
    private CheckBox tuesdayCheckBox;
    private CheckBox wednesdayCheckBox;
    private CheckBox thursdayCheckBox;
    private CheckBox fridayCheckBox;
    private CheckBox saturdayCheckBox;
    private CheckBox sundayCheckBox;

    //using booleans to hold the dates when habits should be completed
    private boolean mon = false;
    private boolean tues = false;
    private boolean wed = false;
    private boolean thur = false;
    private boolean fri = false;
    private boolean sat = false;
    private boolean sun = false;
    
    //specify onCreate function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.habit_input);

        habitName = (EditText) findViewById(R.id.habitInputText);
        habitDescription = (EditText) findViewById(R.id.habitDescriptionText);
        mondayCheckBox = (CheckBox) findViewById(R.id.checkBoxMonday);
        tuesdayCheckBox = (CheckBox) findViewById(R.id.checkBoxTuesday);
        wednesdayCheckBox = (CheckBox) findViewById(R.id.checkBoxWednesday);
        thursdayCheckBox = (CheckBox) findViewById(R.id.checkBoxThursday);
        fridayCheckBox = (CheckBox) findViewById(R.id.checkBoxFriday);
        saturdayCheckBox = (CheckBox) findViewById(R.id.checkBoxSaturday);
        sundayCheckBox = (CheckBox) findViewById(R.id.checkBoxSunday);
    }
    
    //parses habit attributes to be passed into a Habit List
    public void addHabitOption(View v){
        if (v.getId() == R.id.donButton) {
            Toast.makeText(this,"adding new habit", Toast.LENGTH_SHORT).show();
            String nameHabit = habitName.getText().toString();
            String descrp = habitDescription.getText().toString();
            if (mondayCheckBox.isChecked()) {
                mon = true;
            }
            if (tuesdayCheckBox.isChecked()) {
                tues = true;
            }
            if (wednesdayCheckBox.isChecked()) {
                wed = true;
            }
            if (thursdayCheckBox.isChecked()) {
                thur = true;
            }
            if (fridayCheckBox.isChecked()) {
                fri = true;
            }
            if (saturdayCheckBox.isChecked()) {
                sat = true;
            }
            if (sundayCheckBox.isChecked()) {
                sun = true;
            }

            //creating new habit that will be added to instance of HabitList
            Habit newHabit = new Habit(nameHabit,descrp, mon, tues, wed,thur, fri, sat, sun);
            MainActivity.myNewHabitsList.addHabit(newHabit);
            //habitTrackerActivity.myHabitsList.add(newHabit);
            finish();

        }

    }

}
