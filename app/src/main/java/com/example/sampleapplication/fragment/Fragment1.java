package com.example.sampleapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;

import com.example.sampleapplication.R;

public class Fragment1 extends BaseFragment {
    private Button mButton;
    private ToggleButton mToggleButton1, mToggleButton2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);

        return view;
    }
}
