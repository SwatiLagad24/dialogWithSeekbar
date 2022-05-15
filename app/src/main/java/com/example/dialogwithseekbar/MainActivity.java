package com.example.dialogwithseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnFilter=findViewById(R.id.btnFilter);
        btnFilter.setOnClickListener(new btnFilterClickListener());

    }

    class btnFilterClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){

           FilterDialog filterDialog=new FilterDialog(MainActivity.this);

           filterDialog.show();
             }
    }
}