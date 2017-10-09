package com.example.pranto.app_02_10_17;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class common_page extends Activity implements View.OnClickListener{

    public static Button ask_button;

    public static int flag;
    public static String userText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_common_page);

        flag = getIntent().getIntExtra("flag", 0);

        /* -----------------------------------------eikhane button create kortesi  -------------------*/

        Button back_button_commonPage = (Button)findViewById(R.id.back_button_commonPage);
        Button home_button_commonPage = (Button)findViewById(R.id.home_button_commonPage);
        ask_button = (Button)findViewById(R.id.ask_button);
        Button hotline_button = (Button)findViewById(R.id.hotline_button);


        /* -------------------------------------- button create kora sesh ----------------------------*/

        back_button_commonPage.setOnClickListener(this);
        home_button_commonPage.setOnClickListener(this);
        ask_button.setOnClickListener(this);
        hotline_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();

        if(id == R.id.back_button_commonPage)
        {

            if(flag == 1)
            {
                Intent intent = new Intent(common_page.this, after_crop_selected.class);
                startActivity(intent);
            }

            else if(flag == 2)
            {
                Intent intent = new Intent(common_page.this, after_fruit_clicked.class);
                startActivity(intent);
            }

            else if(flag == 3)
            {
                Intent intent = new Intent(common_page.this, after_fish_clicked.class);
                startActivity(intent);
            }

            else if(flag == 4)
            {
                Intent intent = new Intent(common_page.this, after_animal_clicked.class);
                startActivity(intent);
            }
        }

        else if(id == R.id.home_button_commonPage)
        {
            Intent intent = new Intent(common_page.this, second_page.class);
            startActivity(intent);
        }

        /*-----------------------google search korar jonno--------------------------------------------*/

        else if(id == R.id.ask_button)
        {

            Intent intent = new Intent(common_page.this, after_ask_clicked.class);
            intent.putExtra("flag", flag);
            startActivity(intent);
        }

        /*--------------------hotline number e call jabe ---------------------------------------------*/

        else if(id == R.id.hotline_button)
        {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:+8801780552894"));
            startActivity(callIntent);
        }

        this.finish();
    }
}
