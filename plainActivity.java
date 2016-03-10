package com.example.marciolabin.layoutsandmoviments;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by Marcio Labin on 02/12/2015.
 */
public class plainActivity extends Activity {


    ImageView jump;
    ImageView sword;
    ImageView run1;
    ImageView run2;
    ImageView funil;
    ImageView final_position_run;
    ImageView veryjump;
    ImageView veryjump2;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.plain_activity_layout);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        jump =(ImageView)findViewById(R.id.jump);
        run1 = (ImageView)findViewById(R.id.run_position1);
        run2 = (ImageView)findViewById(R.id.run_position2);
        sword =(ImageView)findViewById(R.id.sword);
        funil =(ImageView)findViewById(R.id.final_position);
        final_position_run = (ImageView)findViewById(R.id.final_position_sword);
        veryjump = (ImageView)findViewById(R.id.veryjump);
        veryjump2 = (ImageView)findViewById(R.id.veryjump2);
        funil.setTag(android.R.color.transparent);

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

    public void jumpClick(View view) {

        if(funil.getTag().equals(android.R.color.transparent)) {
            funil.setImageResource(android.R.color.transparent);
            funil.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            sword.setImageResource(android.R.color.transparent);
            sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            jump.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            jump.setImageResource(android.R.color.transparent);
            //jump.setBackgroundResource(R.drawable.jumpalternative3);
            veryjump.setBackgroundResource(R.drawable.jumpalternative3);
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
                }
            }, 1000);
        }else if(jump.getTag().equals(android.R.color.transparent)){
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
            }, 1000);
        }
    }

    public void sitDown(View view) {

        if(funil.getTag().equals(android.R.color.transparent)){
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
            }, 1000);
        }else if(jump.getTag().equals(android.R.color.transparent)){
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
            }, 1000);
        }
    }

    public void runClick(View view){

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

    public void runBack(View view) {

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

    public void ataqueSword(View view) {
        if(funil.getTag().equals(android.R.color.transparent)) {
            sword.setImageResource(android.R.color.transparent);
            sword.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            if (char_application.swordStatus == 0) {
                run1.setBackgroundResource(R.drawable.sword_horizontal2);
            } else if (char_application.swordStatus == 1) {

                run1.setBackgroundResource(R.drawable.swordlv2_high);
            }else if (char_application.swordStatus == 2) {

                run1.setBackgroundResource(R.drawable.swordlv3_high);
            }else if (char_application.swordStatus == 3) {

                run1.setBackgroundResource(R.drawable.swordlv4_high);
            }else if (char_application.swordStatus == 4) {

                run1.setBackgroundResource(R.drawable.swordlv5_high);
            }else if (char_application.swordStatus == 5) {

                run1.setBackgroundResource(R.drawable.swordlv8_high);
            }else if (char_application.swordStatus == 6) {

                run1.setBackgroundResource(R.drawable.swordlv7_high);
            }else if (char_application.swordStatus == 7) {

                run1.setBackgroundResource(R.drawable.swordlv6_high);
            }else if (char_application.swordStatus == 8) {

                run1.setBackgroundResource(R.drawable.viking_axe_horizontal);
            }
            mHandler.postDelayed(new Runnable() {
                public void run() {
                    run1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    if (char_application.swordStatus == 0) {
                        run2.setBackgroundResource(R.drawable.sword_horizontal2);
                    } else if (char_application.swordStatus == 1) {

                        run2.setBackgroundResource(R.drawable.swordlv2_high);
                    }else if (char_application.swordStatus == 2) {

                        run2.setBackgroundResource(R.drawable.swordlv3_high);
                    }else if (char_application.swordStatus == 3) {

                        run2.setBackgroundResource(R.drawable.swordlv4_high);
                    }else if (char_application.swordStatus == 4) {

                        run2.setBackgroundResource(R.drawable.swordlv5_high);
                    }else if (char_application.swordStatus == 5) {

                        run2.setBackgroundResource(R.drawable.swordlv8_high);
                    }else if (char_application.swordStatus == 6) {

                        run2.setBackgroundResource(R.drawable.swordlv7_high);
                    }else if (char_application.swordStatus == 7) {

                        run2.setBackgroundResource(R.drawable.swordlv6_high);
                    }else if (char_application.swordStatus == 8) {

                        run2.setBackgroundResource(R.drawable.viking_axe_horizontal);
                    }
                    mHandler.postDelayed(new Runnable() {
                        public void run() {
                            run2.setImageResource(android.R.color.transparent);
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
                        }
                    }, 100);
                }
            }, 100);
        }else if(jump.getTag().equals(android.R.color.transparent)){
            final_position_run.setImageResource(android.R.color.transparent);
            final_position_run.setBackgroundColor(getResources().getColor(android.R.color.transparent));
            funil.setBackgroundResource(R.drawable.standup3);
            mHandler.postDelayed(new Runnable() {
                public void run() {
                    if (char_application.swordStatus == 0) {
                        run2.setBackgroundResource(R.drawable.sword_horizontal2);
                    } else if (char_application.swordStatus == 1) {

                        run2.setBackgroundResource(R.drawable.swordlv2_high);
                    }else if (char_application.swordStatus == 2) {

                        run2.setBackgroundResource(R.drawable.swordlv3_high);
                    }else if (char_application.swordStatus == 3) {

                        run2.setBackgroundResource(R.drawable.swordlv4_high);
                    }else if (char_application.swordStatus == 4) {

                        run2.setBackgroundResource(R.drawable.swordlv5_high);
                    }else if (char_application.swordStatus == 5) {

                        run2.setBackgroundResource(R.drawable.swordlv8_high);
                    }else if (char_application.swordStatus == 6) {

                        run2.setBackgroundResource(R.drawable.swordlv7_high);
                    }else if (char_application.swordStatus == 7) {

                        run2.setBackgroundResource(R.drawable.swordlv6_high);
                    }else if (char_application.swordStatus == 8) {

                        run2.setBackgroundResource(R.drawable.viking_axe_horizontal);
                    }
                    mHandler.postDelayed(new Runnable() {
                        public void run() {
                            run2.setImageResource(android.R.color.transparent);
                            run2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                            if (char_application.swordStatus == 0) {
                                run1.setBackgroundResource(R.drawable.sword_horizontal2);
                            } else if (char_application.swordStatus == 1) {

                                run1.setBackgroundResource(R.drawable.swordlv2_high);
                            }else if (char_application.swordStatus == 2) {

                                run1.setBackgroundResource(R.drawable.swordlv3_high);
                            }else if (char_application.swordStatus == 3) {

                                run1.setBackgroundResource(R.drawable.swordlv4_high);
                            }else if (char_application.swordStatus == 4) {

                                run1.setBackgroundResource(R.drawable.swordlv5_high);
                            }else if (char_application.swordStatus == 5) {

                                run1.setBackgroundResource(R.drawable.swordlv8_high);
                            }else if (char_application.swordStatus == 6) {

                                run1.setBackgroundResource(R.drawable.swordlv7_high);
                            }else if (char_application.swordStatus == 7) {

                                run1.setBackgroundResource(R.drawable.swordlv6_high);
                            }else if (char_application.swordStatus == 8) {

                                run1.setBackgroundResource(R.drawable.viking_axe_horizontal);
                            }
                            mHandler.postDelayed(new Runnable() {
                                public void run() {
                                    run1.setImageResource(android.R.color.transparent);
                                    run1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
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
                            }, 100);
                        }
                    }, 100);
                }
            }, 100);
        }
    }


    public void goTown(View view){

        this.finish();
        Intent intent = new Intent(plainActivity.this,townActivity.class);
        startActivity(intent);
    }

    public void startCall(View view){

        this.finish();
        Intent intent = new Intent(plainActivity.this,char_status.class);
        startActivity(intent);
    }
}

