package com.tranzeet.app.ui.activity.help;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help help);

    void onError(Throwable e);
}
