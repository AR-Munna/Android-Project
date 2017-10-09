package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after_ask_clicked extends Activity implements View.OnClickListener{

    public static int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_after_ask_clicked);

        flag = getIntent().getIntExtra("flag", 0);

        /* -----------------------------------------eikhane button create kortesi  -------------------*/

        Button back_button_ask = (Button)findViewById(R.id.back_button_ask);
        Button home_button_ask = (Button)findViewById(R.id.home_button_ask);
        Button text_search = (Button)findViewById(R.id.text_search);

        /* -------------------------------------- button create kora sesh ----------------------------*/

        back_button_ask.setOnClickListener(this);
        home_button_ask.setOnClickListener(this);
        text_search.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if(id == R.id.back_button_ask)
        {
            Intent intent = new Intent(after_ask_clicked.this, common_page.class);
            intent.putExtra("flag", flag);
            startActivity(intent);
        }

        else if(id == R.id.home_button_ask)
        {
            Intent intent = new Intent(after_ask_clicked.this, second_page.class);
            startActivity(intent);
        }

        else if(id == R.id.text_search)
        {
            Intent intent = new Intent(after_ask_clicked.this, text_search.class);
            startActivity(intent);
        }
        this.finish();
    }
}
