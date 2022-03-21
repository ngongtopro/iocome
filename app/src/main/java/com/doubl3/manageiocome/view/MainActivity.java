package com.doubl3.manageiocome.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import dagger.android.support.DaggerAppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.doubl3.manageiocome.R;
import com.doubl3.manageiocome.model.user.User;
import com.doubl3.manageiocome.view.history.HistoryFragment;
import com.doubl3.manageiocome.view.homepage.HomePageFragment;
import com.doubl3.manageiocome.view.settings.SettingsFragment;
import com.doubl3.manageiocome.view.statistics.StatisticsFragment;
import com.doubl3.manageiocome.view.user.AddUserActivity;
import com.doubl3.manageiocome.viewmodel.StatisticsViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import javax.inject.Inject;

public class MainActivity extends DaggerAppCompatActivity {

    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;

    @Inject
    StatisticsViewModel statisticsViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new HomePageFragment()).commit();
        FloatingActionButton fab = findViewById(R.id.btn_add_new_item);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
            startActivityForResult(intent, NEW_WORD_ACTIVITY_REQUEST_CODE);
        });
        init();
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_WORD_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            User user = new User(data.getStringExtra(NewUserActivity.EXTRA_REPLY_TEN),
                    data.getStringExtra(NewUserActivity.EXTRA_REPLY_HO));
            statisticsViewModel.addUser(user);
            Toast.makeText(
                    getApplicationContext(),
                    "Receive save request: " + user.getFirstName(),
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    "Error: User was not saved",
                    Toast.LENGTH_LONG).show();
        }
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