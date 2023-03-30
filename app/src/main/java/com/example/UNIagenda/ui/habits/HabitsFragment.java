package com.example.UNIagenda.ui.habits;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.UNIagenda.R;
import com.example.UNIagenda.databinding.FragmentNotificationsBinding;

public class HabitsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        HabitsViewModel habitsViewModel = new ViewModelProvider(this).get(HabitsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);

        this.generateHabitListView(binding);

        return binding.getRoot();
    }

    private void generateHabitListView(FragmentNotificationsBinding binding) {
        int i;
        LinearLayout habitList = (LinearLayout) binding.getRoot().findViewById(R.id.llHabitList);
        FragmentManager fragmentManager = getChildFragmentManager();



        for(i=0; i < 10; i++){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            String cardName = "Habito" + i;
            boolean isCk = (i%2 == 0);
            HabitCard habit = new HabitCard(cardName, isCk);
            fragmentTransaction.add(R.id.llHabitList, habit);

            fragmentTransaction.commit();
        }


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}