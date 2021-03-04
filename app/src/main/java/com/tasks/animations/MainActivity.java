package com.tasks.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld,txtHiWorld;
    private boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHiWorld=findViewById(R.id.txtHioWorld);
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //txtHelloWorld.animate().rotationX(3600).setDuration(1000);
                //txtHelloWorld.animate().rotationY(3600).setDuration(1000);
                //txtHelloWorld.animate().rotationXBy(3600).setDuration(1000);
                //txtHelloWorld.animate().rotationYBy(3600).setDuration(1000);
                //txtHelloWorld.animate().scaleX(1000).setDuration(1000);
                //txtHelloWorld.animate().scaleY(3600).setDuration(1000);
                //txtHelloWorld.animate().rotation(3600).setDuration(1000);
                //txtHelloWorld.animate().alpha(0).setDuration(1000);
                //txtHelloWorld.animate().translationYBy(100).setDuration(1000);
                //txtHelloWorld.animate().translationY(3600).setDuration(1000);
               if(flag==false){
                   txtHelloWorld.animate().alpha(0).setDuration(1000);
                   txtHiWorld.animate().alpha(1).setDuration(1000);
                   flag=true;
               }
               else{
                   txtHelloWorld.animate().alpha(1).setDuration(1000);
                   txtHiWorld.animate().alpha(0).setDuration(1000);
                   flag=false;
               }
            }
        });
    }

}