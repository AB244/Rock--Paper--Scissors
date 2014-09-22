package com.ajbenn04.alex.hw2rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.ajbenn04.alex.hw2rockpaperscissors.GameLogic.DecisionLogic;
import com.ajbenn04.alex.hw2rockpaperscissors.GameLogic.Displayfinalgraphic;
import com.ajbenn04.alex.hw2rockpaperscissors.models.HandSign;

public class Game_Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__start);

        Button btn1 = (Button) findViewById(R.id.btn_rock);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final HandSign sign = DecisionLogic.getInstance();
                final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
                imageView.setImageResource(sign.displayHandsign());
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                final Toast toast = Toast.makeText(view.getContext(), sign.WinLoseDraw("btn_rock", sign), Toast.LENGTH_LONG);

                new CountDownTimer(2000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        Toast compchoice = Toast.makeText(view.getContext(), "Computer chose " + sign.Nameof() +"! Wait: "+ millisUntilFinished / 1000,Toast.LENGTH_SHORT);
                        compchoice.show();
                    }
                        public void onFinish() {
                    /*Display winning graphic*/
                        int wingraphic = Displayfinalgraphic.DisplayGraphic(sign.WinLoseDraw("btn_rock", sign));
                        imageView.setImageResource(wingraphic);

                        toast.show();
                    }
                }.start();
            }


        });

        Button btn2 = (Button) findViewById(R.id.btn_paper);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final HandSign sign = DecisionLogic.getInstance();
                final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
                imageView.setImageResource(sign.displayHandsign());
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                final Toast toast = Toast.makeText(view.getContext(),sign.WinLoseDraw("btn_paper", sign),Toast.LENGTH_LONG);

                new CountDownTimer(2000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        Toast compchoice = Toast.makeText(view.getContext(), "Computer chose " + sign.Nameof() +"! Wait: "+ millisUntilFinished / 1000,Toast.LENGTH_SHORT);
                        compchoice.show();
                    }
                    public void onFinish() {
                    /*Display winning graphic*/
                        int wingraphic = Displayfinalgraphic.DisplayGraphic(sign.WinLoseDraw("btn_paper", sign));
                        imageView.setImageResource(wingraphic);

                        toast.show();
                    }
                }.start();
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn_scissors);
        btn3.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(final View view) {
                final HandSign sign = DecisionLogic.getInstance();
                final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
                imageView.setImageResource(sign.displayHandsign());
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                final Toast toast = Toast.makeText(view.getContext(),sign.WinLoseDraw("btn_scissors", sign),Toast.LENGTH_LONG);


                new CountDownTimer(2000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        Toast compchoice = Toast.makeText(view.getContext(), "Computer chose " + sign.Nameof() +"! Wait: "+ millisUntilFinished / 1000,Toast.LENGTH_SHORT);
                        compchoice.show();
                    }
                    public void onFinish() {
                    /*Display winning graphic*/
                        int wingraphic = Displayfinalgraphic.DisplayGraphic(sign.WinLoseDraw("btn_scissors", sign));
                        imageView.setImageResource(wingraphic);

                        toast.show();
                    }
                }.start();
            }
        });

    }

    public void goScores(View view)
    {
        Intent intent = new Intent(Game_Start.this, Scores.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game__start, menu);
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
