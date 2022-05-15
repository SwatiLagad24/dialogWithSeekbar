package com.example.dialogwithseekbar;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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
       ch1BHK.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(ch1BHK.isChecked()){
                   int index=seekBar.getProgress();
                   seekBar.setProgress(30);
                   message.setText("Around  "+ String.valueOf(30)+"  Lakh");
               }
           }
       });
        ch2BHK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch2BHK.isChecked()){
                    int index=seekBar.getProgress();
                    seekBar.setProgress(50);
                    message.setText("Around  "+ String.valueOf(50)+"  Lakh");
                }
            }
        });

        ch3BHK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch3BHK.isChecked()){
                    int index=seekBar.getProgress();
                    seekBar.setProgress(80);
                    message.setText("Around  "+ String.valueOf(80)+"  Lakh");
                }
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {



                message.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            Toast.makeText(getContext(),"Tracking start",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

       btnOk.setOnClickListener(new BtnOKClickListener());

    }

    class BtnOKClickListener implements View.OnClickListener {
        @Override


        public void onClick(View view) {
            dismiss();

            }
        }


    }

