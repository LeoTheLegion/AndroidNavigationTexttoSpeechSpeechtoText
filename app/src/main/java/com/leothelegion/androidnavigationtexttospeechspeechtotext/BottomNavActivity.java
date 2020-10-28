package com.leothelegion.androidnavigationtexttospeechspeechtotext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Toast.makeText(BottomNavActivity.this, "Recents", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_favorites:
                        Toast.makeText(BottomNavActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_nearby:
                        Toast.makeText(BottomNavActivity.this, "Nearby", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
