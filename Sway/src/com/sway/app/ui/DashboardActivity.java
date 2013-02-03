package com.sway.app.ui;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Window;
import com.stackmob.android.sdk.common.StackMobAndroid;
import com.sway.app.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.ArrayAdapter;

public class DashboardActivity extends SherlockFragmentActivity implements
		ActionBar.OnNavigationListener {

	private static final String TAG = DashboardActivity.class.getSimpleName();
	
	private static final int MAPS_POS = 0;
	private static final int MYLIST_POS = 1;
	private static final int FRIENDSLIST_POS = 2;
	
	private Context _context;
	
	FragmentManager fragmentManager;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
		
		setContentView(R.layout.layout_dashboard);
		
		StackMobAndroid.init(getApplicationContext(), 0, "071cde1e-c24e-4854-a949-8d7e4ee330d1");
		
		_context = getSupportActionBar().getThemedContext();
		fragmentManager = getSupportFragmentManager();
		
        ArrayAdapter<CharSequence> list = ArrayAdapter.createFromResource(_context, R.array.dashboard_nav, R.layout.sherlock_spinner_item);
        list.setDropDownViewResource(R.layout.sherlock_spinner_dropdown_item);

        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        getSupportActionBar().setListNavigationCallbacks(list, this);
        
        
	}

	@Override
	protected void onStart() {
		super.onStart();

	}

	@Override
	public boolean onNavigationItemSelected(int itemPosition, long itemId) {

//		FragmentManager fragmentManager = getSupportFragmentManager();
//		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

		Log.i(TAG, "itemPosition clicked : " + itemPosition);
		
		switch (itemPosition) {
		case MAPS_POS:
			MapsWishFragment mapsListFragment = new MapsWishFragment();
			fragmentManager.beginTransaction().replace(R.id.dashboard_RL, mapsListFragment).commit();
			break;

		case MYLIST_POS:
			MyWishListFragment myListfragment = new MyWishListFragment();
			fragmentManager.beginTransaction().replace(R.id.dashboard_RL, myListfragment).commit();
			break;
			
		case FRIENDSLIST_POS:
			FriendsWishListFragment friendsListfragment = new FriendsWishListFragment();
			fragmentManager.beginTransaction().replace(R.id.dashboard_RL, friendsListfragment).commit();
			break;
			
		}
		
		return true;
	}
}
