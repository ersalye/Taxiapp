package com.tranzeet.app.ui.activity.setting;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.AddressResponse;

public interface SettingsIView extends MvpView {

    void onSuccessAddress(Object object);

    void onLanguageChanged(Object object);

    void onSuccess(AddressResponse address);

    void onError(Throwable e);
}
