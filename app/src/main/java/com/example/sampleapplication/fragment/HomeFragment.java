package com.example.sampleapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.sampleapplication.R;
import com.example.sampleapplication.activity.BaseActivity;

public class HomeFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button myButton = (Button) view.findViewById(R.id.button_home);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseFragment fragment = new Fragment1();
                if (fragment != null) {
                    ((BaseActivity) getActivity()).pushFragment(fragment);
                }
            }
        });
        return view;
    }
}
