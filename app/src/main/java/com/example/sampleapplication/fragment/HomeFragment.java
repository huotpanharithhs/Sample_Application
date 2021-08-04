package com.example.sampleapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.sampleapplication.R;

public class HomeFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edittext, container, false);
        EditText editText = view.findViewById(R.id.editText);
        Button button = view.findViewById(R.id.button_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), editText.getText(), Toast.LENGTH_LONG).show();
            }
        });

//        Button myButton = (Button) view.findViewById(R.id.button_home);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                BaseFragment fragment = new Fragment1();
//                if (fragment != null) {
//                    ((BaseActivity) getActivity()).pushFragment(fragment);
//                }
//            }
//        });
        return view;
    }
}
