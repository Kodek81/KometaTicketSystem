package com.drawerNavigation.app;


import com.navigationDrawer.library.MCXApplication;

import dagger.ObjectGraph;

public class KometaBillingApplication extends MCXApplication {

    public static final String LOG_TAG = "YAI";

    private boolean syncAdapterRunning = false;


    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public void onObjectGraphCreated(ObjectGraph objectGraph) {
        super.onObjectGraphCreated(objectGraph);

    }

    public boolean isSyncAdapterRunning() {
        return syncAdapterRunning;
    }

    public void setSyncAdapterRunning(boolean syncAdapterRunning) {
        this.syncAdapterRunning = syncAdapterRunning;
    }
}
