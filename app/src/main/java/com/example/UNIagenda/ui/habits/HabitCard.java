package com.example.UNIagenda.ui.habits;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.UNIagenda.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HabitCard#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class HabitCard extends Fragment {

    private String habitName;
    private boolean isChecked;

    public HabitCard(String habitName, boolean isChecked) {
        this.habitName = habitName;
        this.isChecked = isChecked;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_habit_card, container, false);
        this.initCard(v);
        return v;
    }

    private void initCard(View v) {
        if(this.habitName != null){
            CheckBox isChecked = v.findViewById(R.id.cb_habitName);
            TextView habitName = v.findViewById(R.id.tv_habitName);

            isChecked.setChecked(this.isChecked);
            habitName.setText(this.habitName);

        }

    }
}