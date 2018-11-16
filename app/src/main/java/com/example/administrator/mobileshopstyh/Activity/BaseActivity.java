package com.example.administrator.mobileshopstyh.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.administrator.mobileshopstyh.R;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
