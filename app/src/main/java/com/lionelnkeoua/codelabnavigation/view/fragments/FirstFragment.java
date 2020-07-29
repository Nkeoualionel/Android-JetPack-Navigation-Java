package com.lionelnkeoua.codelabnavigation.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lionelnkeoua.codelabnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    NavController navController;
    View view;
    Button button;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
        button = view.findViewById(R.id.btn_next);
        return view;
    }


    @OnClick(R.id.btn_next)
    public void nexFragment(){
        navController.navigate(R.id.action_firstfragment_to_secondfragment);
    }
}
