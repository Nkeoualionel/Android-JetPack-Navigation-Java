package com.lionelnkeoua.codelabnavigation.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lionelnkeoua.codelabnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    View view;
    NavController navController;
    Button btnNext, btnPrev;
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        btnNext = view.findViewById(R.id.btn_next);
        btnPrev = view.findViewById(R.id.btn_previous);

        final NavDirections direction1 = SecondFragmentDirections.actionSecondfragmentToThirdfragment();
        final NavDirections direction2 = SecondFragmentDirections.actionSecondfragmentToFirstfragment();
        navController = Navigation.findNavController(getActivity(), R.id.nav_graph_host);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment(direction1);
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousFragment(direction2);
            }
        });
        return view;
    }

    public void nextFragment(NavDirections navDirections){
        navController.navigate(navDirections);
    }

    public void previousFragment(NavDirections navDirections){
        navController.navigate(navDirections);
    }
}
