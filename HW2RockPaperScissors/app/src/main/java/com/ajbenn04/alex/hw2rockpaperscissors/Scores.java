package com.ajbenn04.alex.hw2rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.ajbenn04.alex.hw2rockpaperscissors.models.WinsLoseDraw;


public class Scores extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        TextView wins = (TextView) findViewById(R.id.txt_Wins);
        wins.setText("Wins:" + WinsLoseDraw.Wins);
        wins.setTextSize(50);
        wins.setTypeface(Typeface.DEFAULT_BOLD);

        TextView losses = (TextView) findViewById(R.id.txt_Losses);
        losses.setText("Lose:" + WinsLoseDraw.Losses);
        losses.setTextSize(50);
        losses.setTypeface(Typeface.DEFAULT_BOLD);

        TextView draws = (TextView) findViewById(R.id.txt_Draws);
        draws.setText("Draws:" + WinsLoseDraw.Draws);
        draws.setTextSize(50);
        draws.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public void goToTitle(View view)
    {
        Intent intent = new Intent(Scores.this, Title.class);
        startActivity(intent);
    }

    public void returnToGame(View view)
    {
        Intent intent = new Intent(Scores.this, Game_Start.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.scores, menu);
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
