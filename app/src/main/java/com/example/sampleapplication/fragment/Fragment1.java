package com.example.sampleapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
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
        mButton = (Button)view.findViewById(R.id.button_submit);
        mToggleButton1 = (ToggleButton)view.findViewById(R.id.toggleButton1);
        mToggleButton2 = (ToggleButton)view.findViewById(R.id.toggleButton2);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1:").append(mToggleButton1.getText());
                result.append("\nToggleButton2:").append(mToggleButton2.getText());

                Toast.makeText(getActivity(), result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
