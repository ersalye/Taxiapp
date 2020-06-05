package com.tranzeet.app.ui.activity.notification_manager;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> notificationManager);

    void onError(Throwable e);

}