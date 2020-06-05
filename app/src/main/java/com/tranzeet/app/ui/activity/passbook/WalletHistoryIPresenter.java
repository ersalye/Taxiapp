package com.tranzeet.app.ui.activity.passbook;

import com.tranzeet.app.base.MvpPresenter;

public interface WalletHistoryIPresenter<V extends WalletHistoryIView> extends MvpPresenter<V> {
    void wallet();
}
