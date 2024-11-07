package com.example.fitlifetracker;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;


public class SearchActivity extends AppCompatActivity {

    private EditText keywordEditText;
    private Spinner categorySpinner;
    private RadioButton easyRadioButton, mediumRadioButton, hardRadioButton;
    private CheckBox equipmentCheckBox;
    private Button searchExercisesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        keywordEditText = findViewById(R.id.keywordEditText);
        categorySpinner = findViewById(R.id.categorySpinner);
        easyRadioButton = findViewById(R.id.easyRadioButton);
        mediumRadioButton = findViewById(R.id.mediumRadioButton);
        hardRadioButton = findViewById(R.id.hardRadioButton);
        equipmentCheckBox = findViewById(R.id.equipmentCheckBox);
        searchExercisesButton = findViewById(R.id.searchExercisesButton);


        searchExercisesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String keyword = keywordEditText.getText().toString();
                String category = categorySpinner.getSelectedItem().toString();
                String difficulty = getSelectedDifficulty();
                boolean requiresEquipment = equipmentCheckBox.isChecked();

                Intent intent = new Intent(SearchActivity.this, ExerciseListActivity.class);
                intent.putExtra("keyword", keyword);
                intent.putExtra("category", category);
                intent.putExtra("difficulty", difficulty);
                intent.putExtra("requiresEquipment", requiresEquipment);
                startActivity(intent);
            }
        });
    }

    private String getSelectedDifficulty() {
        if (easyRadioButton.isChecked()) {
            return "Easy";
        } else if (mediumRadioButton.isChecked()) {
            return "Medium";
        } else if (hardRadioButton.isChecked()) {
            return "Hard";
        }
        return "Any";
    }
}
