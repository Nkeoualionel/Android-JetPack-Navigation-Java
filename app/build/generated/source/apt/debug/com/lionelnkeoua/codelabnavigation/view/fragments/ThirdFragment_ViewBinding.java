// Generated code from Butter Knife. Do not modify!
package com.lionelnkeoua.codelabnavigation.view.fragments;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lionelnkeoua.codelabnavigation.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ThirdFragment_ViewBinding implements Unbinder {
  private ThirdFragment target;

  private View view7f08004c;

  @UiThread
  public ThirdFragment_ViewBinding(final ThirdFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_previous, "method 'previousFragment'");
    view7f08004c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.previousFragment();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f08004c.setOnClickListener(null);
    view7f08004c = null;
  }
}
