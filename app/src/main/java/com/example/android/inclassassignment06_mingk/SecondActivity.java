package com.example.android.inclassassignment06_mingk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView displayAnimalInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        Animal a = (Animal)intent.getSerializableExtra(Keys.ANIMAL);

        String animal = a.getName();
        int legs = a.getLegs();
        boolean hasFur = a.getHasFur();
        String moreInformation = a.getMoreInfo();

        displayAnimalInfo = (TextView)findViewById(R.id.animal_information);

        displayAnimalInfo.setText("Animal Name: " +animal + "\nNumber of Legs: " + legs + "\nHas fur? " +hasFur + "\nMore information: " +moreInformation);

    }


}
