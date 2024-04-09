// Generated by view binder compiler. Do not edit!
package com.jamesscott.servicetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jamesscott.servicetracker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonDates;

  @NonNull
  public final Button buttonEmail;

  @NonNull
  public final Button buttonJobs;

  @NonNull
  public final Button buttonJobsCustomer;

  @NonNull
  public final Button buttonReports;

  @NonNull
  public final Button buttonVisit;

  @NonNull
  public final Button buttonWorkList;

  @NonNull
  public final LinearLayout buttonsLayout;

  @NonNull
  public final TextView textViewGoodRiddance;

  @NonNull
  public final ConstraintLayout viewPager;

  private MainBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonAdd,
      @NonNull Button buttonDates, @NonNull Button buttonEmail, @NonNull Button buttonJobs,
      @NonNull Button buttonJobsCustomer, @NonNull Button buttonReports,
      @NonNull Button buttonVisit, @NonNull Button buttonWorkList,
      @NonNull LinearLayout buttonsLayout, @NonNull TextView textViewGoodRiddance,
      @NonNull ConstraintLayout viewPager) {
    this.rootView = rootView;
    this.buttonAdd = buttonAdd;
    this.buttonDates = buttonDates;
    this.buttonEmail = buttonEmail;
    this.buttonJobs = buttonJobs;
    this.buttonJobsCustomer = buttonJobsCustomer;
    this.buttonReports = buttonReports;
    this.buttonVisit = buttonVisit;
    this.buttonWorkList = buttonWorkList;
    this.buttonsLayout = buttonsLayout;
    this.textViewGoodRiddance = textViewGoodRiddance;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAdd;
      Button buttonAdd = ViewBindings.findChildViewById(rootView, id);
      if (buttonAdd == null) {
        break missingId;
      }

      id = R.id.buttonDates;
      Button buttonDates = ViewBindings.findChildViewById(rootView, id);
      if (buttonDates == null) {
        break missingId;
      }

      id = R.id.buttonEmail;
      Button buttonEmail = ViewBindings.findChildViewById(rootView, id);
      if (buttonEmail == null) {
        break missingId;
      }

      id = R.id.buttonJobs;
      Button buttonJobs = ViewBindings.findChildViewById(rootView, id);
      if (buttonJobs == null) {
        break missingId;
      }

      id = R.id.buttonJobsCustomer;
      Button buttonJobsCustomer = ViewBindings.findChildViewById(rootView, id);
      if (buttonJobsCustomer == null) {
        break missingId;
      }

      id = R.id.buttonReports;
      Button buttonReports = ViewBindings.findChildViewById(rootView, id);
      if (buttonReports == null) {
        break missingId;
      }

      id = R.id.buttonVisit;
      Button buttonVisit = ViewBindings.findChildViewById(rootView, id);
      if (buttonVisit == null) {
        break missingId;
      }

      id = R.id.buttonWorkList;
      Button buttonWorkList = ViewBindings.findChildViewById(rootView, id);
      if (buttonWorkList == null) {
        break missingId;
      }

      id = R.id.buttonsLayout;
      LinearLayout buttonsLayout = ViewBindings.findChildViewById(rootView, id);
      if (buttonsLayout == null) {
        break missingId;
      }

      id = R.id.textViewGoodRiddance;
      TextView textViewGoodRiddance = ViewBindings.findChildViewById(rootView, id);
      if (textViewGoodRiddance == null) {
        break missingId;
      }

      ConstraintLayout viewPager = (ConstraintLayout) rootView;

      return new MainBinding((ConstraintLayout) rootView, buttonAdd, buttonDates, buttonEmail,
          buttonJobs, buttonJobsCustomer, buttonReports, buttonVisit, buttonWorkList, buttonsLayout,
          textViewGoodRiddance, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
