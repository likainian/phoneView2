// Generated code from Butter Knife. Do not modify!
package com.example.nan.myphonestate.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class BatteryFragment$$ViewInjector<T extends com.example.nan.myphonestate.ui.fragment.BatteryFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492992, "field 'mScrollView'");
    target.mScrollView = finder.castView(view, 2131492992, "field 'mScrollView'");
    view = finder.findRequiredView(source, 2131492993, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131492993, "field 'mRecyclerView'");
  }

  @Override public void reset(T target) {
    target.mScrollView = null;
    target.mRecyclerView = null;
  }
}
