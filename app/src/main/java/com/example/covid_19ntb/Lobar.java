package com.example.covid_19ntb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class Lobar extends Fragment {

    private TextView indonesia;

    public Lobar() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_lobar, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        indonesia = getActivity().findViewById(R.id.indonesia);

        Retrofit retro = new Retrofit.Builder()
                .baseUrl("https://api.covid19api.com/live/country/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderAPI jsonPlace = retro.create(JsonPlaceHolderAPI.class);

        Call<List<Data>> call = jsonPlace.getData();

        call.enqueue(new Callback<List<Data>>(){
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                if(!response.isSuccessful()) {
                    indonesia.setText("Code : "+ response.code());
                    return;
                }

                List<Data> data1 = response.body();

                for(Data data : data1) {
                    String content ="";
                    content += "Tanggal : " + data.getDate() + "\n";
                    content += "Terkonfirmasi : " + data.getConfirmed() + "\n";
                    content += "Meninggal : " + data.getDeaths() + "\n";
                    content += "Sembuh : " + data.getRecovered() + "\n";
                    content += "Aktif : " + data.getActive() + "\n\n";


                    indonesia.append(content);

                }

            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                indonesia.setText(t.getMessage());
            }
        });




    }



}
