package com.example.carrusel;

import static com.example.carrusel.R.drawable.*;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import kotlin.collections.CollectionsKt;

public class CreditCardsViewModel extends ViewModel {


    private final MutableLiveData stream = new MutableLiveData();

    private final List data = CollectionsKt.listOf(

            new CreditCardModel(thefool0),
            new CreditCardModel(themagician1),
            new CreditCardModel(thepriestess2),
            new CreditCardModel(theempress3),
            new CreditCardModel(theemperor4),
            new CreditCardModel(thehierophant5),
            new CreditCardModel(thelovers6),
            new CreditCardModel(thechariot7),
            new CreditCardModel(strength8),
            new CreditCardModel(thehermit9),
            new CreditCardModel(wheeloffortune10),
            new CreditCardModel(justice11),
            new CreditCardModel(thehangedman12),
            new CreditCardModel(death13),
            new CreditCardModel(temperance14),
            new CreditCardModel(thedevil15),
            new CreditCardModel(thetower16),
            new CreditCardModel(thestar17),
            new CreditCardModel(themoon18),
            new CreditCardModel(thesun19),
            new CreditCardModel(theworld21));

    private int currentIndex;

    //getters and setters
    @NotNull
    public final LiveData getModelStream() {
        return this.stream;
    }

    public List getData() {
        return data;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
        this.updateCards();
    }

    private final CreditCardModel getCardOneLeft() {
        return (CreditCardModel) this.data.get(this.currentIndex % this.data.size());
    }

    private final CreditCardModel getCardTwoLeft() {
        return (CreditCardModel) this.data.get((this.currentIndex + 1) % this.data.size());
    }

    private final CreditCardModel getCardThreeLeft() {
        return (CreditCardModel) this.data.get((this.currentIndex + 2) % this.data.size());
    }

    private final CreditCardModel getCardFourLeft() {
        return (CreditCardModel) this.data.get((this.currentIndex + 3) % this.data.size());
    }

    private final CreditCardModel getCardCenter() {
        return (CreditCardModel) this.data.get((this.currentIndex + 4) % this.data.size());
    }

    private final CreditCardModel getCardOneRight() {
        return (CreditCardModel) this.data.get((this.currentIndex + 5) % this.data.size());
    }

    private final CreditCardModel getCardTwoRight() {
        return (CreditCardModel) this.data.get((this.currentIndex + 6) % this.data.size());
    }

    private final CreditCardModel getCardThreeRight() {
        return (CreditCardModel) this.data.get((this.currentIndex + 7) % this.data.size());
    }

    private final CreditCardModel getCardFourRight() {
        return (CreditCardModel) this.data.get((this.currentIndex + 8) % this.data.size());
    }

    //swipe directions controller
    public final void swipeRight() {
        ++this.currentIndex;
        this.updateCards();
    }

    public final void swipeLeft() {
        if (this.currentIndex == 0) {
            this.currentIndex = this.data.size() - 1;
        } else {
            --this.currentIndex;
        }

        this.updateCards();
    }

    private final void updateCards() {
        this.stream.setValue(new CreditCardsModel(this.getCardOneLeft(), this.getCardTwoLeft(), this.getCardThreeLeft(), this.getCardFourLeft(), this.getCardCenter(), this.getCardOneRight(), this.getCardTwoRight(), this.getCardThreeRight(), this.getCardFourRight()));
    }

    public CreditCardsViewModel() {
        this.updateCards();
    }
}
