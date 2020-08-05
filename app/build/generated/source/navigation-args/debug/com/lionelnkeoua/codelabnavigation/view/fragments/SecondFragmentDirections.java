package com.lionelnkeoua.codelabnavigation.view.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.lionelnkeoua.codelabnavigation.R;

public class SecondFragmentDirections {
  private SecondFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSecondfragmentToThirdfragment() {
    return new ActionOnlyNavDirections(R.id.action_secondfragment_to_thirdfragment);
  }

  @NonNull
  public static NavDirections actionSecondfragmentToFirstfragment() {
    return new ActionOnlyNavDirections(R.id.action_secondfragment_to_firstfragment);
  }
}
