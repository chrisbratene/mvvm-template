package com.duyp.architecture.mvvm.ui.modules.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;

import com.duyp.architecture.mvvm.data.local.user.UserManager;
import com.duyp.architecture.mvvm.injection.Injectable;
import com.duyp.architecture.mvvm.ui.navigator.NavigatorHelper;

import javax.inject.Inject;

/**
 * Created by duypham on 10/21/17.
 *
 */

public class SplashActivity extends AppCompatActivity implements Injectable {

    @VisibleForTesting
    @Inject
    UserManager userManager;

    @Inject
    NavigatorHelper navigatorHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (userManager.checkForSavedUserAndStartSessionIfHas()) {
            navigatorHelper.navigateMainActivity(true);
        } else {
            navigatorHelper.navigateLoginActivity(true);
        }
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }
}
