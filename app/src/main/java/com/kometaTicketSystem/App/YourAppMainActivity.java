package com.kometaTicketSystem.App;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


import com.drawerNavigation.app.R;
import com.kometaTicketSystem.Lib.AbstractNavDrawerActivity;
import com.kometaTicketSystem.Lib.NavDrawerActivityConfiguration;
import com.kometaTicketSystem.Lib.NavDrawerAdapter;
import com.kometaTicketSystem.Lib.NavDrawerItem;
import com.kometaTicketSystem.Lib.NavMenuBuilder;


public class YourAppMainActivity extends AbstractNavDrawerActivity {

    public static final String HOME_FRAGMENT_TAG = "home";
    private static final String TAG = YourAppMainActivity.class.getName();
    private NavigationController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        this.navController = new NavigationController();

        if (savedInstanceState == null) {

            navController.goHomeFragment(this);

            setTitleWithDrawerTitle();

            //this.navController.showWhatsNew(this);

        }

    }

    @Override
    protected NavDrawerActivityConfiguration getNavDrawerConfiguration() {


        NavDrawerItem[] menu = new NavMenuBuilder()
                .addSection(100,    R.string.menuLateral_miCuenta)
                .addSectionItem(104, R.string.menuLateral_misDatos, R.drawable.navdrawer_tutorial, true, true)
                .addSectionItem(101, R.string.menuLateral_Settings, R.drawable.navdrawer_friends, true, true)
                .addSection(100,    R.string.menuLateral_Tickets)
                .addSectionItem(102, R.string.menuLaterlal_Comprar, R.drawable.navdrawer_airport, true, true)
                .addSectionItem(105, R.string.menuLateral_misTickets, R.drawable.navdrawer_aroundme, true, true)
                .addSection(250, R.string.menuLaterlal_Sala)
                .addSectionItem(201, R.string.menuLaterlal_Contactanos, R.drawable.navdrawer_settings, true, true)
                .addSectionItem(202, R.string.navdrawer_ComoLlegar, R.drawable.navdrawer_rating, false, false)
                .build();

        NavDrawerActivityConfiguration navDrawerActivityConfiguration = new NavDrawerActivityConfiguration.Builder()
                .mainLayout(R.layout.main)
                .drawerLayoutId(R.id.drawer_layout)
                .leftDrawerId(R.id.left_drawer)
                .menu(menu)
                .drawerShadow(R.drawable.drawer_shadow)
                .drawerCloseDesc(R.string.drawer_close)
                .drawerOpenDesc(R.string.drawer_open)
                .adapter(new NavDrawerAdapter(this, R.layout.navdrawer_item, menu))
                .drawerIcon(R.drawable.ic_drawer)
                .build();


        return navDrawerActivityConfiguration;
    }

    @Override
    protected void onNavItemSelected(int id) {
        switch (id) {
            case 101:
                break;
            case 102:
                break;
            case 103:
                break;
            case 104:
                break;
            case 105:

                break;
            case 201:
                break;
            case 202:
                break;
            case 203:

                break;
            case 204:

                break;
            case 205:

                break;
            case 206:

                break;
        }
    }

    @Override
    public void onBackPressed() {

        // See bug: http://stackoverflow.com/questions/13418436/android-4-2-back-stack-behaviour-with-nested-fragments/14030872#14030872
        // If the fragment exists and has some back-stack entry
        FragmentManager fm = getSupportFragmentManager();
        Fragment currentFragment = fm.findFragmentById(R.id.content_frame);
        if (currentFragment != null && currentFragment.getChildFragmentManager().getBackStackEntryCount() > 0) {
            // Get the fragment fragment manager - and pop the backstack
            currentFragment.getChildFragmentManager().popBackStack();
        }
        // Else, nothing in the direct fragment back stack
        else {
            if (currentFragment != null) {
                if (!NavigationController.HOME_FRAGMENT_TAG.equals(currentFragment.getTag())) {
                    this.navController.goHomeFragment(this);
                } else {
                    super.onBackPressed();
                }
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    public void onPause() {
        super.onPause();


    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }


}
