package com.example.fitlifetracker.models;

import java.util.ArrayList;

public class Exercise {

    private String name;
    private String category;
    private String difficulty;
    private boolean requiresEquipment;

    public Exercise(String name, String category, String difficulty, boolean requiresEquipment) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
        this.requiresEquipment = requiresEquipment;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public boolean isRequiresEquipment() {
        return requiresEquipment;
    }

    public static ArrayList<Exercise> getMockExercises(String keyword, String category, String difficulty, boolean requiresEquipment) {
        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(new Exercise("Push-Up", "Strength", "Easy", false));
        exercises.add(new Exercise("Pull-Up", "Strength", "Hard", true));
        exercises.add(new Exercise("Jumping Jacks", "Cardio", "Easy", false));
        exercises.add(new Exercise("Burpees", "Cardio", "Hard", false));
        exercises.add(new Exercise("Yoga Stretch", "Flexibility", "Medium", false));
        exercises.add(new Exercise("Dumbbell Curls", "Strength", "Medium", true));
        exercises.add(new Exercise("Running", "Cardio", "Medium", false));
        exercises.add(new Exercise("Plank", "Strength", "Medium", false));
        exercises.add(new Exercise("Cycling", "Cardio", "Easy", true));
        exercises.add(new Exercise("Pilates", "Flexibility", "Hard", false));
        exercises.add(new Exercise("Squat", "Strength", "Easy", false));
        exercises.add(new Exercise("Lunges", "Strength", "Medium", false));
        exercises.add(new Exercise("Mountain Climbers", "Cardio", "Hard", false));
        exercises.add(new Exercise("Leg Raises", "Strength", "Medium", false));
        exercises.add(new Exercise("High Knees", "Cardio", "Easy", false));
        exercises.add(new Exercise("Tricep Dips", "Strength", "Medium", true));
        exercises.add(new Exercise("Jump Rope", "Cardio", "Hard", true));
        exercises.add(new Exercise("Side Plank", "Strength", "Hard", false));
        exercises.add(new Exercise("Wall Sit", "Strength", "Medium", false));
        exercises.add(new Exercise("Step-Ups", "Strength", "Easy", true));
        exercises.add(new Exercise("Box Jumps", "Cardio", "Hard", true));
        exercises.add(new Exercise("Russian Twists", "Strength", "Medium", false));
        exercises.add(new Exercise("Flutter Kicks", "Cardio", "Easy", false));
        exercises.add(new Exercise("Bicycle Crunches", "Strength", "Medium", false));
        exercises.add(new Exercise("Deadlift", "Strength", "Hard", true));
        exercises.add(new Exercise("Bench Press", "Strength", "Hard", true));
        exercises.add(new Exercise("Treadmill Sprint", "Cardio", "Hard", true));
        exercises.add(new Exercise("Elliptical Trainer", "Cardio", "Medium", true));
        exercises.add(new Exercise("Resistance Band Rows", "Strength", "Medium", true));
        exercises.add(new Exercise("Kettlebell Swings", "Strength", "Hard", true));
        exercises.add(new Exercise("Jump Squats", "Cardio", "Hard", false));
        exercises.add(new Exercise("Medicine Ball Slams", "Strength", "Hard", true));

        ArrayList<Exercise> filteredExercises = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if ((keyword.isEmpty() || exercise.getName().toLowerCase().contains(keyword.toLowerCase()))
                    && (category.equals("Any") || exercise.getCategory().equals(category))
                    && (difficulty.equals("Any") || exercise.getDifficulty().equals(difficulty))
                    && (!requiresEquipment || exercise.isRequiresEquipment())) {
                filteredExercises.add(exercise);
            }
        }
        return filteredExercises;
    }
}
