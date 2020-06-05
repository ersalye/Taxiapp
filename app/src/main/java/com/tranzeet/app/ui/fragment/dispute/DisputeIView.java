package com.tranzeet.app.ui.fragment.dispute;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.DisputeResponse;
import com.tranzeet.app.data.network.model.Help;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccess(Object object);

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onError(Throwable e);

    void onSuccess(Help help);
}
