package com.example.covid_19ntb;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class retrive extends Fragment {
    TextView corona;
    TextView sebar;
    TextView gejala;
    DatabaseReference reff;

    public retrive() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_retrive, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        corona = getActivity().findViewById(R.id.corona) ;
        sebar =getActivity().findViewById(R.id.sebar);
        gejala =getActivity().findViewById(R.id.gejala);


        reff= FirebaseDatabase.getInstance().getReference();
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String cor =dataSnapshot.child("corona").getValue().toString();
                String seb =dataSnapshot.child("sebar").getValue().toString();
                String gej =dataSnapshot.child("gejala").getValue().toString();

                corona.setText(cor);
                sebar.setText(seb);
                gejala.setText(gej);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
