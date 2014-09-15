package com.ajbenn04.alex.hw2rockpaperscissors.models;

import com.ajbenn04.alex.hw2rockpaperscissors.R;

/**
 * Created by Alex on 9/15/2014.
 */
public class Rock implements HandSign {

    @Override
    public int displayHandsign(){return R.drawable.rock;}

    @Override
    public String WinLoseDraw() {

        if(displayHandsign()==R.drawable.scissors){

            return "Win";

        }

        else if(displayHandsign()==R.drawable.paper) {

            return "Lose";
        }

        else return "Draw";
    }

}
