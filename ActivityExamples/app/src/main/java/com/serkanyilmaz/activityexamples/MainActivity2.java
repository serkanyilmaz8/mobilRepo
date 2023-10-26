package com.serkanyilmaz.activityexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        Intent gelenIntent = getIntent();

        String s = gelenIntent.getStringExtra("deger1");
        textView.setText(s);

        editText = findViewById(R.id.editTextText2);
    }

    public void btnGeriGonder(View view){
        Intent intent = new Intent();
        intent.putExtra("deger2", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}