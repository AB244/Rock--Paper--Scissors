package com.ajbenn04.alex.hw2rockpaperscissors;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.ajbenn04.alex.hw2rockpaperscissors.GameLogic.DecisionLogic;
import com.ajbenn04.alex.hw2rockpaperscissors.models.HandSign;


public class RockPaperScissors extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        Button btn1 = (Button) findViewById(R.id.btn_rock);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandSign sign = DecisionLogic.getInstance();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(sign.displayHandsign());
                Toast toast = Toast.makeText(view.getContext(),sign.WinLoseDraw(),Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_paper);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HandSign sign = DecisionLogic.getInstance();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(sign.displayHandsign());
                Toast toast = Toast.makeText(view.getContext(),sign.WinLoseDraw(),Toast.LENGTH_LONG);
                toast.show();
            }
        });

            Button btn3 = (Button) findViewById(R.id.btn_scissors);
            btn3.setOnClickListener(new View.OnClickListener()  {
                @Override
                public void onClick(View view) {
                    HandSign sign = DecisionLogic.getInstance();
                    ImageView imageView = (ImageView) findViewById(R.id.imgView);
                    imageView.setImageResource(sign.displayHandsign());
                    Toast toast = Toast.makeText(view.getContext(),sign.WinLoseDraw(),Toast.LENGTH_LONG);
                    toast.show();
                }
            });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rock_paper_scissors, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
