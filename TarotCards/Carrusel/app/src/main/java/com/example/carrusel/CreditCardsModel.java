package com.example.carrusel;


//controls the cards model used in every card

public class CreditCardsModel {
    private CreditCardModel cardOneLeft;
    private CreditCardModel cardTwoLeft;
    private CreditCardModel cardThreeLeft;
    private CreditCardModel cardFourLeft;
    private CreditCardModel cardCenter;
    private CreditCardModel cardOneRight;
    private CreditCardModel cardTwoRight;
    private CreditCardModel cardThreeRight;
    private CreditCardModel cardFourRight;

//constructor
    public CreditCardsModel(CreditCardModel cardOneLeft, CreditCardModel cardTwoLeft, CreditCardModel cardThreeLeft, CreditCardModel cardFourLeft, CreditCardModel cardCenter, CreditCardModel cardOneRight, CreditCardModel cardTwoRight, CreditCardModel cardThreeRight, CreditCardModel cardFourRight) {
        this.cardOneLeft = cardOneLeft;
        this.cardTwoLeft = cardTwoLeft;
        this.cardThreeLeft = cardThreeLeft;
        this.cardFourLeft = cardFourLeft;
        this.cardCenter = cardCenter;
        this.cardOneRight = cardOneRight;
        this.cardTwoRight = cardTwoRight;
        this.cardThreeRight = cardThreeRight;
        this.cardFourRight = cardFourRight;
    }
//getters and setters
    public CreditCardModel getCardOneLeft() {
        return cardOneLeft;
    }

    public void setCardOneLeft(CreditCardModel cardOneLeft) {
        this.cardOneLeft = cardOneLeft;
    }

    public CreditCardModel getCardTwoLeft() {
        return cardTwoLeft;
    }

    public void setCardTwoLeft(CreditCardModel cardTwoLeft) {
        this.cardTwoLeft = cardTwoLeft;
    }

    public CreditCardModel getCardThreeLeft() {
        return cardThreeLeft;
    }

    public void setCardThreeLeft(CreditCardModel cardThreeLeft) {
        this.cardThreeLeft = cardThreeLeft;
    }

    public CreditCardModel getCardFourLeft() {
        return cardFourLeft;
    }

    public void setCardFourLeft(CreditCardModel cardFourLeft) {
        this.cardFourLeft = cardFourLeft;
    }

    public CreditCardModel getCardCenter() {
        return cardCenter;
    }

    public void setCardCenter(CreditCardModel cardCenter) {
        this.cardCenter = cardCenter;
    }

    public CreditCardModel getCardOneRight() {
        return cardOneRight;
    }

    public void setCardOneRight(CreditCardModel cardOneRight) {
        this.cardOneRight = cardOneRight;
    }

    public CreditCardModel getCardTwoRight() {
        return cardTwoRight;
    }

    public void setCardTwoRight(CreditCardModel cardTwoRight) {
        this.cardTwoRight = cardTwoRight;
    }

    public CreditCardModel getCardThreeRight() {
        return cardThreeRight;
    }

    public void setCardThreeRight(CreditCardModel cardThreeRight) {
        this.cardThreeRight = cardThreeRight;
    }

    public CreditCardModel getCardFourRight() {
        return cardFourRight;
    }

    public void setCardFourRight(CreditCardModel cardFourRight) {
        this.cardFourRight = cardFourRight;
    }
}
