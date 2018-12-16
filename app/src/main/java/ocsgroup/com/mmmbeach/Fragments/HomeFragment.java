package ocsgroup.com.mmmbeach.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ocsgroup.com.mmmbeach.Adapters.HomeActivityAdapter;
import ocsgroup.com.mmmbeach.Models.HomeActivityModel;
import ocsgroup.com.mmmbeach.R;

/**
 * Created by sanju on 8/23/2017.
 */

public class HomeFragment extends Fragment{
    private static HomeActivityAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<HomeActivityModel> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        data = new ArrayList<HomeActivityModel>();
        data.add(new HomeActivityModel(0,"Sanju","Yesterday",0,"","","What a nice experience.Thank you for the great.I will book massage again",R.drawable.shop_back,R.drawable.fb));
        data.add(new HomeActivityModel(1,"Kiran","Today",5,"Review:May Hampton -","Massage Therapist","",R.drawable.bg_splash,R.drawable.star));
        data.add(new HomeActivityModel(2,"Sharath","Monday",0,"Share:Lady's Mile -","Beach","",R.drawable.welcome_screen1,R.drawable.share));
        adapter = new HomeActivityAdapter(getActivity(),data);
        recyclerView.setAdapter(adapter);
        return view;

    }
}
