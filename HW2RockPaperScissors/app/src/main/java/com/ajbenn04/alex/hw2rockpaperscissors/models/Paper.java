package com.ajbenn04.alex.hw2rockpaperscissors.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
    public String WinLoseDraw(String button, HandSign sign) {

        if(button.equals("btn_scissors")){

            WinsLoseDraw.Wins++;

        return "You Win!";

        }

        else if(button.equals("btn_rock")) {

            WinsLoseDraw.Losses++;
            return "You Lose!";
        }

        else {WinsLoseDraw.Draws++; return "Draw!";}
        }

    public String Nameof(){

        return "paper";
    }

}
