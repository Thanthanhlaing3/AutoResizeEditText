package com.uigitdev.autoresizeedittext;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uigitdev.autoresizeedittext.uigitdev.design.MEditText;

public class MainActivity extends AppCompatActivity {
    MEditText mEditText;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = new MEditText(findViewById(R.id.auto_resize_edit_text));

//        mEditText.setBackgroundColor(getString(R.color.colorAccent));
//        mEditText.getText();
//        mEditText.setTextColor(getString(R.color.colorAccent));
//        mEditText.setHintColor(getString(R.color.colorAccent));
//        mEditText.setText("text");
//        mEditText.setType(MEditText.INPUT_TYPE.TEXT_PASSWORD);

    }
}
