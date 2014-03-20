package com.kometaTicketSystem.App;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.util.Log;


import com.drawerNavigation.app.R;
import com.kometaTicketSystem.Lib.AbstractNavDrawerActivity;

import javax.inject.Singleton;


@Singleton
public class NavigationController {

    public static final String HOME_FRAGMENT_TAG = "home";
    private static final String TAG = YourAppMainActivity.class.getName();
	public NavigationController() {
		
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
}
