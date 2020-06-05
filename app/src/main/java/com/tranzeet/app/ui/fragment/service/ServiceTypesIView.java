package com.tranzeet.app.ui.fragment.service;

import com.tranzeet.app.base.MvpView;
import com.tranzeet.app.data.network.model.Service;

import java.util.List;

public interface ServiceTypesIView extends MvpView {

    void onSuccess(List<Service> serviceList);

    void onError(Throwable e);

    void onSuccess(Object object);
}
