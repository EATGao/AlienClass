package com.eatgao.alienclass.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.eatgao.alienclass.databinding.AssessmentFragmentBinding;

public class AssessmentFragment extends Fragment {
    private AssessmentFragmentBinding binding;
    public AssessmentFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = AssessmentFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }
}
