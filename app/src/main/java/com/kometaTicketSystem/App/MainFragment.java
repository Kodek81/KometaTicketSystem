package com.kometaTicketSystem.App;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.drawerNavigation.app.R;


public class MainFragment extends Fragment {

    private static final String TAG = MainFragment.class.getName();

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View mainView = inflater
                .inflate(R.layout.main_fragment, container, false);


        return mainView;
    }
}
