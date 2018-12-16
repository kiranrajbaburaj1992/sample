package ocsgroup.com.mmmbeach.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import ocsgroup.com.mmmbeach.Adapters.TabAdapter;
import ocsgroup.com.mmmbeach.Models.TabModel;
import ocsgroup.com.mmmbeach.R;

/**
 * Created by sanju on 8/30/2017.
 */
public class FilterFragment extends Fragment {
    private GridLayoutManager lLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_filter, container, false);
        List<TabModel> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getActivity(), 2);

        RecyclerView rView = (RecyclerView)view.findViewById(R.id.frecycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        TabAdapter rcAdapter = new TabAdapter(getActivity(), rowListItem);
        rView.setAdapter(rcAdapter);
        return view;
    }

    private List<TabModel> getAllItemList(){

        List<TabModel> allItems = new ArrayList<TabModel>();
        allItems.add(new TabModel("United States","10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Canada", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("United Kingdom","10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Germany", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Sweden", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("United Kingdom","10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Germany", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Sweden", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("United States", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Canada", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("United Kingdom", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Germany", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Sweden","10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("United Kingdom", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Germany", "10 km",R.drawable.beach_back,5));
        allItems.add(new TabModel("Sweden", "10 km",R.drawable.beach_back,5));

        return allItems;
    }
}