// Generated by view binder compiler. Do not edit!
package com.jamesscott.servicetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ViewcustomerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView CompanyCustomer;

  @NonNull
  public final TextView CompanyReports;

  @NonNull
  public final TextView JobWorkCustomer;

  @NonNull
  public final TextView JobWorkReports;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final Spinner spinnerContractCustomers;

  @NonNull
  public final Spinner spinnerContractReports;

  @NonNull
  public final Spinner spinnerJobs;

  @NonNull
  public final Spinner spinnerJobsReport;

  @NonNull
  public final TextView textViewReports;

  @NonNull
  public final TextView textViewTitle;

  @NonNull
  public final ConstraintLayout viewPager;

  private ViewcustomerBinding(@NonNull ConstraintLayout rootView, @NonNull TextView CompanyCustomer,
      @NonNull TextView CompanyReports, @NonNull TextView JobWorkCustomer,
      @NonNull TextView JobWorkReports, @NonNull Button buttonHome,
      @NonNull Spinner spinnerContractCustomers, @NonNull Spinner spinnerContractReports,
      @NonNull Spinner spinnerJobs, @NonNull Spinner spinnerJobsReport,
      @NonNull TextView textViewReports, @NonNull TextView textViewTitle,
      @NonNull ConstraintLayout viewPager) {
    this.rootView = rootView;
    this.CompanyCustomer = CompanyCustomer;
    this.CompanyReports = CompanyReports;
    this.JobWorkCustomer = JobWorkCustomer;
    this.JobWorkReports = JobWorkReports;
    this.buttonHome = buttonHome;
    this.spinnerContractCustomers = spinnerContractCustomers;
    this.spinnerContractReports = spinnerContractReports;
    this.spinnerJobs = spinnerJobs;
    this.spinnerJobsReport = spinnerJobsReport;
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
  public static ViewcustomerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewcustomerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.viewcustomer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewcustomerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CompanyCustomer;
      TextView CompanyCustomer = ViewBindings.findChildViewById(rootView, id);
      if (CompanyCustomer == null) {
        break missingId;
      }

      id = R.id.CompanyReports;
      TextView CompanyReports = ViewBindings.findChildViewById(rootView, id);
      if (CompanyReports == null) {
        break missingId;
      }

      id = R.id.JobWorkCustomer;
      TextView JobWorkCustomer = ViewBindings.findChildViewById(rootView, id);
      if (JobWorkCustomer == null) {
        break missingId;
      }

      id = R.id.JobWorkReports;
      TextView JobWorkReports = ViewBindings.findChildViewById(rootView, id);
      if (JobWorkReports == null) {
        break missingId;
      }

      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.spinnerContractCustomers;
      Spinner spinnerContractCustomers = ViewBindings.findChildViewById(rootView, id);
      if (spinnerContractCustomers == null) {
        break missingId;
      }

      id = R.id.spinnerContractReports;
      Spinner spinnerContractReports = ViewBindings.findChildViewById(rootView, id);
      if (spinnerContractReports == null) {
        break missingId;
      }

      id = R.id.spinnerJobs;
      Spinner spinnerJobs = ViewBindings.findChildViewById(rootView, id);
      if (spinnerJobs == null) {
        break missingId;
      }

      id = R.id.spinnerJobsReport;
      Spinner spinnerJobsReport = ViewBindings.findChildViewById(rootView, id);
      if (spinnerJobsReport == null) {
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

      return new ViewcustomerBinding((ConstraintLayout) rootView, CompanyCustomer, CompanyReports,
          JobWorkCustomer, JobWorkReports, buttonHome, spinnerContractCustomers,
          spinnerContractReports, spinnerJobs, spinnerJobsReport, textViewReports, textViewTitle,
          viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
