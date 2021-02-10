package com.sandeep.main;

import java.io.*;
import java.util.*;

public class CardGame {
	
	public static ArrayList<String> nameOfPlayers= new ArrayList<>();

	public static ArrayList<ArrayList<Integer>> drawCards(ArrayList<Integer> listOfCard) {
		// Selects 12 cards from a deck of 52 cards and returns them;

		ArrayList<ArrayList<Integer>> drawnCards = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 53; i++) {
			list.add(new Integer(i));
		}
		Collections.shuffle(list);

		for (int i = 0; i < 4; i++) {
			ArrayList<Integer> playerCards = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++)
				playerCards.add(list.get(i * 3 + j));
			Collections.sort(playerCards);
			drawnCards.add(playerCards);
		}
		listOfCard = list;
		return drawnCards;
	}

	public static int checkAnswer(ArrayList<ArrayList<Integer>> cardGot, ArrayList<Integer> restOfCard) {
		int winnerIndex = -1;

		winnerIndex = Trails.checkTrails(cardGot);

		if (winnerIndex != -1)
		{
			System.out.println("By the means of Trail");
			return winnerIndex;
		}
		ArrayList<Integer> abc = Sequence.checkSequence(cardGot);
		if (abc.size() != 0)
			if (abc.size() == 1) {
				System.out.println("By the Means of Sequence");
			return abc.get(0);
			}
			else
				return SuddenDeath.checkSuddenDeath(nameOfPlayers,abc, restOfCard, 13);
		abc = Pair.checkPair(cardGot);
		if (abc.size() != 0)
			if (abc.size() == 1)
			{
				System.out.println("By the means of Pair");
				return abc.get(0);
			}
			else
				return SuddenDeath.checkSuddenDeath(nameOfPlayers,abc, restOfCard, 13);

		abc = TopCard.checkTopCard(cardGot);
		if (abc.size() != 0)
			if (abc.size() == 1)
			{
				System.out.println("By the means of Top Card");
				return abc.get(0);
			}
			else
				return SuddenDeath.checkSuddenDeath(nameOfPlayers,abc, restOfCard, 13);

		return winnerIndex;
	}

	public static void main(String[] args) throws Exception{
		System.out.println("Welcome to the Game of Cards");
		System.out.println("");
		System.out.println("Enter The Name of the 4 Players");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> playerNames = new ArrayList<>();

		playerNames.add(br.readLine());
		playerNames.add(br.readLine());
		playerNames.add(br.readLine());
		playerNames.add(br.readLine());
		ArrayList<Integer> restOfCard = new ArrayList<>();
		nameOfPlayers=playerNames;
		ArrayList<ArrayList<Integer>> cardGot = CardGame.drawCards(restOfCard);

		printCards(playerNames, cardGot);

		int ans = checkAnswer(cardGot, restOfCard);

		System.out.println("The winner is:"+playerNames.get(ans));
		


	}

	private static void printCards(ArrayList<String> playerNames, ArrayList<ArrayList<Integer>> cardGot) {
		for (int i = 0; i < 4; i++) {
			System.out.println(playerNames.get(i) + ":");
			for(int j=0;j<3;j++)
				System.out.println(getCardNames(cardGot.get(i).get(j)));
		}

	}

	public static String getCardNames(int cnum) {
		int x = cnum / 13;
		int y = cnum % 13;

		String ans = "";
		switch (y) {
		case 1: {
			ans += "Ace";
			break;
		}
		case 11: {
			ans += "Jack";
			break;
		}
		case 12: {
			ans += "Queen";
			break;
		}
		case 0: {
			ans += "King";
			break;
		}
		default:
			ans+=""+y;
		}
		
		ans+= " of ";
		
		if(cnum<=13)
			ans+="Spades";
		else if(cnum<=26)
			ans+="Clubs";
		else if(cnum<=39)
			ans+="Hearts";
		else 
			ans+="Diamonds";
					
		return ans;
	}
}
