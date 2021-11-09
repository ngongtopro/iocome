package com.doubl3.manageiocome.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.doubl3.manageiocome.R;
import com.doubl3.manageiocome.View.History.HistoryFragment;
import com.doubl3.manageiocome.View.HomePage.HomePageFragment;
import com.doubl3.manageiocome.View.Settings.SettingsFragment;
import com.doubl3.manageiocome.View.Statistics.StatisticsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new HomePageFragment()).commit();
        init();
    }
    void init() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFrag = null;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFrag = new HomePageFragment();
                        break;
                    case R.id.navigation_statistics:
                        selectedFrag = new StatisticsFragment();
                        break;
                    case R.id.navigation_history:
                        selectedFrag = new HistoryFragment();
                        break;
                    case R.id.navigation_settings:
                        selectedFrag = new SettingsFragment();
                        break;
                    default:
                        selectedFrag = new HomePageFragment();
                        break;
                }
                assert  selectedFrag != null;
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, selectedFrag).commit();
                return true;
            }
        });
    }
}