package com.lionelnkeoua.codelabnavigation.view.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.lionelnkeoua.codelabnavigation.R;

public class FirstFragmentDirections {
  private FirstFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFirstfragmentToSecondfragment() {
    return new ActionOnlyNavDirections(R.id.action_firstfragment_to_secondfragment);
  }
}
