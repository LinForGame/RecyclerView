package a20180322.recyclerview;

import android.support.v4.app.Fragment;

/**
 * Created by WHY on 2018/3/22.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
