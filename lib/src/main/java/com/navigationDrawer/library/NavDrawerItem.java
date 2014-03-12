package com.navigationDrawer.library;

public interface NavDrawerItem {

	public int getId();
	
	public int getLabel();
	
	public int getType();

	public boolean updateActionBarTitle();

    public boolean isCheckable();
}
