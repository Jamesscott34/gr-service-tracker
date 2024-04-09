// Generated by view binder compiler. Do not edit!
package com.jamesscott.servicetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ReportsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final EditText editTextCompany;

  @NonNull
  public final EditText editTextCustomer;

  @NonNull
  public final EditText editTextDate;

  @NonNull
  public final EditText editTextFindings;

  @NonNull
  public final EditText editTextFollowUp;

  @NonNull
  public final EditText editTextMaterialsUsed;

  @NonNull
  public final EditText editTextRecommendations;

  @NonNull
  public final EditText editTextSign;

  @NonNull
  public final EditText editTextVisitPurpose;

  @NonNull
  public final TextView textViewReports;

  @NonNull
  public final TextView textViewTitle;

  @NonNull
  public final ConstraintLayout viewPager;

  private ReportsBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonAdd,
      @NonNull Button buttonHome, @NonNull EditText editTextCompany,
      @NonNull EditText editTextCustomer, @NonNull EditText editTextDate,
      @NonNull EditText editTextFindings, @NonNull EditText editTextFollowUp,
      @NonNull EditText editTextMaterialsUsed, @NonNull EditText editTextRecommendations,
      @NonNull EditText editTextSign, @NonNull EditText editTextVisitPurpose,
      @NonNull TextView textViewReports, @NonNull TextView textViewTitle,
      @NonNull ConstraintLayout viewPager) {
    this.rootView = rootView;
    this.buttonAdd = buttonAdd;
    this.buttonHome = buttonHome;
    this.editTextCompany = editTextCompany;
    this.editTextCustomer = editTextCustomer;
    this.editTextDate = editTextDate;
    this.editTextFindings = editTextFindings;
    this.editTextFollowUp = editTextFollowUp;
    this.editTextMaterialsUsed = editTextMaterialsUsed;
    this.editTextRecommendations = editTextRecommendations;
    this.editTextSign = editTextSign;
    this.editTextVisitPurpose = editTextVisitPurpose;
    this.textViewReports = textViewReports;
    this.textViewTitle = textViewTitle;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReportsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReportsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.reports, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReportsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAdd;
      Button buttonAdd = ViewBindings.findChildViewById(rootView, id);
      if (buttonAdd == null) {
        break missingId;
      }

      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.editTextCompany;
      EditText editTextCompany = ViewBindings.findChildViewById(rootView, id);
      if (editTextCompany == null) {
        break missingId;
      }

      id = R.id.editTextCustomer;
      EditText editTextCustomer = ViewBindings.findChildViewById(rootView, id);
      if (editTextCustomer == null) {
        break missingId;
      }

      id = R.id.editTextDate;
      EditText editTextDate = ViewBindings.findChildViewById(rootView, id);
      if (editTextDate == null) {
        break missingId;
      }

      id = R.id.editTextFindings;
      EditText editTextFindings = ViewBindings.findChildViewById(rootView, id);
      if (editTextFindings == null) {
        break missingId;
      }

      id = R.id.editTextFollowUp;
      EditText editTextFollowUp = ViewBindings.findChildViewById(rootView, id);
      if (editTextFollowUp == null) {
        break missingId;
      }

      id = R.id.editTextMaterialsUsed;
      EditText editTextMaterialsUsed = ViewBindings.findChildViewById(rootView, id);
      if (editTextMaterialsUsed == null) {
        break missingId;
      }

      id = R.id.editTextRecommendations;
      EditText editTextRecommendations = ViewBindings.findChildViewById(rootView, id);
      if (editTextRecommendations == null) {
        break missingId;
      }

      id = R.id.editTextSign;
      EditText editTextSign = ViewBindings.findChildViewById(rootView, id);
      if (editTextSign == null) {
        break missingId;
      }

      id = R.id.editTextVisitPurpose;
      EditText editTextVisitPurpose = ViewBindings.findChildViewById(rootView, id);
      if (editTextVisitPurpose == null) {
        break missingId;
      }

      id = R.id.textViewReports;
      TextView textViewReports = ViewBindings.findChildViewById(rootView, id);
      if (textViewReports == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      ConstraintLayout viewPager = (ConstraintLayout) rootView;

      return new ReportsBinding((ConstraintLayout) rootView, buttonAdd, buttonHome, editTextCompany,
          editTextCustomer, editTextDate, editTextFindings, editTextFollowUp, editTextMaterialsUsed,
          editTextRecommendations, editTextSign, editTextVisitPurpose, textViewReports,
          textViewTitle, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
