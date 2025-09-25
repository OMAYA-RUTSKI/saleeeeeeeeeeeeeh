package com.example.salehapology;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class exitFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exit2, container, false);

        Button exitButton = view.findViewById(R.id.btnExit);
        exitButton.setOnClickListener(v -> {
            getActivity().finishAffinity(); // يغلق التطبيق بالكامل
        });

        return view;
    }
}
