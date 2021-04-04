package com.example.covid_19ntb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class Kamboja extends Fragment {

    private TextView kamboja;

    public Kamboja() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_kamboja, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);

        kamboja = getActivity().findViewById(R.id.kamboja);

        Retrofit retro = new Retrofit.Builder()
                .baseUrl("https://api.covid19api.com/live/country/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderAPIKamboja jsonPlace = retro.create(JsonPlaceHolderAPIKamboja.class);

        Call<List<Data>> call = jsonPlace.getData();

        call.enqueue(new Callback<List<Data>>(){
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                if(!response.isSuccessful()) {
                    kamboja.setText("Code : "+ response.code());
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


                    kamboja.append(content);

                }

            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                kamboja.setText(t.getMessage());
            }
        });




    }



}
