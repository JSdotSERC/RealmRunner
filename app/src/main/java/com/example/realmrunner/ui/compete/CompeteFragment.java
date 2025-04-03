package com.example.realmrunner.ui.compete;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.realmrunner.databinding.FragmentCompeteBinding;

public class CompeteFragment extends Fragment {

    private FragmentCompeteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CompeteViewModel competeViewModel =
                new ViewModelProvider(this).get(CompeteViewModel.class);

        binding = FragmentCompeteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCompete;
        competeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}