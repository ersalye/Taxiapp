package com.tranzeet.app.ui.activity.passbook;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.WalletResponse;

public interface WalletHistoryIView extends MvpView {
    void onSuccess(WalletResponse response);

    void onError(Throwable e);
}
