package com.tranzeet.app.ui.activity.notification_manager;

import com.tranzeet.app.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
