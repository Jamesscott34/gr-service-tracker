package com.jamesscott.servicetracker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class EmailHandler {

    private Context context;

    public EmailHandler(Context context) {
        this.context = context;
    }

    public void sendEmail(String[] recipientEmails, String subject, String body) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, recipientEmails);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);
        if (emailIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(emailIntent);
        }
    }
}


