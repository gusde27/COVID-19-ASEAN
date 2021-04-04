package com.example.covid_19ntb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        Home homeFragment = new Home();

        // transaksi fragment menggunakan fragment manager
        fragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, homeFragment, Home.class.getSimpleName())
                .commit();
    }
}
