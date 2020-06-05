package com.tranzeet.app.ui.activity.upcoming_trip_detail;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.Datum;

import java.util.List;

public interface UpcomingTripDetailsIView extends MvpView {

    void onSuccess(List<Datum> upcomingTripDetails);

    void onError(Throwable e);
}
