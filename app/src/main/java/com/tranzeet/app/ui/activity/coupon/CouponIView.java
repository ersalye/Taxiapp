package com.tranzeet.app.ui.activity.coupon;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.PromoResponse;

public interface CouponIView extends MvpView {
    void onSuccess(PromoResponse object);

    void onError(Throwable e);
}
