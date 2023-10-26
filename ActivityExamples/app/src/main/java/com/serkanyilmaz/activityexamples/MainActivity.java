package com.serkanyilmaz.activityexamples;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextText);
    }

    public void btnGonder(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("deger1", editText.getText().toString());
        startActivityForResult(intent, 22);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==22 && resultCode==RESULT_OK){
            String sonuc = data.getStringExtra("deger2");
            textView.setText(sonuc);
        }

    }
}