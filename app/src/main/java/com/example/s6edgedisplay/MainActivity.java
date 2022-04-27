package com.example.s6edgedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public ConsumerIrManager mCIR;
    public boolean holdSwitch = true;
    public boolean tvPowerPosition = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCIR = (ConsumerIrManager)getSystemService(Context.CONSUMER_IR_SERVICE);
        ImageButton tvPowerBtn = (ImageButton) findViewById(R.id.TVPowerBtn);
        ImageButton sbPowerBtn = (ImageButton) findViewById(R.id.SBPowerBtn);
        ImageButton tvVupBtn = (ImageButton) findViewById(R.id.tvVupBtn);
        ImageButton tvVdownBtn = (ImageButton) findViewById(R.id.tvVdownBtn);
        ImageButton sbVupBtn = (ImageButton) findViewById(R.id.sbVupBtn);
        ImageButton sbVdownBtn = (ImageButton) findViewById(R.id.sbVdownBtn);
        Button b0Btn = (Button) findViewById(R.id.b0Btn);
        Button b1Btn = (Button) findViewById(R.id.b1Btn);
        Button b2Btn = (Button) findViewById(R.id.b2Btn);
        Button b3Btn = (Button) findViewById(R.id.b3Btn);
        Button b4Btn = (Button) findViewById(R.id.b4Btn);
        Button b5Btn = (Button) findViewById(R.id.b5Btn);
        Button b6Btn = (Button) findViewById(R.id.b6Btn);
        Button b7Btn = (Button) findViewById(R.id.b7Btn);
        Button b8Btn = (Button) findViewById(R.id.b8Btn);
        Button b9Btn = (Button) findViewById(R.id.b9Btn);
        Button tvMuteBtn = (Button) findViewById(R.id.tvMuteBtn);
        Button sbMuteBtn = (Button) findViewById(R.id.sbMuteBtn);
        Button tvUpBtn = (Button) findViewById(R.id.tvUpBtn);
        Button tvDownBtn = (Button) findViewById(R.id.tvDownBtn);
        Button tvLeftBtn = (Button) findViewById(R.id.tvLeftBtn);
        Button tvRightBtn = (Button) findViewById(R.id.tvRightBtn);
        Button tvOkBtn = (Button) findViewById(R.id.tvOkBtn);
        Button tvBackBtn = (Button) findViewById(R.id.tvBackBtn);
        Button tvExitBtn = (Button) findViewById(R.id.tvExitBtn);
        Button tvSettingsBtn = (Button) findViewById(R.id.tvSettingsBtn);
        Button tvInputBtn = (Button) findViewById(R.id.tvInputBtn);

        tvPowerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPowerBtnClick(v);
            }
        });

        sbPowerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbPowerBtnClick(v);
            }
        });
        tvVupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvVupBtnClick(v);
            }
        });

        tvVdownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvVdownBtnClick(v);
            }
        });


        sbVupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbVupBtnClick(v);
            }
        });


        sbVdownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbVdownBtnClick(v);
            }
        });


        b0Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b0BtnClick(v);
            }
        });

        b1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1BtnClick(v);
            }
        });


        b2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2BtnClick(v);
            }
        });


        b3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3BtnClick(v);
            }
        });

        b4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4BtnClick(v);
            }
        });

        b5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5BtnClick(v);
            }
        });

        b6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6BtnClick(v);
            }
        });


        b7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7BtnClick(v);
            }
        });

        b8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8BtnClick(v);
            }
        });

        b9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9BtnClick(v);
            }
        });

        tvMuteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMuteBtnClick(v);
            }
        });


        sbMuteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbMuteBtnClick(v);
            }
        });

        tvUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvUpBtnClick(v);
            }
        });

        tvDownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDownBtnClick(v);
            }
        });

        tvLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvLeftBtnClick(v);
            }
        });

        tvRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvRightBtnClick(v);
            }
        });

        tvOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOkBtnClick(v);
            }
        });

        tvBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBackBtnClick(v);
            }
        });

        tvExitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExitBtnClick(v);
            }
        });

        tvInputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInputBtnClick(v);
            }
        });

        tvSettingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSettingsBtnClick(v);
            }
        });
    }

    public void tvPowerBtnClick(View view) {
        if (tvPowerPosition == true) {
            tvPowerPosition = !tvPowerPosition;
            if (holdSwitch == true) {
                MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).pattern);
            } else {
                MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).pattern);

            }
        } else {
            tvPowerPosition = !tvPowerPosition;
            if (holdSwitch == true) {
                MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvPowerOffBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvPowerOffBtn")).pattern);
            } else {
                MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvPowerOffBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvPowerOffBtn")).pattern);

            }
        }
    }

    public void sbPowerBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbPowerBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvPowerOnBtn")).pattern);

        }
    }

    public void b1BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b1Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b1Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b1Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b1Btn")).pattern);
        }
    }

    public void b2BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b2Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b2Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b2Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b2Btn")).pattern);

        }
    }

    public void b3BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b3Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b3Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b3Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b3Btn")).pattern);

        }
    }

    public void b4BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b4Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b4Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b4Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b4Btn")).pattern);

        }
    }

    public void b5BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b5Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b5Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b5Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b5Btn")).pattern);

        }
    }

    public void b6BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b6Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b6Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b6Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b6Btn")).pattern);

        }
    }

    public void b7BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b7Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b7Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b7Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b7Btn")).pattern);

        }
    }

    public void b8BtnClick(View view) {

        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b8Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b8Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b8Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b8Btn")).pattern);

        }
    }

    public void b9BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b9Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b9Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b9Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b9Btn")).pattern);

        }
    }

    public void b0BtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b0Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b0Btn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("b0Btn")).freq, MainActivity.this.hexsa(returnButtonHex("b0Btn")).pattern);

        }

    }

    public void tvSettingsBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvSettingsBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvSettingsBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvSettingsBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvSettingsBtn")).pattern);

        }
    }


    public void tvInputBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvInputBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvInputBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvInputBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvInputBtn")).pattern);

        }
    }

    public void tvVupBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvVupBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvVupBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvVupBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvVupBtn")).pattern);

        }
    }

    public void tvMuteBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvMuteBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvMuteBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvMuteBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvMuteBtn")).pattern);

        }
    }

    public void sbVupBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbVupBtn")).freq, MainActivity.this.hexsa(returnButtonHex("sbVupBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbVupBtn")).freq, MainActivity.this.hexsa(returnButtonHex("sbVupBtn")).pattern);

        }
    }

    public void tvVdownBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvVdownBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvVdownBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvVdownBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvVdownBtn")).pattern);

        }
    }

    public void sbMuteBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbMuteBtn")).freq, MainActivity.this.hexsa(returnButtonHex("sbMuteBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbMuteBtn")).freq, MainActivity.this.hexsa(returnButtonHex("sbMuteBtn")).pattern);

        }
    }

    public void sbVdownBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbVdownBtn")).freq, MainActivity.this.hexsa(returnButtonHex("sbVdownBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("sbVdownBtn")).freq, MainActivity.this.hexsa(returnButtonHex("sbVdownBtn")).pattern);

        }
    }

    public void tvBackBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvBackBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvBackBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvBackBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvBackBtn")).pattern);

        }
    }

    public void tvUpBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvUpBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvUpBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvUpBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvUpBtn")).pattern);

        }
    }

    public void tvExitBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvExitBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvExitBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvExitBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvExitBtn")).pattern);

        }
    }

    public void tvLeftBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvLeftBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvLeftBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvLeftBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvLeftBtn")).pattern);

        }
    }

    public void tvOkBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvOkBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvOkBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvOkBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvOkBtn")).pattern);

        }
    }

    public void tvRightBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvRightBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvRightBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvRightBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvRightBtn")).pattern);

        }
    }

    public void tvDownBtnClick(View view) {
        if (holdSwitch == true) {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvDownBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvDownBtn")).pattern);
        } else {
            MainActivity.this.mCIR.transmit(MainActivity.this.hexsa(returnButtonHex("tvDownBtn")).freq, MainActivity.this.hexsa(returnButtonHex("tvDownBtn")).pattern);

        }
    }



    public String returnButtonHex(String btnName) {
        if (btnName == "b0Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0609 0154 0056 0014 0E50";
        else if (btnName == "b1Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0609 0154 0056 0014 0E50";
        else if (btnName == "b2Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0609 0154 0056 0014 0E50";
        else if (btnName == "b3Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0608 0154 0056 0014 0E50";
        else if (btnName == "b4Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0041 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0041 0014 0041 0014 0014 0014 0041 0014 0041 0014 0041 0014 0041 0014 0041 0014 0014 0014 0014 0014 0041 0014 0014 0014 0041 0014 0014 0014 0014 0014 0014 0014 0041 0014 0041 0014 0014 0014 0041 0014 0014 0014 0041 0014 0041 0014 0041 0014 0608 0154 0056 0014 0E50";
        else if (btnName == "b5Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0609 0154 0056 0014 0E50";
        else if (btnName == "b6Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0609 0154 0055 0014 0E50";
        else if (btnName == "b7Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0608 0154 0056 0014 0E50";
        else if (btnName == "b8Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0608 0154 0055 0014 0E50";
        else if (btnName == "b9Btn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0608 0154 0056 0014 0E50";
        else if (btnName == "tvPowerOffBtn")
            return "0000 006d 0022 0002 0157 00ac 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0689 0157 0056 0015 0e94";
        else if (btnName == "tvPowerOnBtn")
            return "0000 006d 0022 0002 0157 00ac 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0689 0157 0056 0015 0e94";
        else if (btnName == "sbPowerBtn") //fcb_2b
            return "0000 006D 0022 0002 0155 00AA 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0040 0015 05EB 0155 0055 0015 0E45";
        else if (btnName == "tvInputBtn")  //Menu_2b = settings
            return "0000 006d 0026 0000 0155 00aa 0016 0015 0016 0015 0016 0040 0016 0015 0016 0015 0016 0014 0016 0015 0016 0015 0016 0040 0015 0040 0016 0015 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0015 0016 0040 0016 0014 0016 0015 0016 0015 0016 0015 0016 0014 0016 0015 0016 0040 0016 0014 0016 0040 0016 0040 0016 0040 0016 0040 0016 060b 0155 0055 0016 0e58 0155 0055 0016 00aa";
        else if (btnName == "tvSettingsBtn") //Index_2b = hdmi1
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0608 0154 0056 0014 0E4F";
        else if (btnName == "tvUpBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0608 0154 0056 0014 0E4F";
        else if (btnName == "tvDownBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0608 0154 0056 0014 0E50";
        else if (btnName == "sbVupBtn") //fcg_2b
            return "0000 006D 0022 0002 0155 00AA 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 05ED 0155 0055 0015 0E47";
        else if (btnName == "sbVdownBtn") //fcr_2b
            return "0000 006D 0022 0002 0155 00AA 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 05ED 0155 0055 0015 0E47";
        else if (btnName == "tvMuteBtn")//Does Not Work
            return "0000 006D 0022 0002 0155 00AA 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0015 0015 0040 0015 05ED 0155 0055 0015 0E47 ";
        else if (btnName == "sbMuteBtn") //fcy_2b
            return "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
        else if (btnName == "tvBackBtn")//son_2b
            return "0000 006D 0022 0002 0155 00AA 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0040 0015 05ED 0155 0055 0015 0E47";
        else if (btnName == "tvExitBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0608 0154 0055 0014 0E4F";
        else if (btnName == "tvOkBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0608 0154 0055 0014 0E4F";
        else if (btnName == "tvVdownBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0608 0154 0055 0014 0E4F";
        else if (btnName == "tvVupBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0608 0154 0055 0014 0E4F";
        else if (btnName == "tvLeftBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0608 0154 0056 0014 0E4F";
        else if (btnName == "tvRightBtn")
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0608 0154 0055 0014 0E4F";
        else if (btnName == "Null")
            return "";
        else if (btnName == "Null")
            return "";
        else //0 btn for error catching
            return "0000 006D 0022 0002 0154 00A9 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0014 0014 0014 0014 0014 0014 0040 0014 0014 0014 0014 0014 0014 0014 0040 0014 0040 0014 0040 0014 0040 0014 0014 0014 0040 0014 0040 0014 0040 0014 0609 0154 0056 0014 0E50";

    }
    public class IRCM { //gotten from https://play.google.com/store/apps/details?id=com.peel.remote.control.tvsmart&gl=US
        /* access modifiers changed from: private */
        public final int freq;
        /* access modifiers changed from: private */
        public final int[] pattern;

        private IRCM(int i, int[] iArr) {
            this.freq = i;
            this.pattern = iArr;
        }
    }

    public IRCM hexsa(String str) { //gotten from https://play.google.com/store/apps/details?id=com.peel.remote.control.tvsmart&gl=US
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(" ")));
        arrayList.remove(0);
        int parseInt = Integer.parseInt((String) arrayList.remove(0), 16);
        arrayList.remove(0);
        arrayList.remove(0);
        double d = (double) parseInt;
        Double.isNaN(d);
        int i = (int) (1000000.0d / (d * 0.241246d));
        int i2 = 1000000 / i;
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = Integer.parseInt((String) arrayList.get(i3), 16) * i2;
        }
        return new IRCM(i, iArr);
    }
}