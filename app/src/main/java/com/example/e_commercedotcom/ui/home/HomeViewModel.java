package com.example.e_commercedotcom.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aqui a ideia é ter um recycler view com todas as vendas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}