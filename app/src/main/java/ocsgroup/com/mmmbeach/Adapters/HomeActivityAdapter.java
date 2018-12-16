package ocsgroup.com.mmmbeach.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import ocsgroup.com.mmmbeach.Models.HomeActivityModel;
import ocsgroup.com.mmmbeach.R;
import ocsgroup.com.mmmbeach.Widgets.CircleImageView;

/**
 * Created by sanju on 8/29/2017.
 */



public class HomeActivityAdapter extends RecyclerView.Adapter<HomeActivityAdapter.MyViewHolder> {

    private ArrayList<HomeActivityModel> dataSet;
    Context mContext;
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView massager_name ;
        TextView time;
        TextView review;
        TextView activity_info;
        TextView activity_desc;
        ImageView activity_icon;
        CircleImageView massager_image;
        RatingBar rating;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.massager_name = (TextView) itemView.findViewById(R.id.massager_name);
            this.time = (TextView) itemView.findViewById(R.id.time);
            this.review = (TextView) itemView.findViewById(R.id.activity_review);
            this.activity_info = (TextView) itemView.findViewById(R.id.activity_info);
            this.activity_desc = (TextView) itemView.findViewById(R.id.activity_desc);
            this.activity_icon = (ImageView) itemView.findViewById(R.id.activity_icon);
            this.rating = (RatingBar) itemView.findViewById(R.id.massager_rating);
            this.massager_image = (CircleImageView) itemView.findViewById(R.id.massager_image);
        }
    }

    public HomeActivityAdapter(Context mContext, ArrayList<HomeActivityModel> data) {
        this.dataSet = data;
        this.mContext=mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_recycler, parent, false);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        if(dataSet.get(listPosition).getdesc().equals("")){
            holder.review.setVisibility(View.VISIBLE);
            holder.activity_info.setVisibility(View.VISIBLE);
            holder.activity_desc.setVisibility(View.INVISIBLE);
        }
        else{
            holder.review.setVisibility(View.INVISIBLE);
            holder.activity_info.setVisibility(View.INVISIBLE);
            holder.activity_desc.setVisibility(View.VISIBLE);
        }
        if(dataSet.get(listPosition).getrating()==0){
            holder.rating.setVisibility(View.INVISIBLE);
        }
        else{
            holder.rating.setVisibility(View.VISIBLE);
        }
        holder.massager_name.setText(dataSet.get(listPosition).getName());
        holder.time.setText(dataSet.get(listPosition).gettime());
        holder.massager_image.setImageResource(dataSet.get(listPosition).getImage());
        holder.review.setText(dataSet.get(listPosition).getreview());
        holder.activity_desc.setText(dataSet.get(listPosition).getdesc());
        holder.activity_info.setText(dataSet.get(listPosition).getinfo());
        holder.rating.setRating(dataSet.get(listPosition).getrating());
        System.out.println("Myicon:"+dataSet.get(listPosition).geticon());
        holder.activity_icon.setImageResource(dataSet.get(listPosition).geticon());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}