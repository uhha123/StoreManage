package store.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.j256.ormlite.android.apptools.OpenHelperManager;

import manage.store.vn.storemanage.R;


/**
 * Created by apple on 12/15/15.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public boolean isLandscape;
    //DatabaseHelper databaseHelper = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isLandscape = getResources().getBoolean(R.bool.landscape_mode);
    }

    protected void addFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.add(containerViewId, fragment);
        transaction.commit();
    }

    protected void replaceFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(containerViewId, fragment);
        transaction.commit();
    }

    protected void replaceFragment(int containerViewId, Fragment fragment, int type) {
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(containerViewId, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    protected void removeFragment(int id){
        if (getSupportFragmentManager().findFragmentById(id) != null) {
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragment = fm.findFragmentById(id);
            FragmentTransaction ft = fm.beginTransaction();
            ft.remove(fragment);
            ft.commit();
        }else {
            finish();
        }
    }

//    public DatabaseHelper getDatabaseHelper() {
//        if (databaseHelper == null) {
//            databaseHelper = OpenHelperManager.getHelper(getApplicationContext(), DatabaseHelper.class);
//        }
//
//        return databaseHelper;
//    }
}
