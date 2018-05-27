package com.hilbing.wc2018.mundial2018.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hilbing.wc2018.mundial2018.R;
import com.hilbing.wc2018.mundial2018.adapters.StadiumsAdapter;
import com.hilbing.wc2018.mundial2018.model.Stadium;
import com.hilbing.wc2018.mundial2018.model.WorldCup2018;
import com.hilbing.wc2018.mundial2018.rest.Api;
import com.hilbing.wc2018.mundial2018.rest.ApiClientRetrofit;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentStadiums extends android.support.v4.app.Fragment {

    static final String TAG = FragmentStadiums.class.getSimpleName();
    static final String EXTRA_STADIUM = "stadium";
    private static final String BASE_URL = "https://raw.githubusercontent.com/lsv/fifa-worldcup-2018/master/";


    StadiumsAdapter mAdapter;
    @BindView(R.id.recycler)
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
    ArrayList<Stadium> stadiums = new ArrayList<>();




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stadium, null);

        ButterKnife.bind(this, view);
        initViews();

        return view;


    }

    private void initViews() {
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        loadJSON();
    }

    private void loadJSON() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        api.getData().enqueue(new Callback<WorldCup2018>() {
            @Override
            public void onResponse(Call<WorldCup2018> call, Response<WorldCup2018> response) {
                Log.d(TAG, "DATA: " + response.body());
                Log.d(TAG, "STADIUMS: " + response.body().getStadiums().size());
                int size = response.body().getStadiums().size();
                for (int i = 0; i < size; i++) {
                    Stadium stadium = new Stadium();
                    stadium.setId(response.body().getStadiums().get(i).getId());
                    stadium.setName(response.body().getStadiums().get(i).getName());
                    stadium.setCity(response.body().getStadiums().get(i).getCity());
                    stadium.setLat(response.body().getStadiums().get(i).getLat());
                    stadium.setLng(response.body().getStadiums().get(i).getLng());
                    stadium.setImage(response.body().getStadiums().get(i).getImage());

                    stadiums.add(stadium);

                    Log.d(TAG, "STADIUMS " + stadium.getName());

                }

                mAdapter = new StadiumsAdapter(getContext(), stadiums);
                mAdapter.notifyDataSetChanged();
                mRecyclerView.setAdapter(mAdapter);

            }

            @Override
            public void onFailure(Call<WorldCup2018> call, Throwable t) {
                Log.d(TAG, "ERROR: " + t.getMessage().toString());

            }


        });

    }
}

