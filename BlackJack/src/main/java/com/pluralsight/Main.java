package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand();

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            Card currentCard = deck.deal();
            hand.deal(currentCard);
        }

        System.out.println(hand);
//        Card card1 = deck.deal();
////        hand.deal(card1);
//        System.out.println(hand);
//        Card currentCard = deck.deal();
//        System.out.println("OKay you drew the " + currentCard.getValue() + " of " + currentCard.getSuit());
//        hand.deal(currentCard);

//          for bigger hand games
//        for (int i = 0; i < 5; i++) {
//            Card currentCard = deck.deal();
//            hand.deal(currentCard);
//        }


    }
}
