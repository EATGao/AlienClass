package com.eatgao.alienclass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.eatgao.alienclass.databinding.TimetableFragmentBinding;

public class TimeTableFragment extends Fragment {
    private TimetableFragmentBinding binding;
    public TimeTableFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        binding = TimetableFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();




        return view;

    }
}
