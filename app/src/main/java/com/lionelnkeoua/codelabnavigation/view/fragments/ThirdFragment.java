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
public class ThirdFragment extends Fragment {

    View view;
    NavController navController;
    Button btn;
    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_third, container, false);
        btn = view.findViewById(R.id.btn_previous);

        final NavDirections direction1 = ThirdFragmentDirections.actionThirdfragmentToSecondfragment();
        navController = Navigation.findNavController(getActivity(), R.id.nav_graph_host);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                previousFragment(direction1);


                //Hi here
            }
        });
        return view;
    }

    public void previousFragment(NavDirections navDirections){
        navController.navigate(navDirections);
    }
}
