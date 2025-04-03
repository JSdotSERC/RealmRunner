package com.example.realmrunner.ui.page_uc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageUCViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PageUCViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}