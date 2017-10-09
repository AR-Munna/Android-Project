package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after_crop_selected extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_after_crop_selected);

        /* -----------------------------------------eikhane button create kortesi  -------------------*/


        Button rice_button = (Button)findViewById(R.id.rice_button);
        Button wheat_button = (Button)findViewById(R.id.wheat_button);
        Button corn_button = (Button)findViewById(R.id.corn_button);
        Button potato_button = (Button)findViewById(R.id.potato_button);
        Button jute_button = (Button)findViewById(R.id.jute_button);
        Button sugarcane_button = (Button)findViewById(R.id.sugarcane_button);
        Button brinjal_button = (Button)findViewById(R.id.brinjal_button);
        Button potol_button = (Button)findViewById(R.id.potol_button);
        Button onion_button = (Button)findViewById(R.id.onion_button);
        Button morich_button = (Button)findViewById(R.id.morich_button);
        Button back_button_crop = (Button)findViewById(R.id.back_button_crop);
        Button home_button_crop = (Button)findViewById(R.id.home_button_crop);

        /* -------------------------------------- button create kora sesh ----------------------------*/

        rice_button.setOnClickListener(this);
        wheat_button.setOnClickListener(this);
        corn_button.setOnClickListener(this);
        potato_button.setOnClickListener(this);
        jute_button.setOnClickListener(this);
        sugarcane_button.setOnClickListener(this);
        brinjal_button.setOnClickListener(this);
        potol_button.setOnClickListener(this);
        onion_button.setOnClickListener(this);
        morich_button.setOnClickListener(this);
        back_button_crop.setOnClickListener(this);
        home_button_crop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        if(id == R.id.back_button_crop)
        {
            Intent intent_CropPagetoSecondPage = new Intent(after_crop_selected.this, after_catagory_clicked.class);
            this.finish();
            startActivity(intent_CropPagetoSecondPage);
        }

        else if(id == R.id.home_button_crop)
        {
            Intent intent = new Intent(after_crop_selected.this, second_page.class);
            startActivity(intent);
        }

        else
        {
            Intent intent = new Intent(after_crop_selected.this, common_page.class);
            int flag = 1;
            intent.putExtra("flag", flag);
            startActivity(intent);
        }
        this.finish();
    }
}
