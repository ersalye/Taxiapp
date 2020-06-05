package com.tranzeet.app.ui.fragment.searching;

import com.tranzeet.app.base.MvpView;

public interface SearchingIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);
}
