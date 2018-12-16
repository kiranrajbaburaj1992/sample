package ocsgroup.com.mmmbeach.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ocsgroup.com.mmmbeach.Models.TabModel;
import ocsgroup.com.mmmbeach.R;

/**
 * Created by sanju on 8/31/2017.
 */

public class TabAdapter extends RecyclerView.Adapter<TabAdapter.RecyclerViewHolders> {

    private List<TabModel> itemList;
    private Context context;

    public TabAdapter(Context context, List<TabModel> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_recycler, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.beachName.setText(itemList.get(position).getName());
        holder.beachDist.setText(itemList.get(position).getdist());
        holder.beachRating.setRating(itemList.get(position).getrating());
        holder.beachPhoto.setImageResource(itemList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView beachName;
        public TextView beachDist;
        public RatingBar beachRating;
        public ImageView beachPhoto;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            beachName = (TextView)itemView.findViewById(R.id.beach_name);
            beachDist = (TextView)itemView.findViewById(R.id.beach_dist);
            beachRating = (RatingBar) itemView.findViewById(R.id.beach_rating);
            beachPhoto = (ImageView)itemView.findViewById(R.id.beach_photo);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked Beach Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}