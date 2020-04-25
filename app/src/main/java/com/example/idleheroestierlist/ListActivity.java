package com.example.idleheroestierlist;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView list = findViewById(R.id.list);
        ArrayList<Hero> arr = new ArrayList<>();

        String type = (String) getIntent().getExtras().get("type");
        String tierNum = (String) getIntent().getExtras().get("tierNum");

        System.out.println(type);
        System.out.println(tierNum);

        //why does .equals() only work??
        if(type.equals("pvp")) {
            if(tierNum.equals("0")) {
                arr.add(new Hero("Carrie", R.drawable.carrie, "Reduces other heros' energy. Has multiple lives and high damage over time."));
            }
            else if(tierNum.equals("0.5")) {
                arr.add(new Hero("Tara", R.drawable.tara,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Aida", R.drawable.aida, "Huge burst. Damages enemy for using active skill. Self-sustain also helps to maintain damage."));
                arr.add(new Hero("Amen-Ra", R.drawable.amen_ra, "Provides shields that turn incoming damage into healing. Deals additional damage when allies use their active skills."));
                arr.add(new Hero("UniMax-3000", R.drawable.unimax_3000,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Garuda", R.drawable.garuda, "High damage over time from passive. High burst damage from active."));
            }
            else if(tierNum.equals("1")) {
                arr.add(new Hero("Mihm", R.drawable.mihm, "One target burst with potential to reduce enemy armor. Energy steal can help add to survivabilty."));
                arr.add(new Hero("Kroos", R.drawable.kroos, "Support and Heal but to a lesser extent than Belrain. 50% damage bonus adds to Heart Watcher's 300%."));
            }
            else if(tierNum.equals("1.5")) {
                arr.add(new Hero("Dark Arthindol", R.drawable.dark_arthindol, "Energy steal can be useful. Frail body and CC based design do not bring much to PvE."));
                arr.add(new Hero("Amuvor", R.drawable.amuvor, "Huge two-target burst, ideal for smaller groups. Added damage against Priest. Tears through light Heroes."));
                arr.add(new Hero("Asmodel", R.drawable.asmodel, "Produces Critical Marks that deal huge damage when an opponent is hit with a critical."));
                arr.add(new Hero("Gustin", R.drawable.gustin, "Gets rid of debuffs for your allies. Also provides heal."));
                arr.add(new Hero("Xia", R.drawable.xia, "Huge single target burst after a few buffs. Reduces opponent's attack adding to survival."));
                arr.add(new Hero("Barea", R.drawable.barea, "Progressive self buff that can lead to some massive bursts in later rounds. Also, reduces enemy armor."));
                arr.add(new Hero("Skerei", R.drawable.skerei, "Even one copy can do huge amount of damage due to self buff and crit."));
                arr.add(new Hero("Kroos", R.drawable.kroos, "Support and Heal but to a lesser extent than Belrain. 50% damage bonus adds to Heart Watcher's 300%."));
                arr.add(new Hero("Nakia", R.drawable.nakia, "High burst damage against bosses. Buffs self crit and damage."));
            }
            else if(tierNum.equals("2")) {
                arr.add(new Hero("Penny", R.drawable.penny, "Huge single target burst and damage over time. Crits deal bonus damage to all enemies. Can protect herself from CC and reflect back damage."));
                arr.add(new Hero("Aspen", R.drawable.aspen, "Massive burst and Crit. Damage is increased even further once opponents drop below 35% Max HP."));
                arr.add(new Hero("Oberon", R.drawable.oberon, "Primarily based around freeze synergy and because CC rarely plays a role in PvE, pretty useless."));
            }
            else if(tierNum.equals("2.5")) {
                arr.add(new Hero("Faith Blade", R.drawable.faith_blade,"Reliable two-target burst but lacks the reliable Max HP damage style attacks. Passives go unused in PvE."));
                arr.add(new Hero("Asmodel", R.drawable.asmodel,"Produces Critical Marks that deal huge damage when an opponent is hit with a critical."));
                arr.add(new Hero("Amuvor", R.drawable.amuvor,"Huge two-target burst, ideal for smaller groups. Added damage against Priest. Tears through light Heroes."));
                arr.add(new Hero("Dark Arthindol", R.drawable.dark_arthindol,"Energy steal can be useful. Frail body and CC based design do not bring much to PvE."));
                arr.add(new Hero("Aidan", R.drawable.aidan,"Active skill deals huge damage if built on a team specifically designed to exploit it."));
                arr.add(new Hero("Emily", R.drawable.emily,"Buffs team's Attack and reduces opponent's crit."));
                arr.add(new Hero("Valkyrie", R.drawable.valkyrie,"Nasty damage over time and heals self when controlled. Perfect vs bosses who regularly CC"));
                arr.add(new Hero("King Barton", R.drawable.king_barton,"Costner attack hits all opponents so against small groups can deal reliable damage if risk of CC is minimal."));
            }
            else if(tierNum.equals("3")) {
                arr.add(new Hero("Das Moge", R.drawable.das_moge, "Self buff when allies use their active can scale up to some huge burst alongside damage over time."));
                arr.add(new Hero("Jahra", R.drawable.jahra,"Reliable burst and damage over time with potential self sustain. Provides poison synergy for snake."));
                arr.add(new Hero("Sigmund", R.drawable.sigmund, "Damage over time and counter attack cause huge damage. Sigmund also removes enemy armor, thus increasing overall damage."));
                arr.add(new Hero("Ormus", R.drawable.ormus, "When Belrain or Vesa's healing just isn't enough, Ormus can be used to provide the best healing in the game."));
                arr.add(new Hero("Valentino", R.drawable.valentino,"If built for damage, Valentino has reliable burst and the Overload passive adds to overall damage."));
                arr.add(new Hero("Flame Strike", R.drawable.flame_strike, "Buffs self whenever an opponent is burned. Using heroes like Valkyrie and Sigmund can lead to huge bursts."));
                arr.add(new Hero("Xia", R.drawable.xia,"Huge single target burst after a few buffs. Reduces opponent's attack adding to survival."));
                arr.add(new Hero("Starlight", R.drawable.starlight,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Vesa", R.drawable.vesa, "Brings Healing and Burst on one unit. Vesa is the other top healing pick for your PvE team and has the bonus of packing solid damage."));
                arr.add(new Hero("Skerei", R.drawable.skerei, "Even one copy can do huge amount of damage due to self buff and crit."));
            }
            else if(tierNum.equals("4")) {
                arr.add(new Hero("Gerke", R.drawable.gerke, "Hero information unavailable. Please try again later."));
                arr.add(new Hero("Sleepless", R.drawable.sleepless, "Hero information unavailable. Please try again later."));
                arr.add(new Hero("Corpsedemon", R.drawable.corpsedemon, "Can tank damage but CC doesn’t come up in PvE. There are better choices if you need a PvE tank."));
                arr.add(new Hero("Kamath", R.drawable.kamath, "Primaryly based around petrify synergy and because CC rarely play a role in PvE, pretty useless."));
                arr.add(new Hero("Barea", R.drawable.barea,"Progressive self buff that can lead to some massive bursts in later rounds. Also, reduces enemy armor."));
                arr.add(new Hero("Queen", R.drawable.queen, "Great burst, damage over time and counter attack. Also, buffs self whilst reducing opponent's crit."));
                arr.add(new Hero("Heart Watcher", R.drawable.heart_watcher, "Increases damage taken by opponents by up to 300%. Essential to maximize your damage output."));
                arr.add(new Hero("Rosa", R.drawable.rosa, "Buffs Attack of allied heroes which multiplies with HW's bonus. Provides some protection as well.t"));
            }
            else {
                arr.add(new Hero("Baade", R.drawable.baade,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Groo", R.drawable.groo,"Counter attack with self sustain. Can attack damage and debuffs opponent, increasing survivabilty."));
                arr.add(new Hero("Blood Blade", R.drawable.blood_blade, "Superb burst, damage over time and self sustain. Provides bleed synergy for wolf."));
            }
        }
        else {
            if(tierNum.equals("0")) {
                System.out.println("hi");
                arr.add(new Hero("Sigmund", R.drawable.sigmund, "Damage over time and counter attack cause huge damage. Sigmund also removes enemy armor, thus increasing overall damage."));
                arr.add(new Hero("Heart Watcher", R.drawable.heart_watcher, "Increases damage taken by opponents by up to 300%. Essential to maximize your damage output."));
                arr.add(new Hero("Garuda", R.drawable.garuda, "High damage over time from passive. High burst damage from active."));
            }
            else if(tierNum.equals("1")) {
                arr.add(new Hero("Das Moge", R.drawable.das_moge, "Self buff when allies use their active can scale up to some huge burst alongside damage over time."));
                arr.add(new Hero("Aspen", R.drawable.aspen, "Massive burst and Crit. Damage is increased even further once opponents drop below 35% Max HP."));
                arr.add(new Hero("Amen-Ra", R.drawable.amen_ra, "Provides shields that turn incoming damage into healing. Deals additional damage when allies use their active skills."));
                arr.add(new Hero("Belrain", R.drawable.belrain, "Healing and Attack buff on one unit. Best way to add healing to a team whist also providing a boost."));
                arr.add(new Hero("Horus", R.drawable.horus, "Burst and damage over time all on one body. Horus provides the best single unit damage of any hero."));
                arr.add(new Hero("Penny", R.drawable.penny, "Huge single target burst and damage over time. Crits deal bonus damage to all enemies. Can protect herself from CC and reflect back damage."));
            }
            else if(tierNum.equals("1.5")) {
                arr.add(new Hero("Dark Arthindol", R.drawable.dark_arthindol,"Energy steal can be useful. Frail body and CC based design do not bring much to PvE."));
                arr.add(new Hero("Amuvor", R.drawable.amuvor,"Huge two-target burst, ideal for smaller groups. Added damage against Priest. Tears through light Heroes."));
                arr.add(new Hero("Asmodel", R.drawable.asmodel,"Produces Critical Marks that deal huge damage when an opponent is hit with a critical."));
                arr.add(new Hero("Gustin", R.drawable.gustin,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Xia", R.drawable.xia,"Huge single target burst after a few buffs. Reduces opponent's attack adding to survival."));
                arr.add(new Hero("Barea", R.drawable.barea,"Progressive self buff that can lead to some massive bursts in later rounds. Also, reduces enemy armor."));
                arr.add(new Hero("Skerei", R.drawable.skerei, "Even one copy can do huge amount of damage due to self buff and crit."));
                arr.add(new Hero("Kroos", R.drawable.kroos,"Support and Heal but to a lesser extent than Belrain. 50% damage bonus adds to Heart Watcher's 300%."));
                arr.add(new Hero("Nakia", R.drawable.nakia,"Hero information unavailable. Please try again later."));
            }
            else if(tierNum.equals("2")) {
                arr.add(new Hero("Aida", R.drawable.aida, "Huge burst. Damages enemy for using active skill. Self-sustain also helps to maintain damage."));
                arr.add(new Hero("Blood Blade", R.drawable.blood_blade, "Superb burst, damage over time and self sustain. Provides bleed synergy for wolf."));
                arr.add(new Hero("Cthuga", R.drawable.cthugha, "Deals burn and bleed damage over time and triggers any lasting burn/bleed as burst damage with additional damage."));
                arr.add(new Hero("Flame Strike", R.drawable.flame_strike, "Buffs self whenever an opponent is burned. Using heroes like Valkyrie and Sigmund can lead to huge bursts."));
                arr.add(new Hero("Ormus", R.drawable.ormus, "When Belrain or Vesa's healing just isn't enough, Ormus can be used to provide the best healing in the game."));
                arr.add(new Hero("Queen", R.drawable.queen, "Great burst, damage over time and counter attack. Also, buffs self whilst reducing opponent's crit."));
                arr.add(new Hero("Rosa", R.drawable.rosa, "Buffs Attack of allied heroes which multiplies with HW's bonus. Provides some protection as well.t"));
                arr.add(new Hero("Vesa", R.drawable.vesa, "Brings Healing and Burst on one unit. Vesa is the other top healing pick for your PvE team and has the bonus of packing solid damage."));
            }
            else if(tierNum.equals("3")) {
                arr.add(new Hero("Faith Blade", R.drawable.faith_blade,"Reliable two-target burst but lacks the reliable Max HP damage style attacks. Passives go unused in PvE."));
                arr.add(new Hero("Jahra", R.drawable.jahra,"Reliable burst and damage over time with potential self sustain. Provides poison synergy for snake."));
                arr.add(new Hero("Valentino", R.drawable.valentino,"If built for damage, Valentino has reliable burst and the Overload passive adds to overall damage."));
                arr.add(new Hero("King Barton", R.drawable.king_barton,"Costner attack hits all opponents so against small groups can deal reliable damage if risk of CC is minimal."));
                arr.add(new Hero("Starlight", R.drawable.starlight,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Valkyrie", R.drawable.valkyrie,"Nasty damage over time and heals self when controlled. Perfect vs bosses who regularly CC"));
            }
            else if(tierNum.equals("4")) {
                arr.add(new Hero("Mihm", R.drawable.mihm,"One target burst with potential to reduce enemy armor. Energy steal can help add to survivabilty."));
                arr.add(new Hero("Baade", R.drawable.baade,"Hero information unavailable. Please try again later."));
                arr.add(new Hero("Aidan", R.drawable.aidan,"Active skill deals huge damage if built on a team specifically designed to exploit it."));
                arr.add(new Hero("Emily", R.drawable.emily,"Buffs team's Attack and reduces opponent's crit."));
                arr.add(new Hero("Groo", R.drawable.groo,"Counter attack with self sustain. Can attack damage and debuffs opponent, increasing survivabilty."));
            }
            else {
                arr.add(new Hero("Michelle", R.drawable.michelle, "Powerful spot healing and ability to tank damage."));
                arr.add(new Hero("Corpsedemon", R.drawable.corpsedemon, "Can tank damage but CC doesn’t come up in PvE. There are better choices if you need a PvE tank."));
                arr.add(new Hero("Kamath", R.drawable.kamath, "Primaryly based around petrify synergy and because CC rarely play a role in PvE, pretty useless."));
                arr.add(new Hero("Oberon", R.drawable.oberon, "Primarily based around freeze synergy and because CC rarely plays a role in PvE, pretty useless."));
            }
        }

        HeroAdapter adapter = new HeroAdapter(this, arr);
        System.out.println(arr);
        list.setAdapter(adapter);
    }
}
