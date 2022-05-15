package com.example.dialogwithseekbar;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class FilterDialog extends Dialog {

    private CheckBox ch1BHK,ch2BHK,ch3BHK;
    private Button btnOk;
    private SeekBar seekBar;
    private TextView message;
    public FilterDialog( Context context) {
        super(context);
        setContentView(R.layout.filter_dialog);

        ch1BHK= findViewById(R.id.ch1Bhk);
        ch2BHK = findViewById(R.id.ch2Bhk);
        ch3BHK = findViewById(R.id.ch3Bhk);
        btnOk=findViewById(R.id.btnOK);
        seekBar=(SeekBar)findViewById(R.id.seekbar);
       message =findViewById(R.id.txt2);
        this.seekBar.setMax(100);
        this.seekBar.setProgress(15);

        btnOk.setOnClickListener(new BtnOKClickListener());

    }

    class BtnOKClickListener implements View.OnClickListener{
        @Override


        public void onClick(View view){
            seekBar.setOnSeekBarChangeListener(
                    new SeekBar.OnSeekBarChangeListener() {



                        @Override
                        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                            }

                        @Override
                        public void onStartTrackingTouch(SeekBar seekBar) {

                        }

                        @Override
                        public void onStopTrackingTouch(SeekBar seekBar) {

                        }


                    }
            );

            }
    }



}
