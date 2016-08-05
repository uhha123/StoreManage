package store.adapter.dashboard;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import manage.store.vn.storemanage.R;

/**
 * Created by mobit on 05/08/2016.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private List<String> titles;
    private List<Integer> colors;

    public Adapter(List<String> titles, List<Integer> colors) {
        this.titles = titles;
        this.colors = colors;
    }

    public Adapter(List<String> titles) {
        this.titles = titles;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard_adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.crd.setCardBackgroundColor(colors.get(position));
        holder.tvTitle.setText(titles.get(position));
    }

    @Override
    public int getItemCount() {
        return (titles != null) ? titles.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.crd_dash)
        CardView crd;
        @Bind(R.id.iv_dash_thumnail)
        ImageView ivThumbnail;
        @Bind(R.id.tv_dash_title)
        TextView tvTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
