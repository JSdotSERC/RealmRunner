package com.example.realmrunner.ui.compete;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CompeteViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CompeteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("COMPETE");
    }

    public LiveData<String> getText() {
        return mText;
    }
}