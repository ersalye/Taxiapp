package com.tranzeet.app.ui.activity.card;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.Card;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface CardsIView extends MvpView {
    void onSuccess(List<Card> cardList);

    void onError(Throwable e);
}
