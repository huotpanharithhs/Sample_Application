package com.example.sampleapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.sampleapplication.R;
import com.example.sampleapplication.activity.BaseActivity;

public class Fragment1 extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imv_fragment1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseFragment fragment = new Fragment2();
                if (null != fragment) {
                    ((BaseActivity) getActivity()).pushFragment(fragment);
                }
            }
        });
        return view;
    }
}
