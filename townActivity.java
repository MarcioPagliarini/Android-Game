package com.example.marciolabin.layoutsandmoviments;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by Marcio Labin on 04/12/2015.
 */
public class townActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.town_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void goShop(View view) {

        this.finish();
        Intent intent = new Intent(townActivity.this, shopActivity.class);
        startActivity(intent);

    }

    public void goPantano(View view) {

        if(char_application.masterSword == 0){
            this.finish();
            Intent intent = new Intent(townActivity.this, pantanoActivity.class);
            startActivity(intent);
        }else if (char_application.masterSword == 1){
            Toast.makeText(this, "Você já destruiu todos os lacaios do mal! Destrua o mal supremo!", Toast.LENGTH_LONG).show();
        }

    }

    public void goPoco(View view) {

        if(char_application.masterSword == 0){
            Toast.makeText(this, "Você não possui a força necessária para eliminar o mal supremo.", Toast.LENGTH_LONG).show();

        }else if (char_application.masterSword == 1){
            this.finish();
            Intent intent = new Intent(townActivity.this, redmoon_activity.class);
            startActivity(intent);

        }

    }

    public void goInicio(View view) {

        this.finish();
        Intent intent = new Intent(townActivity.this, plainActivity.class);
        startActivity(intent);

    }
}
