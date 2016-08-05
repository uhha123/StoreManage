package store.ui.dashboard.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import manage.store.vn.storemanage.R;
import store.adapter.dashboard.Adapter;
import store.adapter.layout.CustomGridLayoutManager;
import store.base.BaseActivity;

public class DashboardActivity extends BaseActivity {

    private CustomGridLayoutManager gridLayoutManager;

    @Bind(R.id.rv_dashboard)
    RecyclerView rvDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        setupUI();
        fillData();
    }

    private void setupUI(){
        if (isLandscape){
            gridLayoutManager = new CustomGridLayoutManager(3);
        }else {
            gridLayoutManager = new CustomGridLayoutManager(2);
        }
        rvDashboard.setLayoutManager(gridLayoutManager);
    }

    private void fillData() {
        List<String> titles = new ArrayList<>();
        List<Integer> colors = new ArrayList<>();
        titles.add("Trò chơi");
        titles.add("Giải trí");
        titles.add("Nhạc & Video");
        titles.add("Cá nhân hóa");
        titles.add("Nhiếp ảnh");
        titles.add("Năng suất");
        titles.add("Giáo dục & e-book");
        titles.add("Phong cách sống");
        titles.add("Công cụ");
        titles.add("Xã hội và truyền thông");
        colors.add(getResources().getColor(R.color.dash_card_blue));
        colors.add(getResources().getColor(R.color.dash_card_pink));
        colors.add(getResources().getColor(R.color.dash_card_orange));
        colors.add(getResources().getColor(R.color.dash_card_green));
        colors.add(getResources().getColor(R.color.dash_card_blue_dark));
        colors.add(getResources().getColor(R.color.dash_card_red));
        colors.add(getResources().getColor(R.color.dash_card_green_dark));
        colors.add(getResources().getColor(R.color.dash_card_violet));
        colors.add(getResources().getColor(R.color.dash_card_yellow));
        colors.add(getResources().getColor(R.color.dash_card_pink));

        Adapter adapter = new Adapter(titles, colors);
        rvDashboard.setAdapter(adapter);
    }
}
