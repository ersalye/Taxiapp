package com.tranzeet.app.ui.activity.card;

import com.tranzeet.app.base.MvpPresenter;


public interface CarsIPresenter<V extends CardsIView> extends MvpPresenter<V> {
    void card();
}
