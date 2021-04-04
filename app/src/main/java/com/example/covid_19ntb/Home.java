package com.example.covid_19ntb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    CardView lobar, singapore, malaysia, thailand, vietnam, pilipina, myanmar, kamboja, retrive,cegah1;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lobar = view.findViewById(R.id.lobar);
        singapore = view.findViewById(R.id.singapore);
        malaysia = view.findViewById(R.id.malay);
        thailand = view.findViewById(R.id.thai);
        vietnam = view.findViewById(R.id.viet);
        pilipina = view.findViewById(R.id.pilip);
        myanmar = view.findViewById(R.id.myan);
        kamboja = view.findViewById(R.id.kamb);
        retrive = view.findViewById(R.id.testing);
        cegah1 = view.findViewById(R.id.cegah12);


        lobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Lobar lobar = new Lobar();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, lobar, Lobar.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Singapore singapore = new Singapore();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, singapore, Singapore.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        malaysia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Malaysia malaysia = new Malaysia();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, malaysia, Malaysia.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        thailand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Thailand thailand = new Thailand();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, thailand, Thailand.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        vietnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Vietnam vietnam = new Vietnam();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, vietnam, Vietnam.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        pilipina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Pilipina pilipina = new Pilipina();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, pilipina, Pilipina.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        myanmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Myanmar myanmar = new Myanmar();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, myanmar, Myanmar.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        kamboja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                Kamboja kamboja = new Kamboja();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, kamboja, Kamboja.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        retrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                retrive ambil = new retrive();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, ambil, retrive.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

        cegah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // inisialisasi fragment manager di dalam fragment
                FragmentManager fragmentManager = getFragmentManager();
                cegah take = new cegah();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, take, cegah.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

}
