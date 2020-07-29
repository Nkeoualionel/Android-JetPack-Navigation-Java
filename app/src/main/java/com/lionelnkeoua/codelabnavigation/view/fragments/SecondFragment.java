package com.lionelnkeoua.codelabnavigation.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lionelnkeoua.codelabnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    View view;
    NavController navController;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @OnClick(R.id.btn_next)
    public void nextFragment(){
        navController.navigate(R.id.action_secondfragment_to_thirdfragment);
    }

    @OnClick(R.id.btn_previous)
    public void previousFragment(){
        navController.navigate(R.id.action_secondfragment_to_firstfragment);
    }
}
