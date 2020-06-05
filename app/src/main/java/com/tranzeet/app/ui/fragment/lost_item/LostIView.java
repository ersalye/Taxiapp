package com.tranzeet.app.ui.fragment.lost_item;

import com.tranzeet.app.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface LostIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
