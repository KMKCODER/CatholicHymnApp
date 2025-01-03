package com.example.catholichymnapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.catholichymnapp.adapters.HymnAdapter;
import com.example.catholichymnapp.models.Hymn;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HymnAdapter hymnAdapter;
    private List<Hymn> hymnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        hymnList = new ArrayList<>();
        hymnAdapter = new HymnAdapter(hymnList);
        recyclerView.setAdapter(hymnAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_hymns:
                        // Handle Home click
                        return true;
                    case R.id.nav_category:
                        // Handle Hymns click
                        return true;
                    case R.id.nav_search:
                        // Handle Search click
                        return true;
                    case R.id.nav_settings:
                        // Handle Settings click
                        return true;
                }
                return false;
            }
        });

        prepareHymns();
    }

    private void prepareHymns() {
        hymnList.add(new Hymn("Amazing Grace", "John Newton, 1779"));
        hymnList.add(new Hymn("How Great Thou Art", "Carl Boberg, 1885"));
        hymnList.add(new Hymn("Be Thou My Vision", "Traditional, 6th Century"));
        // Add more hymns as needed

        hymnAdapter.notifyDataSetChanged();


    }
}