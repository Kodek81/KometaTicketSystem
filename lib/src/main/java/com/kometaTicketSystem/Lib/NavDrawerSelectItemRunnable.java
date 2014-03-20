package com.kometaTicketSystem.Lib;

public class NavDrawerSelectItemRunnable implements Runnable {

    private final int itemId;
    private AbstractNavDrawerActivity activity;

    public NavDrawerSelectItemRunnable(AbstractNavDrawerActivity act, int itemId) {
        this.activity = act;
        this.itemId = itemId;
    }

    @Override
    public void run() {
        activity.selectItem(itemId);
    }
}
