package com.example.carrusel;

import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;

import java.util.Objects;
//changes the cards background
public final class CreditCardModel {

    private int background;
    public CreditCardModel(int background) {
        this.background = background;
    }

    //getters and setters
    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    //auxiliar code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardModel that = (CreditCardModel) o;
        return background == that.background;
    }

    @Override
    public int hashCode() {
        return Objects.hash(background);
    }


}
