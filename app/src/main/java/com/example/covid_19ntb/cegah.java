package com.example.covid_19ntb;

import android.os.Bundle;
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

public class cegah extends Fragment {
    TextView cegah,a,b,c,d,e,f,g;
    DatabaseReference reff;

    public cegah() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_cegah, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        cegah = getActivity().findViewById(R.id.cegah) ;
        a =getActivity().findViewById(R.id.a);
        b =getActivity().findViewById(R.id.b);
        c =getActivity().findViewById(R.id.c);
        d =getActivity().findViewById(R.id.d);
        e =getActivity().findViewById(R.id.e);
        f =getActivity().findViewById(R.id.f);
        g =getActivity().findViewById(R.id.g);


        reff= FirebaseDatabase.getInstance().getReference();
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String ceg =dataSnapshot.child("cegah").getValue().toString();
                String a1 =dataSnapshot.child("a").getValue().toString();
                String b1 =dataSnapshot.child("b").getValue().toString();
                String c1 =dataSnapshot.child("c").getValue().toString();
                String d1 =dataSnapshot.child("d").getValue().toString();
                String e1 =dataSnapshot.child("e").getValue().toString();
                String f1 =dataSnapshot.child("f").getValue().toString();
                String g1 =dataSnapshot.child("g").getValue().toString();

                cegah.setText(ceg);
                a.setText(a1);
                b.setText(b1);
                c.setText(c1);
                d.setText(d1);
                e.setText(e1);
                f.setText(f1);
                g.setText(g1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}