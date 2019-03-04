package com.example.android.inclassassignment06_mingk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity implements Keys {

    private EditText animalName;
    private EditText legs;
    private CheckBox hasFur;
    private EditText moreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalName = (EditText)findViewById(R.id.animal_name);
        legs = (EditText)findViewById(R.id.edit_legs);
        hasFur = (CheckBox)findViewById(R.id.has_fur);
        moreInfo = (EditText)findViewById(R.id. more_information);

    }




    public void collectAnimalInfo (View view){

        String aName = animalName.getText().toString();

        String aLegs = legs.getText().toString();
        int legNumbers = Integer.valueOf(aLegs);

        boolean animalHasFur;

        if (hasFur.isChecked()){
            animalHasFur = true;
        } else {
            animalHasFur = false;
        }
        String aMoreInfo = moreInfo.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);

        /*intent.putExtra(Keys.NAME,aName);
        intent.putExtra(Keys.LEGS,legNumbers);
        intent.putExtra(Keys.FUR,animalHasFur);
        intent.putExtra(Keys.MOREINFO,aMoreInfo);
*/
        Animal animal = new Animal(aName,legNumbers,animalHasFur,aMoreInfo);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Keys.ANIMAL,animal);
        animal.setName(aName);
        animal.setLegs(legNumbers);
        animal.setHasFur(animalHasFur);
        animal.setMoreInfo(aMoreInfo);

        intent.putExtras(bundle);
        startActivity(intent);

    }



}
