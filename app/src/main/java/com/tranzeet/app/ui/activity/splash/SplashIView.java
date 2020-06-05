package com.tranzeet.app.ui.activity.splash;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.CheckVersion;
import com.tranzeet.app.data.network.model.Service;
import com.tranzeet.app.data.network.model.User;

import java.util.List;

public interface SplashIView extends MvpView {

    void onSuccess(List<Service> serviceList);

    void onSuccess(User user);

    void onError(Throwable e);

    void onSuccess(CheckVersion checkVersion);
}
