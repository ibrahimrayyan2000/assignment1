package com.example.fitlifetracker;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import com.example.fitlifetracker.models.Exercise;
import com.example.fitlifetracker.adapters.ExerciseAdapter;


public class ExerciseListActivity extends AppCompatActivity {

    private ListView exerciseListView;
    private ExerciseAdapter exerciseAdapter;
    private ArrayList<Exercise> exerciseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);


        exerciseListView = findViewById(R.id.exerciseListView);


        String keyword = getIntent().getStringExtra("keyword");
        String category = getIntent().getStringExtra("category");
        String difficulty = getIntent().getStringExtra("difficulty");
        boolean requiresEquipment = getIntent().getBooleanExtra("requiresEquipment", false);


        exerciseList = Exercise.getMockExercises(keyword, category, difficulty, requiresEquipment);


        exerciseAdapter = new ExerciseAdapter(this, exerciseList);
        exerciseListView.setAdapter(exerciseAdapter);


        exerciseListView.setOnItemClickListener((parent, view, position, id) -> {


            Exercise selectedExercise = exerciseList.get(position);

            Toast.makeText(ExerciseListActivity.this, selectedExercise.getName(), Toast.LENGTH_SHORT).show();
        });
    }
}
