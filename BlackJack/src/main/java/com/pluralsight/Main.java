package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Hand hand = new Hand();

        Deck deck = new Deck();
        deck.shuffle();

        ArrayList<Player> table = new ArrayList<>();

        String[] names = {"Izel", "Million", "Noah", "Gio"};
        for (String name: names) {
            Hand hand = new Hand();


            for (int i = 0; i < 2; i++) {
                Card currentCard = deck.deal();
                currentCard.flip();
                hand.deal(currentCard);
            }
            Player player = new Player(hand, name);

            table.add(player);
        }
        Player winner = null;
        for(Player player: table) {
            int value = player.getValue();
            System.out.println("Player " + player.getName() + " value:" + value);

            if(player.getValue() <= 21) {
                if(winner == null) {
                    winner = player;
                }
                else {
                    if(player.getValue() > winner.getValue()) {
                        winner = player;
                    }
                }
            }
            if (winner == null) {
                System.out.println("What? Everybody busted!");
            } else {
                System.out.println("The winner is : " + winner.getName() + " with: " + winner.getValue());
            }
        }
//        System.out.println(hand);
//        if (hand.getValue() > 21) {
//            System.out.println(hand.getValue() + "Bust!!!");
//        } else {
//            System.out.println("Hand Value: " + hand.getValue());
//        }
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
