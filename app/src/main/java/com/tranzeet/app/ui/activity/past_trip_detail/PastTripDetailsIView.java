package com.tranzeet.app.ui.activity.past_trip_detail;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.Datum;

import java.util.List;

public interface PastTripDetailsIView extends MvpView {

    void onSuccess(List<Datum> pastTripDetails);

    void onError(Throwable e);
}
