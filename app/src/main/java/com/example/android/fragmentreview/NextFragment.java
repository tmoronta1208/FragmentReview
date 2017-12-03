package com.example.android.fragmentreview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class NextFragment extends Fragment {

    View rootview;
    TextView textView;

    public NextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.fragment_next, container, false);
        textView = (TextView) rootview.findViewById(R.id.text_view);

        Bundle bundle = getArguments();

        String stringInput = bundle.getString("main", "");
        textView.setText(stringInput);
        return rootview;
    }

}
