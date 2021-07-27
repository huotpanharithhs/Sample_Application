package com.example.sampleapplication.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sampleapplication.R;
import com.example.sampleapplication.fragment.BaseFragment;

import java.util.Stack;

public class BaseActivity extends AppCompatActivity {

    private Stack<BaseFragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments = new Stack<BaseFragment>();
    }

    @Override
    public void onBackPressed() {
        BaseFragment last = fragments.lastElement();
        if (fragments.size() < 2) {
            super.onBackPressed();
        } else {
            popFragment();
        }
    }

    public void updateActionBar() {
        BaseFragment last = fragments.lastElement();
    }

    public void setFragment(BaseFragment fragment) {
        fragments.clear();
        fragments.push(fragment);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        ft.replace(R.id.content_frame, fragment);
        ft.commit();
        updateActionBar();
    }

    public void popFragment() {
        if (fragments.size() == 1) {
            return;
        }
        fragments.pop();
        Fragment last = fragments.lastElement();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        ft.replace(R.id.content_frame, last);
        ft.commit();
        updateActionBar();
    }

    public void pushFragment(BaseFragment fragment) {
        fragments.push(fragment);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        ft.replace(R.id.content_frame, fragment);
        ft.commit();
        updateActionBar();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
