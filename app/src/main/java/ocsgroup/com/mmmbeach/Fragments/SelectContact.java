package ocsgroup.com.mmmbeach.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ocsgroup.com.mmmbeach.R;

/**
 * Created by sanju on 9/8/2017.
 */

public class SelectContact extends Fragment {
    TextView titlehead;
    ImageView back,clock,heading;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.selectcontact_frag, container, false);
        titlehead=(TextView) view.findViewById(R.id.toolbar_title);
        back=(ImageView) view.findViewById(R.id.toolbar_back);
        heading=(ImageView) view.findViewById(R.id.toolbar_head);
        clock=(ImageView) view.findViewById(R.id.toolbar_clock);
        heading.setVisibility(View.INVISIBLE);
        clock.setVisibility(View.INVISIBLE);
        back.setVisibility(View.VISIBLE);
        titlehead.setVisibility(View.VISIBLE);
        titlehead.setText("Contact");
        return view;
    }
}