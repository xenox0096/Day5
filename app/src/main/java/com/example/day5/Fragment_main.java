package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class Fragment_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);}

    public void inbox(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentlayout, Inbox_fragment.class, null)
                .setReorderingAllowed(true)
                .addToBackStack(null) // Name can be null
                .commit();


    }

    public void sent(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentlayout, Sent_fragment.class, null)
                .setReorderingAllowed(true)
                .addToBackStack(null) // Name can be null
                .commit();
    }

    public void spam(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentlayout, Spam_fragment.class, null)
                .setReorderingAllowed(true)
                .addToBackStack(null) // Name can be null
                .commit();
    }
}