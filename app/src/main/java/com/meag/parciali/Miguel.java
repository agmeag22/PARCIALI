package com.meag.parciali;

import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Miguel extends AppCompatActivity {
    Fragm1 fragm1;
    Fragm2 fragm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miguel);
    fragm1=new Fragm1();
    fragm2=new Fragm2();
    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.fragmento1,fragm1);
    fragmentTransaction.commit();
//    fragmentTransaction.addToBackStack(null);
//
//    FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
//    fragmentTransaction2.replace(R.id.fragmento2,fragm2);
//    fragmentTransaction2.commit();
//    fragmentTransaction2.addToBackStack(null);
    }
}
