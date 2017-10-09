package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after_animal_clicked extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_after_animal_clicked);

         /* -----------------------------------------eikhane button create kortesi  -------------------*/

        Button back_button_animal = (Button)findViewById(R.id.back_button_animal);
        Button home_button_animal = (Button)findViewById(R.id.home_button_animal);
        Button cow_button = (Button)findViewById(R.id.cow_button);
        Button buffalo_button = (Button)findViewById(R.id.buffalo_button);
        Button goat_button = (Button)findViewById(R.id.goat_button);
        Button sheep_button = (Button)findViewById(R.id.sheep_button);
        Button chicken_button = (Button)findViewById(R.id.chicken_button);
        Button duck_button = (Button)findViewById(R.id.duck_button);
        Button pegeon_button = (Button)findViewById(R.id.pegeon_button);
        Button koel_button = (Button)findViewById(R.id.koel_button);

         /* -------------------------------------- button create kora sesh ----------------------------*/

        back_button_animal.setOnClickListener(this);
        home_button_animal.setOnClickListener(this);
        cow_button.setOnClickListener(this);
        buffalo_button.setOnClickListener(this);
        goat_button.setOnClickListener(this);
        sheep_button.setOnClickListener(this);
        chicken_button.setOnClickListener(this);
        duck_button.setOnClickListener(this);
        pegeon_button.setOnClickListener(this);
        koel_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        if(id == R.id.back_button_animal)
        {
            Intent intent_AnimalPagetoSecondPage = new Intent(after_animal_clicked.this, after_catagory_clicked.class);
            //this.finish();
            startActivity(intent_AnimalPagetoSecondPage);
        }

        else if(id == R.id.home_button_animal)
        {
            Intent intent = new Intent(after_animal_clicked.this, second_page.class);
            startActivity(intent);
        }

        else
        {
            Intent intent = new Intent(after_animal_clicked.this, common_page.class);

             /*-------------------------flag = 4, is used for crop_selected_page------------------------*/

            int flag = 4;

            intent.putExtra("flag", flag);

            startActivity(intent);
        }
        this.finish();
    }
}
