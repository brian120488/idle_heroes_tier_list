package com.example.idleheroestierlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HeroAdapter extends ArrayAdapter<Hero> {

    public HeroAdapter(@NonNull Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.hero, parent, false);
        Hero hero = getItem(position);
        ImageButton heroImageButton = convertView.findViewById(R.id.heroImageButton);
        TextView name = convertView.findViewById(R.id.heroName);
        TextView description = convertView.findViewById(R.id.heroDescription);
        heroImageButton.setImageResource(hero.getImage());
        name.setText(hero.getName());
        description.setText(hero.getDescription());

        return convertView;
    }
}
