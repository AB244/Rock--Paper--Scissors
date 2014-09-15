package com.ajbenn04.alex.hw2rockpaperscissors.models;

import android.widget.Toast;

import com.ajbenn04.alex.hw2rockpaperscissors.R;

/**
 * Created by Alex on 9/15/2014.
 */
public class Paper implements HandSign {

    @Override
    public int displayHandsign(){

        return R.drawable.paper;

    }

    @Override
    public String WinLoseDraw() {

        if(displayHandsign()==R.drawable.rock){

        return "Win";

        }

        else if(displayHandsign()==R.drawable.scissors) {

            return "Lose";
        }

        else return "Draw";
        }


}
