package com.tranzeet.app.ui.activity.wallet;

import com.appoets.paytmpayment.PaytmObject;
import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.AddWallet;
import com.tranzeet.app.data.network.model.BrainTreeResponse;

public interface WalletIView extends MvpView {
    void onSuccess(AddWallet object);

    void onSuccess(PaytmObject object);

    void onSuccess(BrainTreeResponse response);
    void onError(Throwable e);
}
