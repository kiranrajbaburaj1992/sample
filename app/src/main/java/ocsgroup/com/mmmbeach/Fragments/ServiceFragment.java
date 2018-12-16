package ocsgroup.com.mmmbeach.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ocsgroup.com.mmmbeach.R;
import ocsgroup.com.mmmbeach.Widgets.CustomViewPager;

/**
 * Created by sanju on 8/23/2017.
 */

public class ServiceFragment extends Fragment implements ViewPager.OnPageChangeListener {
    CustomViewPager sviewpager;
    SelectBeach SelectBeach=new SelectBeach();
    SelectContact SelectContact=new SelectContact();
    SelectDuration SelectDuration=new SelectDuration();
    SelectTime SelectTime=new SelectTime();
    SelectType SelectType=new SelectType();
    SelectService SelectService=new SelectService();
    SelectProfile SelectProfile=new SelectProfile();
    SelectPromo SelectPromo=new SelectPromo();
    SelectSummary SelectSummary=new SelectSummary();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_services, container, false);
        sviewpager=(CustomViewPager)view.findViewById(R.id.sviewpager);

        sviewpager.addOnPageChangeListener(this);
        sviewpager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return SelectService;
                    case 1:
                        return SelectType;
                    case 2:
                        return SelectBeach;
                    case 3:
                        return SelectTime;
                    case 4:
                        return SelectDuration;
                    case 5:
                        return SelectContact;
                    case 6:
                        return SelectProfile;
                    case 7:
                        return SelectPromo;
                    case 8:
                        return SelectSummary;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 9;
            }
        });
        return view;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
