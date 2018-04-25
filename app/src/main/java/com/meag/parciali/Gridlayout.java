package com.meag.parciali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gridlayout extends AppCompatActivity {

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);
        btn1=findViewById(R.id.paolumu);
        btn2=findViewById(R.id.bazelgeuse);
        btn3=findViewById(R.id.nergigante);
        btn4=findViewById(R.id.xeno_jiiva);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), Miguel.class);
                startActivity(intent);
// intent.putExtras(valores);

            }
        });
    }
}
