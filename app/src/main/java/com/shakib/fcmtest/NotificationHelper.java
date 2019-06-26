package com.shakib.fcmtest;

import android.app.NotificationManager;
import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationHelper {

    //Notification Channel
    //Notification Builder
    //Notification Manager

    private static final String CHANNEL_ID = "FCM_ID";
    private static final String CHANNEL_NAME = "FCM";
    private static final String CHANNEL_DESC = "FCM desc";

    public void displayNotification(Context context, String title, String body){

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat mNotificationManager = NotificationManagerCompat.from(context);
        mNotificationManager.notify(1, mBuilder.build());

    }
}
