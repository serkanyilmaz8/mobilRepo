package com.serkanyilmaz.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.show();  // ActionBar'ı gösterir.
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.item_ekle)
            Toast.makeText(this, "Kişi Ekle Seçildi", Toast.LENGTH_SHORT).show();
        else if (item.getItemId() == R.id.item_duzelt)
            Toast.makeText(this, "Kişi Düzelt Seçildi", Toast.LENGTH_SHORT).show();
        else if (item.getItemId() == R.id.item_sil)
            Toast.makeText(this, "Kişi Sil Seçildi", Toast.LENGTH_SHORT).show();
        else if(item.getItemId() == R.id.app_bar_search)
            Toast.makeText(this, "Arama Seçeneği Seçildi", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}