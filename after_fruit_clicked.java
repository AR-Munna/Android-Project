package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after_fruit_clicked extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_after_fruit_clicked);

        /* -----------------------------------------eikhane button create kortesi  -------------------*/

        Button back_button_fruit = (Button)findViewById(R.id.back_button_fruit);
        Button home_button_fruit = (Button)findViewById(R.id.home_button_fruit);
        Button mango_button = (Button)findViewById(R.id.mango_button);
        Button lichi_button = (Button)findViewById(R.id.lichi_button);
        Button jackfruit_button = (Button)findViewById(R.id.jackfruit_button);
        Button banana_button = (Button)findViewById(R.id.banana_button);
        Button pineapple_button = (Button)findViewById(R.id.pineapple_button);
        Button papaya_button = (Button)findViewById(R.id.papaya_button);
        Button guava_button = (Button)findViewById(R.id.guava_button);
        Button lemon_button = (Button)findViewById(R.id.lemon_button);
        Button watermelon_button = (Button)findViewById(R.id.watermelon_button);
        Button boroi_button = (Button)findViewById(R.id.boroi_button);

        /* -------------------------------------- button create kora sesh ----------------------------*/

        back_button_fruit.setOnClickListener(this);
        home_button_fruit.setOnClickListener(this);
        mango_button.setOnClickListener(this);
        lichi_button.setOnClickListener(this);
        jackfruit_button.setOnClickListener(this);
        banana_button.setOnClickListener(this);
        pineapple_button.setOnClickListener(this);
        papaya_button.setOnClickListener(this);
        guava_button.setOnClickListener(this);
        lemon_button.setOnClickListener(this);
        watermelon_button.setOnClickListener(this);
        boroi_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        if(id == R.id.back_button_fruit)
        {
            Intent intent_fruitPagetoSecondPage = new Intent(after_fruit_clicked.this, after_catagory_clicked.class);
            //this.finish();
            startActivity(intent_fruitPagetoSecondPage);
        }

        else if(id == R.id.home_button_fruit)
        {
            Intent intent_fruitPagetoHome = new Intent(after_fruit_clicked.this, second_page.class);
            startActivity(intent_fruitPagetoHome);
        }

        else
        {
            Intent intent_commonPageforFruit = new Intent(after_fruit_clicked.this, common_page.class);

             /*-------------------------flag = 2, is used for crop_selected_page------------------------*/

            int flag = 2;

            intent_commonPageforFruit.putExtra("flag", flag);

            startActivity(intent_commonPageforFruit);
        }
        this.finish();
    }
}
