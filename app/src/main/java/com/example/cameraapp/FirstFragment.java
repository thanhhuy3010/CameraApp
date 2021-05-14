package com.example.cameraapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends BaseFragment {

    // TODO: Rename parameter arguments, choose names that match
    public static final String TAG = FirstFragment.class.getSimpleName();

    public static FirstFragment newInstance(String arg) {
        Bundle bundle = new Bundle();
        FirstFragment firstFragment = new FirstFragment();
        bundle.putString(TAG,arg);
        firstFragment.setArguments(bundle);
        return firstFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    protected int layoutResource() {
        return 0;
    }


}