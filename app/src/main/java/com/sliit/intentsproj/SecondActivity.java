package com.sliit.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

        private static EditText editText3;
        private static EditText editText4;
        private static EditText editText5;
        private static Button btnAdd;
        private static Button btnReduct;
        private static Button btnMultify;
        private static Button btnDivied;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button add = (Button)findViewById(R.id.add);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);


    }
}
