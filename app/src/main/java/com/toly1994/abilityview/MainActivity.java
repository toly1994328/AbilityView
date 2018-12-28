package com.toly1994.abilityview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.toly1994.abilityview.view.AbilityView;
import com.toly1994.abilityview.view.DataMapper;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap<String, Integer> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbilityView abilityView = findViewById(R.id.id_ability_view);
        mData = new HashMap<>();
        mData.put("Java", 100);
        mData.put("Kotlin", 70);
        mData.put("JavaScript", 100);
        mData.put("Python", 60);
        mData.put("Dart", 50);
        mData.put("C++", 60);
        mData.put("C", 60);
        mData.put("CSS", 100);
//        mData.put("HTML", 100);

        abilityView.setDataMapper(new DataMapper(new String[]{"神", "高", "普", "新", "入"}));
        abilityView.setData(mData);
    }
}
