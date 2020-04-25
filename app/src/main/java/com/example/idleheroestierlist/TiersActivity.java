package com.example.idleheroestierlist;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idleheroestierlist.Hero;
import com.example.idleheroestierlist.HeroAdapter;
import com.example.idleheroestierlist.R;

import java.util.ArrayList;
import java.util.List;

public class TiersActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiers);

        Bundle bundle = getIntent().getExtras();
        String type = (String) bundle.get("type");

        LinearLayout layout = findViewById(R.id.linear_layout);
        Button[] arr;

        if(type.equals("pvp")) {
            arr = new Button[9];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = new Button(this);
            }

            arr[0].setText("God Tier");
            for(int i = 1; i < 6; i++) {
                arr[i].setText("Tier " + i * 0.5);
            }
            arr[6].setText("Tier 3");
            arr[7].setText("Tier 4");
            arr[8].setText("Tier 5");
        }
        else {
            arr = new Button[7];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = new Button(this);
            }
            arr[0].setText("God Tier");
            arr[1].setText("Tier 1");
            arr[2].setText("Tier 2");
            for(int i = 3; i < 7; i++) {
                arr[i].setText("Tier " + (i - 1));
            }
        }

        for (Button button : arr) {
            layout.addView(button);
            button.setTextSize(20);
            button.setBackgroundColor(Color.WHITE);

            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            p.weight = 1;
            button.setLayoutParams(p);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openListActivity(v);
                }
            });
        }
    }

    public void openListActivity(View view) {
        Button button = (Button) view;
        String str = button.getText().toString();

        Intent intent = new Intent(this, ListActivity.class);
        Bundle bundle = getIntent().getExtras();
        String type = (String) bundle.get("type");
        intent.putExtra("type", type);

        if(str.contains("God")) {
            intent.putExtra("tierNum", "0");
        }
        else {
            intent.putExtra("tierNum", str.substring(str.indexOf(" ") + 1));
        }

        startActivity(intent);
    }
}
