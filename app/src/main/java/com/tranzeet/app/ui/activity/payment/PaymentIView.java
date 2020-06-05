package com.tranzeet.app.ui.activity.payment;

import com.appoets.paytmpayment.PaytmObject;
import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.BrainTreeResponse;
import com.tranzeet.app.data.network.model.Card;
import com.tranzeet.app.data.network.model.CheckSumData;

import java.util.List;

public interface PaymentIView extends MvpView {

    void onSuccess(Object card);

    void onSuccess(BrainTreeResponse response);

    void onSuccess(List<Card> cards);

    void onAddCardSuccess(Object cards);

    void onError(Throwable e);

    void onPayumoneyCheckSumSucess(CheckSumData checkSumData);

    void onPayTmCheckSumSuccess(PaytmObject payTmResponse);

}
