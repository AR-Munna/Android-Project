package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after_catagory_clicked extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_after_catagory_clicked);

        /* -----------------------------------------eikhane button create kortesi  -------------------*/

        Button back_button_catagory = (Button)findViewById(R.id.back_button_catagory);
        Button home_button_catagory = (Button)findViewById(R.id.home_button_catagory);
        Button crops_button = (Button)findViewById(R.id.Crops_button);
        Button animal_button = (Button)findViewById(R.id.Animal_button);
        Button fish_button = (Button)findViewById(R.id.Fish_button);
        Button fruits_button = (Button)findViewById(R.id.Fruits_button);

        /* -------------------------------------- button create kora sesh ----------------------------*/

        back_button_catagory.setOnClickListener(this);
        home_button_catagory.setOnClickListener(this);
        crops_button.setOnClickListener(this);
        animal_button.setOnClickListener(this);
        fish_button.setOnClickListener(this);
        fruits_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        /* --------------home button e click kore second page e back asa -----------------------------*/

        if(id == R.id.home_button_catagory)
        {
            Intent intent = new Intent(after_catagory_clicked.this, second_page.class);
            startActivity(intent);
        }

        /*-------------- back button e click kore immediate ager page e back jaoa---------------------*/

        else if(id == R.id.back_button_catagory)
        {
            Intent intent = new Intent(after_catagory_clicked.this, second_page.class);
            startActivity(intent);


            /*------------------stack theke crop er intent ta delete kore dilam :) --------------------*/

            //this.finish();
        }

        /*--------------- crops button e click korle crop  er item gular option asbe-------------------*/

        else if(id==R.id.Crops_button)
        {
            Intent intent = new Intent(after_catagory_clicked.this, after_crop_selected.class);
            startActivity(intent);
        }

        /*--------------- fruits button e click korle fruit  er item gular option asbe-------------------*/

        else if(id == R.id.Fruits_button)
        {
            Intent intent = new Intent(after_catagory_clicked.this, after_fruit_clicked.class);
            startActivity(intent);
        }

        else if(id == R.id.Fish_button)
        {
            Intent intent = new Intent(after_catagory_clicked.this, after_fish_clicked.class);
            startActivity(intent);
        }

        /*--------------- animal button e click korle animal er item gular option asbe-------------------*/


        else if(id == R.id.Animal_button)
        {
            Intent intent = new Intent(after_catagory_clicked.this, after_animal_clicked.class);
            startActivity(intent);
        }

        this.finish();
    }
}
