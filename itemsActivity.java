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
 * Created by Marcio Labin on 08/12/2015.
 */
public class itemsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.items_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void shop(View view) {
        this.finish();
        Intent intent = new Intent(itemsActivity.this, townActivity.class);
        startActivity(intent);
    }

    public void buyGorgoroth(View view) {
        if (char_application.dinheiroConta >= 1000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir a Gorgoroth Sword!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 1000;

            char_application.swordStatus = 1;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 1000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar essa espada!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buyTempera(View view) {
        if (char_application.dinheiroConta >= 3000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir a Tempera Sword!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 3000;

            char_application.swordStatus = 2;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 3000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar essa espada!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buyStarlord(View view) {
        if (char_application.dinheiroConta >= 7000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir a Starlord Sword!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 7000;

            char_application.swordStatus = 3;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 7000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar essa espada!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buyJiraya(View view) {
        if (char_application.dinheiroConta >= 12000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir a Jiraya Sword!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 12000;

            char_application.swordStatus = 4;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 12000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar essa espada!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buyCarlin(View view) {
        if (char_application.dinheiroConta >= 18000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir a Carlin Sword!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 18000;

            char_application.swordStatus = 5;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 18000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar essa espada!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buyBlackfyre(View view) {
        if (char_application.dinheiroConta >= 100000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir a Blackfyre Sword!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 100000;

            char_application.swordStatus = 6;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 100000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar essa espada!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buyMaster(View view) {

            Toast.makeText(itemsActivity.this,
                    "Só os justos e os honrados podem utilizar a MasterSword.", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);

    }

    public void buyBrutamonte(View view) {
        if (char_application.dinheiroConta >= 35000) {

            Toast.makeText(itemsActivity.this,
                    "Voce acaba de adquirir o Brutamonte Axe!", Toast.LENGTH_LONG).show();

            char_application.dinheiroConta = char_application.dinheiroConta - 35000;

            char_application.swordStatus = 8;
            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        } else if (char_application.dinheiroConta < 35000) {

            Toast.makeText(itemsActivity.this,
                    "Voce não tem dinheiro para comprar esse axe!", Toast.LENGTH_LONG).show();

            this.finish();
            Intent intent = new Intent(itemsActivity.this, shopActivity.class);
            startActivity(intent);
        }
    }

    public void buy(View view) {


        Toast.makeText(itemsActivity.this,
                "O escudo sagrado de Hyrule. Conta-se que é possível trazer a vida os mortos assassinados injustamente... Encontre-o!", Toast.LENGTH_LONG).show();

        this.finish();
        Intent intent = new Intent(itemsActivity.this, shopActivity.class);
        startActivity(intent);

    }
}