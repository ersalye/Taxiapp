package com.tranzeet.app.ui.activity.upcoming_trip_detail;

import com.tranzeet.app.base.MvpPresenter;

public interface UpcomingTripDetailsIPresenter<V extends UpcomingTripDetailsIView> extends MvpPresenter<V> {

    void getUpcomingTripDetails(Integer requestId);
}
