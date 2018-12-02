package io.github.sangsoonam.textutils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

public class LoginPresenter {

    private LoginView mLoginView;

    public LoginPresenter(@NonNull LoginView loginView) {
        mLoginView = loginView;
    }

    public void onEmailTextChanged(@Nullable String email) {
        if (TextUtils.isEmpty(email)) {
            mLoginView.hideNextButton();
        } else {
            mLoginView.showNextButton();
        }
    }
}
