package com.example.firstapphomework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerView rvCar;
    private ArrayList<String> carList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCar = requireView().findViewById(R.id.rv_car);
        loadData();
        CarAdapter carAdapter = new CarAdapter(carList);
        rvCar.setAdapter(carAdapter);

    }

    private void loadData() {
        carList.add("Mercedes");
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Hyundai");
        carList.add("AUDI");
        carList.add("Tesla");
        carList.add("Toyota");
        carList.add("Porsche");
        carList.add("Pagani");
        carList.add("Bugatti");
        carList.add("McLaren");
    }
}