package com.tranzeet.app.ui.fragment.cancel_ride;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.CancelResponse;

import java.util.List;

public interface CancelRideIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);

    void onSuccess(List<CancelResponse> response);

    void onReasonError(Throwable e);
}
