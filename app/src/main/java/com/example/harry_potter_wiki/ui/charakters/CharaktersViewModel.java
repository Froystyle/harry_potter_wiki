package com.example.harry_potter_wiki.ui.charakters;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CharaktersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CharaktersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}