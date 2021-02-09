package com.sandeep.main;

import java.util.*;

public class CardGame {
	
	public static ArrayList<ArrayList<Integer>> drawCards(){
		//Selects 12 cards from a deck of 52 cards and returns them;
		
		ArrayList<ArrayList<Integer>> drawnCards= new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
        for (int i=1; i<53; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        
        for (int i=0; i<4; i++) {
    		ArrayList<Integer> playerCards = new ArrayList<Integer>();
            for(int j=0;j<3;j++)
            	playerCards.add(list.get(i*3 + j));
            drawnCards.add(playerCards);
        }
   
		return drawnCards;
	}
	
	public static int checkAnswer(ArrayList<ArrayList<Integer>> cardGot) {
		int winnerIndex=-1;
		
//		if(checktrail(cardGot))
//			winnerIndex=findTrail(cardGot);
//		else if(checkSequence(cardGot))
//			winnerIndex=findSequence(cardGot);
//		else if(checkPair(cardGot))
//			winnerIndex=findPair(cardGot);
//		else if(checkTop(cardGot))
//			winnerIndex=findTop(cardGot);
//		else
//			winnerIndex=randomHit(cardGot);
		
		return winnerIndex;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Game of Cards");
		
		ArrayList<ArrayList<Integer>> cardGot= CardGame.drawCards();
		
		int ans= checkAnswer(cardGot);
		
		System.out.println(cardGot);

	}
	
	

}
