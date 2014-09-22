package com.ajbenn04.alex.hw2rockpaperscissors.GameLogic;

import android.graphics.drawable.Drawable;

import com.ajbenn04.alex.hw2rockpaperscissors.R;

import java.security.SecureRandom;

/**
 * Created by Alex on 9/22/2014.
 */
public class Displayfinalgraphic {

    public static int DisplayGraphic(String outcome) {

        if (outcome.equals("You Win!")) {
            SecureRandom rand = new SecureRandom();
            byte[] output = new byte[20];
            rand.nextBytes(output);
            int decision = rand.nextInt(2);

            if (decision == 0) {
                return R.drawable.ninewinner1;

            } else {
                return R.drawable.ninewinnerfunny;
            }
        }

        if (outcome.equals("You Lose!"))
        {
            return R.drawable.funnylosegrim;

        }
        return R.drawable.funnydraw;
    }
}
