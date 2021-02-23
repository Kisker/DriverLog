package net.learn2develop.driverlog;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import net.learn2develop.driverlog.databinding.Details1Binding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Details1Binding binding;


    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Details1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Details> detailsList = new ArrayList<>();

        detailsList.add(new Details("SB", "49 mi NNE Fallon, NV", "17.08.2021", "00:00", "02:15", getDrawable(R.drawable.bed_bold), getDrawable(R.drawable.form_bold), getDrawable(R.drawable.form_color), getDrawable(R.drawable.home_bold)));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(detailsList);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
       binding.recyclerView.setAdapter(adapter);


    }
}