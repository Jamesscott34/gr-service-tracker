// Generated by view binder compiler. Do not edit!
package com.jamesscott.servicetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jamesscott.servicetracker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EmailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonCancel;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final LinearLayout buttonLayout;

  @NonNull
  public final Button buttonSend;

  @NonNull
  public final EditText editTextAddEmail;

  @NonNull
  public final EditText editTextSendFrom;

  @NonNull
  public final Spinner spinnerCustomer;

  @NonNull
  public final Spinner spinnerEmail;

  @NonNull
  public final Spinner spinnerReports;

  @NonNull
  public final TextView textViewEmail;

  @NonNull
  public final TextView textViewEmails;

  @NonNull
  public final TextView textViewReports;

  @NonNull
  public final TextView textViewTitle;

  private EmailBinding(@NonNull RelativeLayout rootView, @NonNull Button buttonCancel,
      @NonNull Button buttonHome, @NonNull LinearLayout buttonLayout, @NonNull Button buttonSend,
      @NonNull EditText editTextAddEmail, @NonNull EditText editTextSendFrom,
      @NonNull Spinner spinnerCustomer, @NonNull Spinner spinnerEmail,
      @NonNull Spinner spinnerReports, @NonNull TextView textViewEmail,
      @NonNull TextView textViewEmails, @NonNull TextView textViewReports,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.buttonCancel = buttonCancel;
    this.buttonHome = buttonHome;
    this.buttonLayout = buttonLayout;
    this.buttonSend = buttonSend;
    this.editTextAddEmail = editTextAddEmail;
    this.editTextSendFrom = editTextSendFrom;
    this.spinnerCustomer = spinnerCustomer;
    this.spinnerEmail = spinnerEmail;
    this.spinnerReports = spinnerReports;
    this.textViewEmail = textViewEmail;
    this.textViewEmails = textViewEmails;
    this.textViewReports = textViewReports;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EmailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EmailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.email, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EmailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonCancel;
      Button buttonCancel = ViewBindings.findChildViewById(rootView, id);
      if (buttonCancel == null) {
        break missingId;
      }

      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.buttonLayout;
      LinearLayout buttonLayout = ViewBindings.findChildViewById(rootView, id);
      if (buttonLayout == null) {
        break missingId;
      }

      id = R.id.buttonSend;
      Button buttonSend = ViewBindings.findChildViewById(rootView, id);
      if (buttonSend == null) {
        break missingId;
      }

      id = R.id.editTextAddEmail;
      EditText editTextAddEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextAddEmail == null) {
        break missingId;
      }

      id = R.id.editTextSendFrom;
      EditText editTextSendFrom = ViewBindings.findChildViewById(rootView, id);
      if (editTextSendFrom == null) {
        break missingId;
      }

      id = R.id.spinnerCustomer;
      Spinner spinnerCustomer = ViewBindings.findChildViewById(rootView, id);
      if (spinnerCustomer == null) {
        break missingId;
      }

      id = R.id.spinnerEmail;
      Spinner spinnerEmail = ViewBindings.findChildViewById(rootView, id);
      if (spinnerEmail == null) {
        break missingId;
      }

      id = R.id.spinnerReports;
      Spinner spinnerReports = ViewBindings.findChildViewById(rootView, id);
      if (spinnerReports == null) {
        break missingId;
      }

      id = R.id.textViewEmail;
      TextView textViewEmail = ViewBindings.findChildViewById(rootView, id);
      if (textViewEmail == null) {
        break missingId;
      }

      id = R.id.textViewEmails;
      TextView textViewEmails = ViewBindings.findChildViewById(rootView, id);
      if (textViewEmails == null) {
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

      return new EmailBinding((RelativeLayout) rootView, buttonCancel, buttonHome, buttonLayout,
          buttonSend, editTextAddEmail, editTextSendFrom, spinnerCustomer, spinnerEmail,
          spinnerReports, textViewEmail, textViewEmails, textViewReports, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
