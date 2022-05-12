package com.example.planetgreece;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.planetgreece.db.model.User;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra(LoginTabFragment.USER_OBJECT);
//        System.out.println(user.getEmail());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainConstaint, HomeFragment.newInstance(user)).commit();
        bottomNavigationView.setSelectedItemId(R.id.navHome);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
//                    case R.id.navHome:
//                        fragment = HomeFragment.newInstance(user);
//                        break;
                    case R.id.navSaved:
                        fragment = new SavedFragment();
                        break;
                    case R.id.navProfile:
                        fragment = new ProfileFragment();
                        break;
                    case R.id.navSettings:
                        fragment = new SettingsFragment();
                        break;
                    default:
                        fragment = HomeFragment.newInstance(user);
                        break;
                }

                getSupportFragmentManager()
                        .beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.mainConstaint, fragment)
                        .commit();

                return true;
            }
        });
    }
}