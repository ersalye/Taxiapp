package com.tranzeet.app.ui.activity.location_pick;

import com.tranzeet.app.base.MvpPresenter;

public interface LocationPickIPresenter<V extends LocationPickIView> extends MvpPresenter<V> {
    void address();
}
