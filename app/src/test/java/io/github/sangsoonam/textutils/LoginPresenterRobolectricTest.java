package io.github.sangsoonam.textutils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class LoginPresenterRobolectricTest {

    private LoginView mView;
    private LoginPresenter mPresenter;

    @Before
    public void setUp() {
        mView = mock(LoginView.class);
        mPresenter = new LoginPresenter(mView);
    }

    @Test
    public void shouldShowNextButton_whenHaveEmail() {
        mPresenter.onEmailTextChanged("EMAIL");
        verify(mView).showNextButton();
    }

    @Test
    public void shouldHideNextButton_whenEmptyEmail() {
        mPresenter.onEmailTextChanged("");
        verify(mView).hideNextButton();
    }

    @Test
    public void shouldHideNextButton_whenNullEmail() {
        mPresenter.onEmailTextChanged(null);
        verify(mView).hideNextButton();
    }
}