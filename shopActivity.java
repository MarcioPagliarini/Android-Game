package com.example.marciolabin.layoutsandmoviments;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Marcio Labin on 05/12/2015.
 */
public class shopActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.shop_activity);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void backTown(View view) {

        this.finish();
        Intent intent = new Intent(shopActivity.this, townActivity.class);
        startActivity(intent);

    }

    public void goList(View view) {

        this.finish();
        Intent intent = new Intent(shopActivity.this, itemsActivity.class);
        startActivity(intent);


    }
}
