package com.example.hp.dayzero;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Dayzero extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dayzero);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);
        s = editText.getText().toString();
        textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dayzero.this, "Hi Anant"+s, Toast.LENGTH_SHORT).show();
                textView.setText(s);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    textView.setGravity(View.TEXT_ALIGNMENT_CENTER);
                }
                textView.setAllCaps(true);
                textView.setTextSize(20);
                textView.setTextColor(getResources().getColor(R.color.colorAccent));
                Intent intent = new Intent(Dayzero.this,Hello.class);
                startActivity(intent);
            }
        });
    }
}
