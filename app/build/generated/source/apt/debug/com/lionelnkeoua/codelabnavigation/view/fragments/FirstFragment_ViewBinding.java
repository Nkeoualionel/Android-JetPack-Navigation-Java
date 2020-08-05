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

public class FirstFragment_ViewBinding implements Unbinder {
  private FirstFragment target;

  private View view7f08004b;

  @UiThread
  public FirstFragment_ViewBinding(final FirstFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_next, "method 'nexFragment'");
    view7f08004b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.nexFragment();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f08004b.setOnClickListener(null);
    view7f08004b = null;
  }
}
