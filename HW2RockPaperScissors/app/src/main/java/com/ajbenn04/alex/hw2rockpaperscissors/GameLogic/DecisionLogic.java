package com.ajbenn04.alex.hw2rockpaperscissors.GameLogic;

/**
 * Created by Alex on 9/15/2014.
 */

import android.util.Log;

import com.ajbenn04.alex.hw2rockpaperscissors.models.HandSign;
import com.ajbenn04.alex.hw2rockpaperscissors.models.Paper;
import com.ajbenn04.alex.hw2rockpaperscissors.models.Rock;
import com.ajbenn04.alex.hw2rockpaperscissors.models.Scissors;

import java.util.Date;
import java.util.Random;

public class DecisionLogic {

        private DecisionLogic(){}
        public static HandSign getInstance() {
            Random randomGenerator = new Random(new Date().getTime());
            int decision = randomGenerator.nextInt(3);

        if(decision==0){
            return new Rock();

            }
                 else if(decision == 1) {
                 return new Scissors();

                 } else return new Paper();
    }

}
