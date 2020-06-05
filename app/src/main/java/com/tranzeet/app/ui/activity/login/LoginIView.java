package com.tranzeet.app.ui.activity.login;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.ForgotResponse;
import com.tranzeet.app.data.network.model.Token;

public interface LoginIView extends MvpView {
    void onSuccess(Token token);

    void onSuccess(ForgotResponse object);

    void onError(Throwable e);
}
