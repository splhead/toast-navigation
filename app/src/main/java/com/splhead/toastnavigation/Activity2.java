package com.splhead.toastnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.splhead.toastnavigation.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bBack.setOnClickListener(v -> this.finish());
    }
}