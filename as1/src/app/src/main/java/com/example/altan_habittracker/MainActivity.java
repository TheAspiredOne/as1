package com.example.altan_habittracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    public static HabitList myNewHabitsList;
    private ListView oldHabitList;
    private static ArrayAdapter<Habit> adapter;
    private static final String FILENAME = "file.sav";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myNewHabitsList = new HabitList();
        //createHabitListView();
        oldHabitList = (ListView)findViewById(R.id.oldHabitList);




    }

    public void AddHabitActivity(View v){
        if (v.getId() == R.id.addHabitButton) {
            Toast.makeText(getBaseContext(), "add habit selected", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, AddHabitActivity.class);
            startActivity(intent);

        }

    }

//    @Override
//    protected void onStart() {
//        // TODO Auto-generated method stub
//        super.onStart();
//        //loadFromFile();
//        createHabitListView();
//    }



    public void createHabitListView(){
        adapter = new ArrayAdapter<Habit>(this,R.layout.list_habits, (List<Habit>) myNewHabitsList);
        oldHabitList.setAdapter(adapter);

        oldHabitList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "completed", Toast.LENGTH_SHORT).show();

                Habit h = (Habit)oldHabitList.getItemAtPosition(position);
                h.performHabit();
                adapter.notifyDataSetChanged();


            }
        });

    }


//    private void loadFromFile() {
//        try {
//            FileInputStream fis = openFileInput(FILENAME);
//            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
//
//            Gson gson = new Gson();
//
//             Code from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
//            Type listType = new TypeToken<ArrayList<Habit>>(){}.getType();
//
//            myHabitsList = gson.fromJson(in,listType);
//
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            myHabitsList = new HabitList();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            throw new RuntimeException();
//        }
//    }

//    private void saveInFile() {
//        try {
//            FileOutputStream fos = openFileOutput(FILENAME,
//                    0);
//
//            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
//
////            Gson gson = new Gson();
////            gson.toJson(myHabitsList, out);
//            out.flush();
//
//            fos.close();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            throw new RuntimeException();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            throw new RuntimeException();
//        }
//    }
}
