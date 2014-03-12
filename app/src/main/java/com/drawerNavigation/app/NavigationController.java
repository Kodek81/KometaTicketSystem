package com.drawerNavigation.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;


import com.navigationDrawer.library.AbstractNavDrawerActivity;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class NavigationController {

    public static final String HOME_FRAGMENT_TAG = "home";

	@Inject public NavigationController() {
		
	}
	
	public void startAppRating(Context context) {
		context.startActivity(new Intent(Intent.ACTION_VIEW, Uri
				.parse("market://details?id=" + context.getPackageName())));
	}

    public void goHomeFragment( AbstractNavDrawerActivity activity) {
        activity.getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new MainFragment(), HOME_FRAGMENT_TAG).commit();
        activity.setTitleWithDrawerTitle();
    }

    public void confirmEulaAndShowChangeLog(FragmentActivity activity) {

    }

	public void confirmEula(FragmentActivity activity) {

	}

	public void showEula(FragmentActivity activity) {

	}

    public void showWhatsNew( YourAppMainActivity activity ) {

    }

    public void showChangeLog( FragmentActivity activity ) {

    }

	public void showExitDialog(final FragmentActivity activity) {
    }

    public void showSettings(FragmentActivity activity) {

    }
}
