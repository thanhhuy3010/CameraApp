package com.example.cameraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ScanQRCodeFragment extends BaseFragment {

    public static final String TAG = ScanQRCodeFragment.class.getSimpleName();

    public static ScanQRCodeFragment newInstance(String arg) {
        Bundle bundle = new Bundle();
        ScanQRCodeFragment scanQRCodeFragment = new ScanQRCodeFragment();
        bundle.putString(TAG,arg);
        scanQRCodeFragment.setArguments(bundle);
        return scanQRCodeFragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    @Override
    protected int layoutResource() {
        return R.layout.camera_scanner;
    }

}
