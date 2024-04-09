// Generated by view binder compiler. Do not edit!
package com.jamesscott.servicetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
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

public final class DatesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final EditText editTextAddress;

  @NonNull
  public final EditText editTextNextVisitDate;

  @NonNull
  public final Spinner spinnerCustomer;

  @NonNull
  public final TextView textViewDates;

  @NonNull
  public final TextView textViewTitle;

  private DatesBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonHome,
      @NonNull EditText editTextAddress, @NonNull EditText editTextNextVisitDate,
      @NonNull Spinner spinnerCustomer, @NonNull TextView textViewDates,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.buttonHome = buttonHome;
    this.editTextAddress = editTextAddress;
    this.editTextNextVisitDate = editTextNextVisitDate;
    this.spinnerCustomer = spinnerCustomer;
    this.textViewDates = textViewDates;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DatesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DatesBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.dates, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DatesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.editTextAddress;
      EditText editTextAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextAddress == null) {
        break missingId;
      }

      id = R.id.editTextNextVisitDate;
      EditText editTextNextVisitDate = ViewBindings.findChildViewById(rootView, id);
      if (editTextNextVisitDate == null) {
        break missingId;
      }

      id = R.id.spinnerCustomer;
      Spinner spinnerCustomer = ViewBindings.findChildViewById(rootView, id);
      if (spinnerCustomer == null) {
        break missingId;
      }

      id = R.id.textViewDates;
      TextView textViewDates = ViewBindings.findChildViewById(rootView, id);
      if (textViewDates == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new DatesBinding((ConstraintLayout) rootView, buttonHome, editTextAddress,
          editTextNextVisitDate, spinnerCustomer, textViewDates, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}