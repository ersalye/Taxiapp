package com.tranzeet.app.ui.fragment.book_ride;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.PromoResponse;


public interface BookRideIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);

    void onSuccessCoupon(PromoResponse promoResponse);
}
