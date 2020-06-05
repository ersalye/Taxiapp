package com.tranzeet.app.ui.fragment.invoice;

import com.tranzeet.app.base.MvpPresenter;

import java.util.HashMap;

public interface InvoiceIPresenter<V extends InvoiceIView> extends MvpPresenter<V> {
    void payment(HashMap<String, Object> obj);

    void updateRide(HashMap<String, Object> obj);

    void payuMoneyChecksum();

    void paytmCheckSum(String request_id, String paymentmode);

    void getBrainTreeToken();

    void updatePayment(HashMap<String, Object> obj);


}
