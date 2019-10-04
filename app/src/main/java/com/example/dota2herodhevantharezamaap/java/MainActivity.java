package com.example.dota2herodhevantharezamaap.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dota2herodhevantharezamaap.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerView();
    }
    protected void showRecyclerView() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        HeroAdapter listHeroAdapter = new HeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.manu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.toProfile:
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
