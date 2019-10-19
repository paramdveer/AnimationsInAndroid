package com.codewithgoogle.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    static  int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld =(TextView)findViewById(R.id.textHelloWorld);
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.i("MEssage","THe Hello World is clicked");
                //Toast.makeText(MainActivity.this,"HEllo World is clicked!", Toast.LENGTH_SHORT).show();
                //txtHelloWorld.animate().rotation(360f).setDuration(500);
                //txtHelloWorld.animate().translationXBy(100f);
//                txtHelloWorld.setText("Hi World");
                if(count%10==0){
                    txtHelloWorld.animate().translationYBy(30f);
                    Toast.makeText(MainActivity.this,"HEllo World is translationYBy !", Toast.LENGTH_SHORT).show();
                    count++;
                }else if(count%5==0){
                    txtHelloWorld.animate().rotation(360).setDuration(500);
                    Toast.makeText(MainActivity.this,"HEllo World is rotation !", Toast.LENGTH_SHORT).show();
                    count++;
                }else if(count%2==0){
                    txtHelloWorld.animate().translationXBy(30+count*30);
                    Toast.makeText(MainActivity.this,"HEllo World is translationXBy !", Toast.LENGTH_SHORT).show();
                    count++;
                }else if(count%3!=0){
                    txtHelloWorld.animate().rotationX(30+count*30).setDuration(500);
                    Toast.makeText(MainActivity.this,"HEllo World is rotationX !", Toast.LENGTH_SHORT).show();
                    count++;
                }else {
                    txtHelloWorld.animate().alphaBy(0.7f).setDuration(500);
                    Toast.makeText(MainActivity.this,"HEllo World is alphaBy(0.7f) !", Toast.LENGTH_SHORT).show();
                    count++;
                }

            }
        });
    }
}
