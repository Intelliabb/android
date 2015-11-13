package com.intelliabb.hnabbasi.fragmenthostviewpager.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.intelliabb.hnabbasi.fragmenthostviewpager.R;

public class MyFragment extends Fragment {

    String label;

    public static MyFragment newInstance(String fragmentLabel) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putString("label", fragmentLabel);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);
        TextView tv = (TextView) view.findViewById(R.id.label);

        //If the fragment was created by the TabHost, return empty view
        if(getArguments() == null) return view;

        label = getArguments().getString("label", "");

        tv.setText(label);
        return view;
    }
}
