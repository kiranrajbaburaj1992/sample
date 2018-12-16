package ocsgroup.com.mmmbeach;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import ocsgroup.com.mmmbeach.Fragments.AccountFragment;
import ocsgroup.com.mmmbeach.Fragments.ActivityFragment;
import ocsgroup.com.mmmbeach.Fragments.BeachFragment;
import ocsgroup.com.mmmbeach.Fragments.HomeFragment;
import ocsgroup.com.mmmbeach.Fragments.ServiceFragment;


/**
 * Created by sanju on 8/22/2017.
 */

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener,View.OnClickListener {
    private ViewPager mViewpager;
    HomeFragment homefragment=new HomeFragment();
    BeachFragment beachfragment=new BeachFragment();
    ActivityFragment activityfragment=new ActivityFragment();
    ServiceFragment servicefragment=new ServiceFragment();
    AccountFragment accountfragment=new AccountFragment();
    private FloatingActionButton bottom_serviceicon;
    private ImageView bottom_homeicon;
    private ImageView bottom_beachicon;
    private ImageView bottom_activityicon;
    private ImageView bottom_accounticon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewpager=(ViewPager)findViewById(R.id.viewpager);
        mViewpager.addOnPageChangeListener(this);
        bottom_serviceicon = (FloatingActionButton) findViewById(R.id.bottom_serviceicon);
        bottom_homeicon = (ImageView) findViewById(R.id.bottom_homeicon);
        bottom_activityicon = (ImageView) findViewById(R.id.bottom_activityicon);
        bottom_beachicon = (ImageView) findViewById(R.id.bottom_beachicon);
        bottom_accounticon = (ImageView) findViewById(R.id.bottom_accounticon);
        bottom_serviceicon.setOnClickListener(this);
        bottom_homeicon.setOnClickListener(this);
        bottom_activityicon.setOnClickListener(this);
        bottom_beachicon.setOnClickListener(this);
        bottom_accounticon.setOnClickListener(this);
        mViewpager.setCurrentItem(0);
        bottom_homeicon.setBackgroundResource(R.drawable.home_selected);


        mViewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return homefragment;
                    case 1:
                        return beachfragment;
                    case 2:
                        return servicefragment;
                    case 3:
                        return activityfragment;
                    case 4:
                        return accountfragment;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 5;
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            mViewpager.setCurrentItem(item.getOrder());
            return true;
        }

    };


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(position==0){
            bottom_homeicon.setBackgroundResource(R.drawable.home_selected);
            bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
            bottom_serviceicon.setImageResource(R.drawable.service_normal);
            bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
            bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
        }
        else if(position==1){
            bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
            bottom_beachicon.setBackgroundResource(R.drawable.beach_selected);
            bottom_serviceicon.setImageResource(R.drawable.service_normal);
            bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
            bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
        }else if(position==2){
            bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
            bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
            bottom_serviceicon.setImageResource(R.drawable.service_select);
            bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
            bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
        }else if(position==3){
            bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
            bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
            bottom_serviceicon.setImageResource(R.drawable.service_normal);
            bottom_activityicon.setBackgroundResource(R.drawable.activity_selected);
            bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
        }else if(position==4){
            bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
            bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
            bottom_serviceicon.setImageResource(R.drawable.service_normal);
            bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
            bottom_accounticon.setBackgroundResource(R.drawable.account_selected);
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bottom_homeicon:
                mViewpager.setCurrentItem(0);
                bottom_homeicon.setBackgroundResource(R.drawable.home_selected);
                bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
                bottom_serviceicon.setImageResource(R.drawable.service_normal);
                bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
                bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
               break;
            case R.id.bottom_beachicon:
                mViewpager.setCurrentItem(1);
                bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
                bottom_beachicon.setBackgroundResource(R.drawable.beach_selected);
                bottom_serviceicon.setImageResource(R.drawable.service_normal);
                bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
                bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
                break;
            case R.id.bottom_serviceicon:
                mViewpager.setCurrentItem(2);
                bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
                bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
                bottom_serviceicon.setImageResource(R.drawable.service_select);
                bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
                bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
                break;
            case R.id.bottom_activityicon:
                mViewpager.setCurrentItem(3);
                bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
                bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
                bottom_serviceicon.setImageResource(R.drawable.service_normal);
                bottom_activityicon.setBackgroundResource(R.drawable.activity_selected);
                bottom_accounticon.setBackgroundResource(R.drawable.account_normal);
                break;
            case R.id.bottom_accounticon:
                mViewpager.setCurrentItem(4);
                bottom_homeicon.setBackgroundResource(R.drawable.home_normal);
                bottom_beachicon.setBackgroundResource(R.drawable.beach_normal);
                bottom_serviceicon.setImageResource(R.drawable.service_normal);
                bottom_activityicon.setBackgroundResource(R.drawable.activity_normal);
                bottom_accounticon.setBackgroundResource(R.drawable.account_selected);
                break;
        }
    }
}
