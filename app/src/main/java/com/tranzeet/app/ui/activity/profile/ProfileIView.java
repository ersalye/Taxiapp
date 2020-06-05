package com.tranzeet.app.ui.activity.profile;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.User;

public interface ProfileIView extends MvpView {

    void onSuccess(User user);

    void onUpdateSuccess(User user);

    void onError(Throwable e);

    void onSuccessPhoneNumber(Object object);

    void onVerifyPhoneNumberError(Throwable e);
}
