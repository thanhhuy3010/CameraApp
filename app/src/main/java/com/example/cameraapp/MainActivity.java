package com.example.cameraapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    Button btnHome, btnCamera, btnSetting;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.layout_frame_fragment, FirstFragment.newInstance("first-frag"));
        fragmentTransaction.commit();
        initHomeUI();
        btnHome.setOnClickListener(this);
    }
    private void initHomeUI() {
        btnHome = findViewById(R.id.btn_home);
    }
    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                ScanQRCodeFragment scanQRCodeFragment = ScanQRCodeFragment.newInstance("scan-frag");
        }
    }
}