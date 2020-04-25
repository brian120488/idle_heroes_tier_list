package com.example.idleheroestierlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTiersActivity(View view) {
        Button button = (Button) view;
        Intent intent = new Intent(this, TiersActivity.class);

        if(button.getText().toString().equalsIgnoreCase("PVP")) {
            intent.putExtra("type", "pvp");
        }
        else {
            intent.putExtra("type", "pve");
        }

        startActivity(intent);
    }
}
