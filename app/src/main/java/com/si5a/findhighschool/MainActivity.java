package com.si5a.findhighschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSMA;
    private ArrayList<ModelSMA> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSMA = findViewById(R.id.rv_SMA);
        rvSMA.setHasFixedSize(true);

        data.addAll(DataSMA.ambilDataSMA());
        tampilDataCard();
    }

    private void tampilDataCard(){
        rvSMA.setLayoutManager(new LinearLayoutManager(this));
        AdadpterCard brideCard = new AdadpterCard(data);
        rvSMA.setAdapter(brideCard);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu_about) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}