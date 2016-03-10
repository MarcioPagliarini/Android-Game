package com.example.marciolabin.layoutsandmoviments;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Marcio Labin on 21/12/2015.
 */
public class heaven_activity extends Activity {

    ImageView jump;
    ImageView sword;
    ImageView run1;
    ImageView run2;
    ImageView funil;
    ImageView run1boss;
    ImageView run2boss;
    ImageView funilboss;
    ImageView atkfinalboss2;
    ImageView final_position_run;
    ImageView veryjump;
    ImageView veryjump2;
    ImageView atkfinal;
    ImageView angel;
    ImageView forward;
    ImageView backward;
    ImageView atkfinalboss;
    int paremeter = 0;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.heaven_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        jump = (ImageView) findViewById(R.id.jump);
        run1 = (ImageView) findViewById(R.id.run_position1);
        run2 = (ImageView) findViewById(R.id.run_position2);
        run1boss = (ImageView) findViewById(R.id.run_positionboss);
        run2boss = (ImageView) findViewById(R.id.run_position2boss);
        sword = (ImageView) findViewById(R.id.sword);
        funil = (ImageView) findViewById(R.id.final_position);
        funilboss = (ImageView) findViewById(R.id.final_positionboss);
        final_position_run = (ImageView) findViewById(R.id.final_position_sword);
        veryjump = (ImageView) findViewById(R.id.veryjump);
        veryjump2 = (ImageView) findViewById(R.id.veryjump2);
        atkfinal = (ImageView) findViewById(R.id.finalatk);
        atkfinalboss2 = (ImageView) findViewById(R.id.finalatkboss);
        angel = (ImageView) findViewById(R.id.angel);
        forward = (ImageView) findViewById(R.id.flechaseguir);
        backward = (ImageView) findViewById(R.id.flechatown);
        atkfinalboss = (ImageView) findViewById(R.id.bossAtkend);
        //  char_application.nivel = 2;
        //bossAtack();

        for (int i=0; i < 4; i++) {
            Toast toast=Toast.makeText(this, "Nobre guerreiro... Você destruiu os dez lacaios do senhor mal, me libertando assim da minha prisão eterna no qual fui aprisionado na invasão do vilarejo... Você é merecedor da sagrada espada de Hyrule, a MasterSword. Tome! E destrua o mal supremo da cidade de Morbujel para sempre! A minha missão está terminada... Obrigado nobre guerreiro, minha alma estará com você...", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        new Handler().postDelayed(new Runnable() {
            public void run() {
                angel.setImageResource(android.R.color.transparent);
                angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                angel.setBackgroundResource(R.drawable.sorcereroflight_exit1);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        angel.setImageResource(android.R.color.transparent);
                        angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        angel.setBackgroundResource(R.drawable.sorcereroflight_exit2);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                angel.setImageResource(android.R.color.transparent);
                                angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                angel.setBackgroundResource(R.drawable.sorcereroflight_exit3);
                                new Handler().postDelayed(new Runnable() {
                                    public void run() {
                                        angel.setImageResource(android.R.color.transparent);
                                        angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                        angel.setBackgroundResource(R.drawable.sorcereroflight_exit4);
                                        new Handler().postDelayed(new Runnable() {
                                            public void run() {
                                                angel.setImageResource(android.R.color.transparent);
                                                angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                angel.setBackgroundResource(R.drawable.sorcereroflight_exit5);
                                                new Handler().postDelayed(new Runnable() {
                                                    public void run() {
                                                        angel.setImageResource(android.R.color.transparent);
                                                        angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                        angel.setBackgroundResource(R.drawable.sorcereroflight_exit6);
                                                        char_application.masterSword = 1;
                                                        char_application.swordStatus = 7;
                                                        char_application.dinheiroConta = 0;
                                                        new Handler().postDelayed(new Runnable() {
                                                            public void run() {
                                                                sword.setImageResource(android.R.color.transparent);
                                                                sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                sword.setBackgroundResource(R.drawable.swordlv6);
                                                                new Handler().postDelayed(new Runnable() {
                                                                    public void run() {
                                                                        lastBoss();
                                                                    }
                                                                }, 1000);
                                                            }
                                                        }, 2000);
                                                    }
                                                }, 2000);
                                            }
                                        }, 2000);
                                    }
                                }, 2000);
                            }
                        }, 2000);
                    }
                }, 2000);
            }
        }, 2000);

        if (char_application.swordStatus == 0) {

            char_application.lifeboss10 = 48000;
        }

        funil.setTag(android.R.color.transparent);
        veryjump.setTag(android.R.color.holo_orange_light);
        run2.setTag(android.R.color.holo_orange_light);

       /* if (char_application.parametro10 == 10000) {
            angel.setImageResource(android.R.color.transparent);
            angel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            forward.setBackgroundResource(R.drawable.flecha_right);
            backward.setBackgroundResource(R.drawable.flecha_left);
        }*/

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
    }

    public void lastBoss() {
        Toast.makeText(heaven_activity.this,
                "Você adquiriu a MasterSword! Destrua o mal supremo!", Toast.LENGTH_SHORT).show();
        this.finish();
        Intent intent = new Intent(heaven_activity.this, townActivity.class);
        startActivity(intent);

    }

    public void startCall(View view) {
        Intent intent = new Intent(heaven_activity.this, char_status.class);
        startActivity(intent);
    }

    public void nextLevel(View view) {
        Toast.makeText(heaven_activity.this,
                "ESPERE O BOSS 10!", Toast.LENGTH_SHORT).show();

    }

    public void goTown(View view) {

        this.finish();
        if (char_application.parametro10 == 10000) {
            Intent intent = new Intent(heaven_activity.this, bluemoon_activity.class);
            startActivity(intent);

        } else if (char_application.parametro10 != 10000) {
            Toast.makeText(heaven_activity.this,
                    "Mate o chefão primeiro seu lixo!", Toast.LENGTH_SHORT).show();

        }
    }

    public void goDie() {

        this.finish();
        Intent intent = new Intent(heaven_activity.this, townActivity.class);
        startActivity(intent);

    }

}
