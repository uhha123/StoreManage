package store.adapter.layout;

import android.support.v7.widget.StaggeredGridLayoutManager;

/**
 * Created by apple on 12/21/15.
 */
public class CustomGridLayoutManager extends StaggeredGridLayoutManager {

    public CustomGridLayoutManager(int spanCount) {
        super(spanCount, StaggeredGridLayoutManager.VERTICAL);
    }
}
