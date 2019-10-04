
package com.example.dota2herodhevantharezamaap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tvName = findViewById(R.id.name);
        TextView tvdetail = findViewById(R.id.detail);
        ImageView imageView = findViewById(R.id.image);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int image = getIntent().getIntExtra(EXTRA_IMAGE, 0);

        tvName.setText(name);
        tvdetail.setText(detail);
        imageView.setImageResource(image);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(name);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
