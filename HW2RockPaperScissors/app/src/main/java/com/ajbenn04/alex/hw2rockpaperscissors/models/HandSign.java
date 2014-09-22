package com.ajbenn04.alex.hw2rockpaperscissors.models;

import android.graphics.drawable.Drawable;

/**
 * Created by Alex on 9/15/2014.
 */
public interface HandSign {
    public int displayHandsign();

    public String WinLoseDraw(String button, HandSign sign);

    public String Nameof();
}
