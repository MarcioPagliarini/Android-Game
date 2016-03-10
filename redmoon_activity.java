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
public class redmoon_activity extends Activity {

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
    ImageView clown;
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
        setContentView(R.layout.redmoon_layout);
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
        clown = (ImageView) findViewById(R.id.clown);
        forward = (ImageView) findViewById(R.id.flechaseguir);
        backward = (ImageView) findViewById(R.id.flechatown);
        atkfinalboss = (ImageView) findViewById(R.id.bossAtkend);
        //  char_application.nivel = 2;
        bossAtack();

        if (char_application.swordStatus == 0) {

            char_application.lifeboss11 = 48000;
        }

        funil.setTag(android.R.color.transparent);
        veryjump.setTag(android.R.color.holo_orange_light);
        run2.setTag(android.R.color.holo_orange_light);

        if (char_application.parametro11 == 10000) {
            clown.setImageResource(android.R.color.transparent);
            clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            forward.setBackgroundResource(R.drawable.flecha_right);
            backward.setBackgroundResource(R.drawable.flecha_left);
        }

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

    public void jumpClick2(View view) {

        if (funil.getTag().equals(android.R.color.transparent)) {

            funil.setImageResource(android.R.color.transparent);
            funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            sword.setImageResource(android.R.color.transparent);
            sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            jump.setImageResource(android.R.color.transparent);
            //jump.setBackgroundResource(R.drawable.jumpalternative3);
            veryjump.setBackgroundResource(R.drawable.jumpalternative3);
            veryjump.setTag(android.R.color.holo_orange_dark);
            mHandler.postDelayed(new Runnable() {
                public void run() {

                    sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    veryjump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    veryjump.setImageResource(android.R.color.transparent);
                    jump.setBackgroundResource(R.drawable.standup2);
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
                    veryjump.setTag(android.R.color.holo_orange_light);
                }
            }, 1000);
        } else if (jump.getTag().equals(android.R.color.transparent)) {
            //bossAtack();
            jump.setImageResource(android.R.color.transparent);
            jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            final_position_run.setImageResource(android.R.color.transparent);
            final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            funil.setImageResource(android.R.color.transparent);
            funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            //funil.setBackgroundResource(R.drawable.jumpalternative3);
            veryjump2.setBackgroundResource(R.drawable.jumpalternative3);
            mHandler.postDelayed(new Runnable() {
                public void run() {
                    //final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    veryjump2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    funil.setImageResource(android.R.color.transparent);
                    funil.setBackgroundResource(R.drawable.standup2);
                    if (char_application.swordStatus == 0) {
                        final_position_run.setBackgroundResource(R.drawable.sword2);

                    } else if (char_application.swordStatus == 1) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv2);

                    } else if (char_application.swordStatus == 2) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv3);

                    } else if (char_application.swordStatus == 3) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv4);

                    } else if (char_application.swordStatus == 4) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv5);

                    } else if (char_application.swordStatus == 5) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv8);

                    } else if (char_application.swordStatus == 6) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv7);

                    } else if (char_application.swordStatus == 7) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv6);

                    } else if (char_application.swordStatus == 8) {

                        final_position_run.setBackgroundResource(R.drawable.viking_axe);

                    }
                    sword.setImageResource(android.R.color.transparent);
                    sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                }
            }, 500);
        }
    }

    public void sitDown2(View view) {


        if (funil.getTag().equals(android.R.color.transparent)) {
            //bossAtack();
            funil.setImageResource(android.R.color.transparent);
            funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            sword.setImageResource(android.R.color.transparent);
            sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            jump.setImageResource(android.R.color.transparent);
            jump.setBackgroundResource(R.drawable.jumpalternative4);

            mHandler.postDelayed(new Runnable() {
                public void run() {
                    sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    jump.setImageResource(android.R.color.transparent);
                    jump.setBackgroundResource(R.drawable.standup2);
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
            }, 500);
        } else if (jump.getTag().equals(android.R.color.transparent)) {
            //bossAtack();
            jump.setImageResource(android.R.color.transparent);
            jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            final_position_run.setImageResource(android.R.color.transparent);
            final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            funil.setImageResource(android.R.color.transparent);
            funil.setBackgroundResource(R.drawable.jumpalternative4);

            mHandler.postDelayed(new Runnable() {
                public void run() {
                    final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    funil.setImageResource(android.R.color.transparent);
                    funil.setBackgroundResource(R.drawable.standup2);
                    if (char_application.swordStatus == 0) {
                        final_position_run.setBackgroundResource(R.drawable.sword2);

                    } else if (char_application.swordStatus == 1) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv2);

                    } else if (char_application.swordStatus == 2) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv3);

                    } else if (char_application.swordStatus == 3) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv4);

                    } else if (char_application.swordStatus == 4) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv5);

                    } else if (char_application.swordStatus == 5) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv8);

                    } else if (char_application.swordStatus == 6) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv7);

                    } else if (char_application.swordStatus == 7) {

                        final_position_run.setBackgroundResource(R.drawable.swordlv6);

                    } else if (char_application.swordStatus == 8) {

                        final_position_run.setBackgroundResource(R.drawable.viking_axe);

                    }
                    sword.setImageResource(android.R.color.transparent);
                    sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                }
            }, 500);
        }
    }

    public void runClick2(View view) {

        run2.setTag(android.R.color.darker_gray);
        final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        funil.setImageResource(android.R.color.transparent);
        funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        jump.setImageResource(android.R.color.transparent);
        jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        sword.setImageResource(android.R.color.transparent);
        sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        jump.setBackgroundResource(R.drawable.standup2);

        mHandler.postDelayed(new Runnable() {
            public void run() {
                jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                run1.setBackgroundResource(R.drawable.running3);
                mHandler.postDelayed(new Runnable() {
                    public void run() {
                        run1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                        sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        run2.setBackgroundResource(R.drawable.running4);
                        mHandler.postDelayed(new Runnable() {
                            public void run() {
                                run2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                funil.setBackgroundResource(R.drawable.standup2);
                                if (char_application.swordStatus == 0) {
                                    final_position_run.setBackgroundResource(R.drawable.sword2);

                                } else if (char_application.swordStatus == 1) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv2);

                                } else if (char_application.swordStatus == 2) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv3);

                                } else if (char_application.swordStatus == 3) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv4);

                                } else if (char_application.swordStatus == 4) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv5);

                                } else if (char_application.swordStatus == 5) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv8);

                                } else if (char_application.swordStatus == 6) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv7);

                                } else if (char_application.swordStatus == 7) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv6);

                                } else if (char_application.swordStatus == 8) {

                                    final_position_run.setBackgroundResource(R.drawable.viking_axe);

                                }

                            }
                        }, 500);
                    }
                }, 500);
            }

        }, 500);
        jump.setTag(android.R.color.transparent);
        funil.setTag(android.R.color.black);
    }

    public void runBack2(View view) {

        final_position_run.setImageResource(android.R.color.transparent);
        final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        funil.setImageResource(android.R.color.transparent);
        funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        jump.setImageResource(android.R.color.transparent);
        jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        sword.setImageResource(android.R.color.transparent);
        sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        funil.setBackgroundResource(R.drawable.standup2);
        mHandler.postDelayed(new Runnable() {
            public void run() {
                funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                run2.setBackgroundResource(R.drawable.running_back1);
                mHandler.postDelayed(new Runnable() {
                    public void run() {
                        run2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                        sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        run1.setBackgroundResource(R.drawable.running_back2);
                        mHandler.postDelayed(new Runnable() {
                            public void run() {
                                run1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                jump.setBackgroundResource(R.drawable.standup2);
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
                                final_position_run.setImageResource(android.R.color.transparent);
                                final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                            }
                        }, 500);
                    }
                }, 500);
            }

        }, 500);
        funil.setTag(android.R.color.transparent);
        jump.setTag(android.R.color.black);
    }

    public void ataqueSword2(View view) {
        if (char_application.gameFim == 1) {

            return;
        } else if (char_application.gameFim == 0) {
            bossAtack();
            if (funil.getTag().equals(android.R.color.transparent)) {
                // bossAtack();
                sword.setImageResource(android.R.color.transparent);
                sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                if (char_application.swordStatus == 0) {
                    run1.setBackgroundResource(R.drawable.sword_horizontal2);
                } else if (char_application.swordStatus == 1) {

                    run1.setBackgroundResource(R.drawable.swordlv2_high);
                } else if (char_application.swordStatus == 2) {

                    run1.setBackgroundResource(R.drawable.swordlv3_high);
                } else if (char_application.swordStatus == 3) {

                    run1.setBackgroundResource(R.drawable.swordlv4_high);
                } else if (char_application.swordStatus == 4) {

                    run1.setBackgroundResource(R.drawable.swordlv5_high);
                } else if (char_application.swordStatus == 5) {

                    run1.setBackgroundResource(R.drawable.swordlv8_high);
                } else if (char_application.swordStatus == 6) {

                    run1.setBackgroundResource(R.drawable.swordlv7_high);
                } else if (char_application.swordStatus == 7) {

                    run1.setBackgroundResource(R.drawable.swordlv6_high);
                } else if (char_application.swordStatus == 8) {

                    run1.setBackgroundResource(R.drawable.viking_axe_horizontal);
                }
                mHandler.postDelayed(new Runnable() {
                    public void run() {
                        run1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        if (char_application.swordStatus == 0) {
                            run2.setBackgroundResource(R.drawable.sword_horizontal2);
                        } else if (char_application.swordStatus == 1) {

                            run2.setBackgroundResource(R.drawable.swordlv2_high);
                        } else if (char_application.swordStatus == 2) {

                            run2.setBackgroundResource(R.drawable.swordlv3_high);
                        } else if (char_application.swordStatus == 3) {

                            run2.setBackgroundResource(R.drawable.swordlv4_high);
                        } else if (char_application.swordStatus == 4) {

                            run2.setBackgroundResource(R.drawable.swordlv5_high);
                        } else if (char_application.swordStatus == 5) {

                            run2.setBackgroundResource(R.drawable.swordlv8_high);
                        } else if (char_application.swordStatus == 6) {

                            run2.setBackgroundResource(R.drawable.swordlv7_high);
                        } else if (char_application.swordStatus == 7) {

                            run2.setBackgroundResource(R.drawable.swordlv6_high);
                        } else if (char_application.swordStatus == 8) {

                            run2.setBackgroundResource(R.drawable.viking_axe_horizontal);
                        }
                        mHandler.postDelayed(new Runnable() {
                            public void run() {
                                run2.setImageResource(android.R.color.transparent);
                                run2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                if (char_application.swordStatus == 0) {
                                    funil.setBackgroundResource(R.drawable.sword_horizontal2);
                                } else if (char_application.swordStatus == 1) {

                                    funil.setBackgroundResource(R.drawable.swordlv2_high);
                                } else if (char_application.swordStatus == 2) {

                                    funil.setBackgroundResource(R.drawable.swordlv3_high);
                                } else if (char_application.swordStatus == 3) {

                                    funil.setBackgroundResource(R.drawable.swordlv4_high);
                                } else if (char_application.swordStatus == 4) {

                                    funil.setBackgroundResource(R.drawable.swordlv5_high);
                                } else if (char_application.swordStatus == 5) {

                                    funil.setBackgroundResource(R.drawable.swordlv8_high);
                                } else if (char_application.swordStatus == 6) {

                                    funil.setBackgroundResource(R.drawable.swordlv7_high);
                                } else if (char_application.swordStatus == 7) {

                                    funil.setBackgroundResource(R.drawable.swordlv6_high);
                                } else if (char_application.swordStatus == 8) {

                                    funil.setBackgroundResource(R.drawable.viking_axe_horizontal);
                                }
                                mHandler.postDelayed(new Runnable() {
                                    public void run() {
                                        funil.setImageResource(android.R.color.transparent);
                                        funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                        clown.setImageResource(android.R.color.transparent);
                                        clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                        if (char_application.swordStatus == 0) {
                                            atkfinal.setBackgroundResource(R.drawable.sword_horizontal2);
                                        } else if (char_application.swordStatus == 1) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv2_high);
                                        } else if (char_application.swordStatus == 2) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv3_high);
                                        } else if (char_application.swordStatus == 3) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv4_high);
                                        } else if (char_application.swordStatus == 4) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv5_high);
                                        } else if (char_application.swordStatus == 5) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv8_high);
                                        } else if (char_application.swordStatus == 6) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv7_high);
                                        } else if (char_application.swordStatus == 7) {

                                            atkfinal.setBackgroundResource(R.drawable.swordlv6_high);
                                        } else if (char_application.swordStatus == 8) {

                                            atkfinal.setBackgroundResource(R.drawable.viking_axe_horizontal);
                                        }
                                        if (char_application.parametro11 != 10000 && paremeter == 0) {

                                            clown.setBackgroundResource(R.drawable.bossfinal_damage);
                                        } else if (char_application.parametro11 != 10000 && paremeter == 1) {
                                            clown.setBackgroundResource(R.drawable.bossfinal2_damage);
                                        }
                                        mHandler.postDelayed(new Runnable() {
                                            public void run() {
                                                atkfinal.setImageResource(android.R.color.transparent);
                                                atkfinal.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                                                    char_application.lifeboss11 = char_application.lifeboss11 - 500;

                                                } else if (char_application.swordStatus == 1) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 1000;

                                                } else if (char_application.swordStatus == 2) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 2000;

                                                } else if (char_application.swordStatus == 3) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 4000;

                                                } else if (char_application.swordStatus == 4) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 6000;

                                                } else if (char_application.swordStatus == 5) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 11000;

                                                } else if (char_application.swordStatus == 6) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 18000;

                                                } else if (char_application.swordStatus == 7) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 100000;

                                                } else if (char_application.swordStatus == 8) {

                                                    char_application.lifeboss11 = char_application.lifeboss11 - 13000;

                                                }

                                                if (char_application.lifeboss11 < 0) {

                                                    char_application.lifeboss11 = 0;
                                                }

                                                if (char_application.lifeboss11 == 0) {

                                                    clown.setImageResource(android.R.color.transparent);
                                                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                    char_application.parametro11 = 10000;
                                                    char_application.gameFim = 1;
                                                    mHandler.postDelayed(new Runnable() {
                                                        public void run() {
                                                            char_application.nivel = 11;
                                                            char_application.dinheiroConta = char_application.dinheiroConta + 0;
                                                            clown.setImageResource(android.R.color.transparent);
                                                            clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                       /* forward.setBackgroundResource(R.drawable.flecha_right);
                                        backward.setBackgroundResource(R.drawable.flecha_left);*/
                                                            mHandler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    clown.setImageResource(android.R.color.transparent);
                                                                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                    clown.setBackgroundResource(R.drawable.shadowboss_default);
                                                                    mHandler.postDelayed(new Runnable() {
                                                                        public void run() {
                                                                            clown.setImageResource(android.R.color.transparent);
                                                                            clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                            clown.setBackgroundResource(R.drawable.shadowboss_end1);
                                                                            mHandler.postDelayed(new Runnable() {
                                                                                public void run() {
                                                                                    clown.setImageResource(android.R.color.transparent);
                                                                                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                                    clown.setBackgroundResource(R.drawable.shadowboss_end2);
                                                                                    mHandler.postDelayed(new Runnable() {
                                                                                        public void run() {
                                                                                            clown.setImageResource(android.R.color.transparent);
                                                                                            clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                                            clown.setBackgroundResource(R.drawable.shadowboss_end3);
                                                                                            mHandler.postDelayed(new Runnable() {
                                                                                                public void run() {
                                                                                                    clown.setImageResource(android.R.color.transparent);
                                                                                                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                                                    clown.setBackgroundResource(R.drawable.shield);
                                                                                                    endGame();
                                                                                                    mHandler.postDelayed(new Runnable() {
                                                                                                        public void run() {
                                                                                                            endGame2();
                                                                                                        }
                                                                                                    }, 3000);
                                                                                                }
                                                                                            }, 3000);
                                                                                        }
                                                                                    }, 3000);
                                                                                }
                                                                            }, 3000);
                                                                        }
                                                                    }, 3000);
                                                                }
                                                            }, 3000);
                                                        }
                                                    }, 3000);


                                                } else if (char_application.lifeboss11 > 0 && paremeter == 0) {

                                                    clown.setBackgroundResource(R.drawable.bossfinal_default);

                                                } else if (char_application.lifeboss11 > 0 && paremeter == 1) {

                                                    clown.setBackgroundResource(R.drawable.bossfinal2_default);

                                                }
                                            }
                                        }, 100);
                                    }
                                }, 100);
                            }
                        }, 100);
                    }
                }, 100);
            } else if (jump.getTag().equals(android.R.color.transparent)) {
                final_position_run.setImageResource(android.R.color.transparent);
                final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                funil.setBackgroundResource(R.drawable.standup2);
                mHandler.postDelayed(new Runnable() {
                    public void run() {
                        if (char_application.swordStatus == 0) {
                            atkfinal.setBackgroundResource(R.drawable.sword_horizontal2);
                        } else if (char_application.swordStatus == 1) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv2_high);
                        } else if (char_application.swordStatus == 2) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv3_high);
                        } else if (char_application.swordStatus == 3) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv4_high);
                        } else if (char_application.swordStatus == 4) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv5_high);
                        } else if (char_application.swordStatus == 5) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv8_high);
                        } else if (char_application.swordStatus == 6) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv7_high);
                        } else if (char_application.swordStatus == 7) {

                            atkfinal.setBackgroundResource(R.drawable.swordlv6_high);
                        } else if (char_application.swordStatus == 8) {

                            atkfinal.setBackgroundResource(R.drawable.viking_axe_horizontal);
                        }
                        clown.setImageResource(android.R.color.transparent);
                        clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        if (char_application.parametro11 != 10000 && paremeter == 0) {

                            clown.setBackgroundResource(R.drawable.bossfinal_damage);
                        } else if (char_application.parametro11 != 10000 && paremeter == 1) {
                            clown.setBackgroundResource(R.drawable.bossfinal2_damage);
                        }
                        mHandler.postDelayed(new Runnable() {
                            public void run() {
                                bossAtack();
                                atkfinal.setImageResource(android.R.color.transparent);
                                atkfinal.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                if (char_application.swordStatus == 0) {
                                    final_position_run.setBackgroundResource(R.drawable.sword2);

                                } else if (char_application.swordStatus == 1) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv2);

                                } else if (char_application.swordStatus == 2) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv3);

                                } else if (char_application.swordStatus == 3) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv4);

                                } else if (char_application.swordStatus == 4) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv5);

                                } else if (char_application.swordStatus == 5) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv8);

                                } else if (char_application.swordStatus == 6) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv7);

                                } else if (char_application.swordStatus == 7) {

                                    final_position_run.setBackgroundResource(R.drawable.swordlv6);

                                } else if (char_application.swordStatus == 8) {

                                    final_position_run.setBackgroundResource(R.drawable.viking_axe);

                                }

                                if (char_application.swordStatus == 0) {
                                    char_application.lifeboss11 = char_application.lifeboss11 - 500;

                                } else if (char_application.swordStatus == 1) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 1000;

                                } else if (char_application.swordStatus == 2) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 2000;

                                } else if (char_application.swordStatus == 3) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 4000;

                                } else if (char_application.swordStatus == 4) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 6000;

                                } else if (char_application.swordStatus == 5) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 11000;

                                } else if (char_application.swordStatus == 6) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 18000;

                                } else if (char_application.swordStatus == 7) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 100000;

                                } else if (char_application.swordStatus == 8) {

                                    char_application.lifeboss11 = char_application.lifeboss11 - 13000;

                                }

                                if (char_application.lifeboss11 < 0) {

                                    char_application.lifeboss11 = 0;
                                }
                                            /*Toast.makeText(pantanoActivity.this,
                                                    "Conta deletada!" + char_application.dinheiroConta, Toast.LENGTH_SHORT).show();*/
                                if (char_application.lifeboss11 == 0) {
                                    clown.setImageResource(android.R.color.transparent);
                                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                    char_application.parametro11 = 10000;
                                    char_application.gameFim = 1;
                                    mHandler.postDelayed(new Runnable() {
                                        public void run() {
                                            char_application.nivel = 11;
                                            char_application.dinheiroConta = char_application.dinheiroConta + 0;
                                            clown.setImageResource(android.R.color.transparent);
                                            clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                       /* forward.setBackgroundResource(R.drawable.flecha_right);
                                        backward.setBackgroundResource(R.drawable.flecha_left);*/
                                        }
                                    }, 3000);

                                } else if (char_application.lifeboss11 > 0 && paremeter == 0) {

                                    clown.setBackgroundResource(R.drawable.bossfinal_default);

                                } else if (char_application.lifeboss11 > 0 && paremeter == 1) {

                                    clown.setBackgroundResource(R.drawable.bossfinal2_default);

                                }
                            }
                        }, 100);
                    }
                }, 100);
            }
        }
    }

    public void bossAtack() {

        if (char_application.parametro11 == 10000) {

            return;
        }

        if (char_application.lifeboss11 > 500000) {

            mHandler.postDelayed(new Runnable() {
                public void run() {
                    clown.setImageResource(android.R.color.transparent);
                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clown.setBackgroundResource(R.drawable.bossfinal_default);
                    mHandler.postDelayed(new Runnable() {
                        public void run() {
                            if (char_application.parametro11 != 10000) {
                                clown.setBackgroundResource(R.drawable.bossfinal_default);
                            }
                            veryjump.setTag(android.R.color.holo_orange_light);
                            atkfinalboss2.setBackgroundResource(R.drawable.orb_power);
                            mHandler.postDelayed(new Runnable() {
                                public void run() {
                                    atkfinalboss2.setImageResource(android.R.color.transparent);
                                    atkfinalboss2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                    funilboss.setBackgroundResource(R.drawable.orb_power);

                                    if (run2.getTag().equals(android.R.color.darker_gray)) {

                                        run2boss.setBackgroundResource(R.drawable.orb_power);
                                        Toast.makeText(redmoon_activity.this,
                                                "Voce morreu!", Toast.LENGTH_SHORT).show();
                                        goDie();
                                        char_application.dinheiroConta = 0;
                                        //char_application.nivel = 0;
                                        char_application.lifeboss11 = 1000000;
                                        char_application.lifeboss10 = 180000;
                                        char_application.lifeboss9 = 108000;
                                        char_application.lifeboss8 = 78000;
                                        char_application.lifeboss7 = 66000;
                                        char_application.lifeboss6 = 54000;
                                        char_application.lifeboss5 = 24000;
                                        char_application.lifeboss4 = 12000;
                                        char_application.lifeboss3 = 6000;
                                        char_application.lifeboss2 = 2000;
                                        char_application.lifeboss1 = 1000;
                                        char_application.parametro = 0;
                                        char_application.parametro2 = 0;
                                        char_application.parametro3 = 0;
                                        char_application.parametro4 = 0;
                                        char_application.parametro5 = 0;
                                        char_application.parametro6 = 0;
                                        char_application.parametro7 = 0;
                                        char_application.parametro8 = 0;
                                        char_application.parametro9 = 0;
                                        char_application.parametro10 = 0;
                                        char_application.parametro11 = 0;
                                        forward.setImageResource(android.R.color.transparent);
                                        forward.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                        clown.setBackgroundResource(R.drawable.bossfinal_default);


                                    } else if (veryjump.getTag().equals(android.R.color.holo_orange_light)) {
                                        veryjump.setTag(android.R.color.holo_orange_light);
                                    }
                                    mHandler.postDelayed(new Runnable() {
                                        public void run() {
                                            funilboss.setImageResource(android.R.color.transparent);
                                            funilboss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                            run2boss.setBackgroundResource(R.drawable.orb_power);
                                            mHandler.postDelayed(new Runnable() {
                                                public void run() {
                                                    run2boss.setImageResource(android.R.color.transparent);
                                                    run2boss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                    // run1boss.setBackgroundResource(R.drawable.orb_power);

                                                    if (veryjump.getTag().equals(android.R.color.holo_orange_dark)) {
                                                        jump.setBackgroundResource(R.drawable.orb_power);

                                                    } else if (veryjump.getTag().equals(android.R.color.holo_orange_light)) {
                                                        run1boss.setBackgroundResource(R.drawable.orb_power);
                                                        Toast.makeText(redmoon_activity.this,
                                                                "Voce morreu!", Toast.LENGTH_SHORT).show();
                                                        goDie();
                                                        char_application.dinheiroConta = 0;
                                                        //char_application.nivel = 0;
                                                        char_application.lifeboss11 = 1000000;
                                                        char_application.lifeboss10 = 180000;
                                                        char_application.lifeboss9 = 108000;
                                                        char_application.lifeboss8 = 78000;
                                                        char_application.lifeboss7 = 66000;
                                                        char_application.lifeboss6 = 54000;
                                                        char_application.lifeboss5 = 24000;
                                                        char_application.lifeboss4 = 12000;
                                                        char_application.lifeboss3 = 6000;
                                                        char_application.lifeboss2 = 2000;
                                                        char_application.lifeboss1 = 1000;
                                                        char_application.parametro = 0;
                                                        char_application.parametro2 = 0;
                                                        char_application.parametro3 = 0;
                                                        char_application.parametro4 = 0;
                                                        char_application.parametro5 = 0;
                                                        char_application.parametro6 = 0;
                                                        char_application.parametro7 = 0;
                                                        char_application.parametro8 = 0;
                                                        char_application.parametro9 = 0;
                                                        char_application.parametro10 = 0;
                                                        char_application.parametro11 = 0;
                                                        forward.setImageResource(android.R.color.transparent);
                                                        forward.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                        clown.setBackgroundResource(R.drawable.bossfinal_default);

                                                    }

                                                    mHandler.postDelayed(new Runnable() {
                                                        public void run() {
                                                            run1boss.setImageResource(android.R.color.transparent);
                                                            run1boss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                            atkfinalboss.setBackgroundResource(R.drawable.orb_power);
                                                            mHandler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    atkfinalboss.setImageResource(android.R.color.transparent);
                                                                    atkfinalboss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                }
                                                            }, 150);
                                                        }
                                                    }, 150);
                                                }
                                            }, 150);
                                        }
                                    }, 150);
                                }
                            }, 150);
                        }
                    }, 150);
                }
            }, 100);
        } else if (char_application.lifeboss11 <= 500000) {
            paremeter = 1;
            mHandler.postDelayed(new Runnable() {
                public void run() {
                    clown.setImageResource(android.R.color.transparent);
                    clown.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clown.setBackgroundResource(R.drawable.bossfinal2_default);
                    mHandler.postDelayed(new Runnable() {
                        public void run() {
                            if (char_application.parametro11 != 10000) {
                                clown.setBackgroundResource(R.drawable.bossfinal2_default);
                            }
                            veryjump.setTag(android.R.color.holo_orange_light);
                            atkfinalboss2.setBackgroundResource(R.drawable.orb_power);
                            mHandler.postDelayed(new Runnable() {
                                public void run() {
                                    atkfinalboss2.setImageResource(android.R.color.transparent);
                                    atkfinalboss2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                    funilboss.setBackgroundResource(R.drawable.orb_power);

                                    if (run2.getTag().equals(android.R.color.darker_gray)) {

                                        run2boss.setBackgroundResource(R.drawable.orb_power);
                                        Toast.makeText(redmoon_activity.this,
                                                "Voce morreu!", Toast.LENGTH_SHORT).show();
                                        goDie();
                                        char_application.dinheiroConta = 0;
                                        //char_application.nivel = 0;
                                        char_application.lifeboss11 = 1000000;
                                        char_application.lifeboss10 = 180000;
                                        char_application.lifeboss9 = 108000;
                                        char_application.lifeboss8 = 78000;
                                        char_application.lifeboss7 = 66000;
                                        char_application.lifeboss6 = 54000;
                                        char_application.lifeboss5 = 24000;
                                        char_application.lifeboss4 = 12000;
                                        char_application.lifeboss3 = 6000;
                                        char_application.lifeboss2 = 2000;
                                        char_application.lifeboss1 = 1000;
                                        char_application.parametro = 0;
                                        char_application.parametro2 = 0;
                                        char_application.parametro3 = 0;
                                        char_application.parametro4 = 0;
                                        char_application.parametro5 = 0;
                                        char_application.parametro6 = 0;
                                        char_application.parametro7 = 0;
                                        char_application.parametro8 = 0;
                                        char_application.parametro9 = 0;
                                        char_application.parametro10 = 0;
                                        char_application.parametro11 = 0;
                                        forward.setImageResource(android.R.color.transparent);
                                        forward.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                        clown.setBackgroundResource(R.drawable.bossfinal2_default);


                                    } else if (veryjump.getTag().equals(android.R.color.holo_orange_light)) {
                                        veryjump.setTag(android.R.color.holo_orange_light);
                                    }
                                    mHandler.postDelayed(new Runnable() {
                                        public void run() {
                                            funilboss.setImageResource(android.R.color.transparent);
                                            funilboss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                            run2boss.setBackgroundResource(R.drawable.orb_power);
                                            mHandler.postDelayed(new Runnable() {
                                                public void run() {
                                                    run2boss.setImageResource(android.R.color.transparent);
                                                    run2boss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                    // run1boss.setBackgroundResource(R.drawable.orb_power);

                                                    if (veryjump.getTag().equals(android.R.color.holo_orange_dark)) {
                                                        jump.setBackgroundResource(R.drawable.orb_power);

                                                    } else if (veryjump.getTag().equals(android.R.color.holo_orange_light)) {
                                                        run1boss.setBackgroundResource(R.drawable.orb_power);
                                                        Toast.makeText(redmoon_activity.this,
                                                                "Voce morreu!", Toast.LENGTH_SHORT).show();
                                                        goDie();
                                                        char_application.dinheiroConta = 0;
                                                        //char_application.nivel = 0;
                                                        char_application.lifeboss11 = 1000000;
                                                        char_application.lifeboss10 = 180000;
                                                        char_application.lifeboss9 = 108000;
                                                        char_application.lifeboss8 = 78000;
                                                        char_application.lifeboss7 = 66000;
                                                        char_application.lifeboss6 = 54000;
                                                        char_application.lifeboss5 = 24000;
                                                        char_application.lifeboss4 = 12000;
                                                        char_application.lifeboss3 = 6000;
                                                        char_application.lifeboss2 = 2000;
                                                        char_application.lifeboss1 = 1000;
                                                        char_application.parametro = 0;
                                                        char_application.parametro2 = 0;
                                                        char_application.parametro3 = 0;
                                                        char_application.parametro4 = 0;
                                                        char_application.parametro5 = 0;
                                                        char_application.parametro6 = 0;
                                                        char_application.parametro7 = 0;
                                                        char_application.parametro8 = 0;
                                                        char_application.parametro9 = 0;
                                                        char_application.parametro10 = 0;
                                                        char_application.parametro11 = 0;
                                                        forward.setImageResource(android.R.color.transparent);
                                                        forward.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                        clown.setBackgroundResource(R.drawable.bossfinal2_default);

                                                    }

                                                    mHandler.postDelayed(new Runnable() {
                                                        public void run() {
                                                            run1boss.setImageResource(android.R.color.transparent);
                                                            run1boss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                            atkfinalboss.setBackgroundResource(R.drawable.orb_power);
                                                            mHandler.postDelayed(new Runnable() {
                                                                public void run() {
                                                                    atkfinalboss.setImageResource(android.R.color.transparent);
                                                                    atkfinalboss.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                                                                }
                                                            }, 100);
                                                        }
                                                    }, 100);
                                                }
                                            }, 100);
                                        }
                                    }, 100);
                                }
                            }, 100);
                        }
                    }, 100);
                }
            }, 100);

        }
    }

    public void startCall(View view) {
        Intent intent = new Intent(redmoon_activity.this, char_status.class);
        startActivity(intent);
    }

    public void endGame() {

        for (int i = 0; i < 3; i++) {
            Toast toast = Toast.makeText(this, "Nobre guerreiro... Você destruiu o grande mal supremo e conquistou o Hyrule Shield... Você restaurou a cidade de Morbujel e agora eu posso descansar em paz... Obrigado grande guerreiro!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void endGame2() {

        Intent intent = new Intent(redmoon_activity.this, endActivity.class);
        startActivity(intent);
    }

    public void nextLevel(View view) {
        this.finish();
        if (char_application.parametro11 == 10000) {
            Intent intent = new Intent(redmoon_activity.this, heaven_activity.class);
            startActivity(intent);

        } else if (char_application.parametro11 != 10000) {
            Toast.makeText(redmoon_activity.this,
                    "Mate o chefão primeiro seu lixo!", Toast.LENGTH_SHORT).show();

        }

    }

    public void goTown(View view) {

        this.finish();
        if (char_application.parametro11 == 10000) {
            Intent intent = new Intent(redmoon_activity.this, bluemoon_activity.class);
            startActivity(intent);

        } else if (char_application.parametro11 != 10000) {
            Toast.makeText(redmoon_activity.this,
                    "Mate o chefão primeiro seu lixo!", Toast.LENGTH_SHORT).show();

        }
    }

    public void goDie() {

        this.finish();
        Intent intent = new Intent(redmoon_activity.this, townActivity.class);
        startActivity(intent);

    }

}
