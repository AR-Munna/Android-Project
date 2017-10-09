package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after_fish_clicked extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_after_fish_clicked);

        /* -----------------------------------------eikhane button create kortesi  -------------------*/

        Button back_button_fish = (Button)findViewById(R.id.back_button_fish);
        Button home_button_fish = (Button)findViewById(R.id.home_button_fish);
        Button rui_button = (Button)findViewById(R.id.rui_button);
        Button katla_button = (Button)findViewById(R.id.katla_button);
        Button mrigel_button = (Button)findViewById(R.id.mrigel_button);
        Button chingri_button = (Button)findViewById(R.id.chingri_button);
        Button koi_button = (Button)findViewById(R.id.koi_button);
        Button magur_button = (Button)findViewById(R.id.magur_button);
        Button kalbaus_button = (Button)findViewById(R.id.kalbaush_button);
        Button telapia_button = (Button)findViewById(R.id.telapia_button);
        Button silverCarp_button = (Button)findViewById(R.id.silver_carp_button);
        Button grassCarp_button = (Button)findViewById(R.id.grass_carp_button);

        /* -------------------------------------- button create kora sesh ----------------------------*/

        back_button_fish.setOnClickListener(this);
        home_button_fish.setOnClickListener(this);
        rui_button.setOnClickListener(this);
        katla_button.setOnClickListener(this);
        mrigel_button.setOnClickListener(this);
        chingri_button.setOnClickListener(this);
        koi_button.setOnClickListener(this);
        magur_button.setOnClickListener(this);
        kalbaus_button.setOnClickListener(this);
        telapia_button.setOnClickListener(this);
        silverCarp_button.setOnClickListener(this);
        grassCarp_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        if(id == R.id.back_button_fish)
        {
            Intent intent_FishPagetoSecondPage = new Intent(after_fish_clicked.this, after_catagory_clicked.class);
            //this.finish();
            startActivity(intent_FishPagetoSecondPage);
        }

        else if(id == R.id.home_button_fish)
        {
            Intent intent = new Intent(after_fish_clicked.this, second_page.class);
            startActivity(intent);
        }

        else
        {
            Intent intent = new Intent(after_fish_clicked.this, common_page.class);

             /*-------------------------flag = 3, is used for crop_selected_page------------------------*/

            int flag = 3;

            intent.putExtra("flag", flag);

            startActivity(intent);
        }

        this.finish();
    }
}
