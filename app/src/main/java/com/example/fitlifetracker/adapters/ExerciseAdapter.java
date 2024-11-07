package com.example.fitlifetracker.adapters;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.fitlifetracker.R;
import com.example.fitlifetracker.models.Exercise;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class ExerciseAdapter extends ArrayAdapter<Exercise> {

    private Context context;
    private List<Exercise> exercises;

    public ExerciseAdapter(Context context, List<Exercise> exercises) {
        super(context, R.layout.exercise_list_item, exercises);
        this.context = context;
        this.exercises = exercises;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.exercise_list_item, parent, false);
        }

        Exercise exercise = exercises.get(position);

        TextView nameTextView = convertView.findViewById(R.id.exerciseNameTextView);
        TextView detailsTextView = convertView.findViewById(R.id.exerciseDetailsTextView);

        nameTextView.setText(exercise.getName());
        detailsTextView.setText(exercise.getCategory() + " - " + exercise.getDifficulty());

        return convertView;
    }
}
