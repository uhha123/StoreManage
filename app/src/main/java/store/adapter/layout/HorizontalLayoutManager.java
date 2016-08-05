package store.adapter.layout;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by apple on 12/16/15.
 */
public class HorizontalLayoutManager extends LinearLayoutManager {

    public HorizontalLayoutManager(Context context) {
        super(context, LinearLayoutManager.HORIZONTAL, false);
    }
}
