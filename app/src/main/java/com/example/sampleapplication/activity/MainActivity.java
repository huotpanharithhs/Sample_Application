package com.example.sampleapplication.activity;

import android.os.Bundle;
import com.example.sampleapplication.R;
import com.example.sampleapplication.fragment.BaseFragment;
import com.example.sampleapplication.fragment.HomeFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseFragment fragment = new HomeFragment();
        if (null != fragment) {
            setFragment(fragment);
        }
    }
}