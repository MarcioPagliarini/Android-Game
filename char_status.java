package com.example.marciolabin.layoutsandmoviments;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Marcio Labin on 09/12/2015.
 */
public class char_status extends Activity {

    TextView espada;
    TextView dinheiro;
    TextView nivel;
    ImageView sword;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.char_status);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        espada =(TextView)findViewById(R.id.espada);
        dinheiro = (TextView)findViewById(R.id.dinheiro);
        nivel = (TextView)findViewById(R.id.nivel);
        sword = (ImageView)findViewById(R.id.swordStatus);

        dinheiro.setText(String.valueOf(char_application.dinheiroConta));
        nivel.setText(String.valueOf(char_application.nivel));

        if (char_application.swordStatus == 0) {
            sword.setBackgroundResource(R.drawable.sword2);

        } else if (char_application.swordStatus == 1) {

            sword.setBackgroundResource(R.drawable.swordlv2);

        } else if (char_application.swordStatus == 2) {

            sword.setBackgroundResource(R.drawable.swordlv3);

        } else if (char_application.swordStatus == 3) {

            sword.setBackgroundResource(R.drawable.swordlv4);

        } else if (char_application.swordStatus == 4) {

            sword.setBackgroundResource(R.drawable.swordlv5);

        } else if (char_application.swordStatus == 5) {

            sword.setBackgroundResource(R.drawable.swordlv8);

        } else if (char_application.swordStatus == 6) {

            sword.setBackgroundResource(R.drawable.swordlv7);

        } else if (char_application.swordStatus == 7) {

            sword.setBackgroundResource(R.drawable.swordlv6);

        } else if (char_application.swordStatus == 8) {

            sword.setBackgroundResource(R.drawable.viking_axe);

        }

        if (char_application.swordStatus == 0) {
            espada.setText("Sword lv1.");

        } else if (char_application.swordStatus == 1) {

            espada.setText("Gorgoroth Sword");;

        }else if (char_application.swordStatus == 2) {

            espada.setText("Tempera Sword");;

        }else if (char_application.swordStatus == 3) {

            espada.setText("Starlord Sword");;

        }else if (char_application.swordStatus == 4) {

            espada.setText("Jiraya Sword");;

        }else if (char_application.swordStatus == 5) {

            espada.setText("Carlin Sword");;

        }else if (char_application.swordStatus == 6) {

            espada.setText("Blackfyre Sword");;

        }else if (char_application.swordStatus == 7) {

            espada.setText("Master Sword");;

        }else if (char_application.swordStatus == 8) {

            espada.setText("Brutamonte Axe");;

        }
    }

    public void reset(View view){

        char_application.parametro = 0;
        char_application.parametro2 = 0;
        char_application.parametro3 = 0;
        char_application.parametro4 = 0;
        char_application.parametro5 = 0;
        char_application.parametro6 = 0;
        char_application.lifeboss1 = 1000;
        char_application.lifeboss2 = 2000;
        char_application.lifeboss3 = 6000;
        char_application.lifeboss4 = 12000;
        char_application.lifeboss5 = 24000;
        char_application.lifeboss6 = 54000;

        this.finish();
        Intent intent = new Intent(char_status.this, plainActivity.class);
        startActivity(intent);

    }

    public void hardReset(View view){

        char_application.parametro = 0;
        char_application.parametro2 = 0;
        char_application.parametro3 = 0;
        char_application.parametro4 = 0;
        char_application.parametro5 = 0;
        char_application.parametro6 = 0;
        char_application.lifeboss1 = 1000;
        char_application.lifeboss2 = 2000;
        char_application.lifeboss3 = 6000;
        char_application.lifeboss4 = 12000;
        char_application.lifeboss5 = 24000;
        char_application.lifeboss6 = 54000;
        char_application.dinheiroConta = 0;
        char_application.nivel = 0;
        char_application.swordStatus = 0;
        this.finish();
        Intent intent = new Intent(char_status.this, plainActivity.class);
        startActivity(intent);


    }

    public void back(View view){

        this.finish();
    }

    public void historia(View view){

        for (int i=0; i < 10; i++) {
            Toast.makeText(this, "A história se passa na cidade de Morbujel. Você um herói andante é desafiado a destruir o mal que se infiltrou neste vilarejo restaurando assim a vida de todo seus moradores. Reza-se a lenda que para restauração da paz é necessário encontrar a o conjunto sagrado contendo a lendária espada MasterSword e o escudo mágico Hyrule Shield. Você será capaz de tal feito?", Toast.LENGTH_LONG).show();
        }
    }

    public void tips(View view){

        for (int i=0; i < 10; i++) {
            Toast.makeText(this, " 1 - É possível passar de todas as fases. De seu jeito.\n 2 - Conviva com os bugs. Faz parte do desafio.\n 3 - Modo reset: Reiniciar os boss, porém dinheiro, espada e nível continuam.\n 4 - Hard reset: Reseta todo o jogo.", Toast.LENGTH_LONG).show();
        }
    }

}
