package minimizeScopeAndLoops;

import java.util.*;

public class MinimizeScopeAndLoops {
    enum Suit {CLUB, DIAMOND, HEART, SPADE}

    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
//        Iterator<String>i=collection.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        Collection<String>collection2=new ArrayList<>();
//        Iterator<String>i2=collection2.iterator();
//        while (i2.hasNext()){
//            System.out.println(i2.next());
//        }

//        for( Iterator<String>i=collection.iterator();i.hasNext();){
//            System.out.println(i.next());
//        }
//
//        Collection<String>collection2=new ArrayList<>();
//        for( Iterator<String>i=collection2.iterator();i.hasNext();){
//            System.out.println(i.next());
//        }

//        for (String s:collection) {
//            System.out.println(s);
//        }

        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<>();
//        for(Iterator<Suit>i=suits.iterator();i.hasNext();)
//            for(Iterator<Rank>j=ranks.iterator();j.hasNext();)
//                deck.add(new Card(i.next(),j.next()));
//        System.out.println(deck.size());
        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
        System.out.println(deck.size());


    }

    static class Card {
        Suit suit;
        Rank rank;

        public Card(Suit suit, Rank next) {
            this.suit = suit;
        }
    }
}
