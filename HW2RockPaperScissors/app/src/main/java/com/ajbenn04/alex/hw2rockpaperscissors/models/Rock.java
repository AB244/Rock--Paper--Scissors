package com.ajbenn04.alex.hw2rockpaperscissors.models;

import android.graphics.drawable.Drawable;

import com.ajbenn04.alex.hw2rockpaperscissors.R;

/**
 * Created by Alex on 9/15/2014.
 */
public class Rock implements HandSign {

    @Override
    public int displayHandsign(){return R.drawable.rock;}

    @Override
    public String WinLoseDraw(String button, HandSign sign) {

        if(button.equals("btn_paper")){

            return "Win";

        }

        else if(button.equals("btn_scissors")) {

            return "Lose";
        }

        else return "Draw";
    }

}
