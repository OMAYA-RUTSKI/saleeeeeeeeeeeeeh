package com.example.salehapology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // أول ما يفتح التطبيق يعرض HomeFragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new HomeFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment selectedFragment = null;

        int id = item.getItemId();
        if (id == R.id.menu_home) {
            selectedFragment = new Fragment();
        } else if (id == R.id.menu_dash) {
            selectedFragment = new Fragment();
        } else if (id == R.id.menu_exit) {
            selectedFragment = new Fragment();
        }

        if (selectedFragment != null) {
            FragmentTransaction replace = getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment);

        }
        return true;
    }
}
