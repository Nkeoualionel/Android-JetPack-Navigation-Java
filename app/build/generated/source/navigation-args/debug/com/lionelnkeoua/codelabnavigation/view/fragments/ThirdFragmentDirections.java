package com.lionelnkeoua.codelabnavigation.view.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.lionelnkeoua.codelabnavigation.R;

public class ThirdFragmentDirections {
  private ThirdFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionThirdfragmentToSecondfragment() {
    return new ActionOnlyNavDirections(R.id.action_thirdfragment_to_secondfragment);
  }
}
