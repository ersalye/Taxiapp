package com.tranzeet.app.ui.activity.invite_friend;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.User;

public interface InviteFriendIView extends MvpView {

    void onSuccess(User user);

    void onError(Throwable e);

}
