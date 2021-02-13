package com.sandeep.main;

import java.util.ArrayList;

public class SuddenDeath {
	public static int checkSuddenDeath(ArrayList<String> nameOfPlayers,ArrayList<Integer> abc,ArrayList<Integer> restOfCard,int start) 
	{	
		System.out.println("Here is a tie. Time for sudden death...");
		if(start>52)
		{
			System.out.println("Sorry... No more Cards.. Please play again...");
			return -1;
		}
		

		int res=-1;
		ArrayList<Integer> newCard= new ArrayList<>();
		int n= abc.size();
		for(int i=0;i<n;i++)
		{
			newCard.add(restOfCard.get(start+i));
		}
		System.out.println("New Cards picked by each players are:");
		
		for(int i=0;i<n;i++)
			System.out.println(nameOfPlayers.get(abc.get(i))+":"+CardGame.getCardNames(newCard.get(i)));

		
		int max=-1;
		int count=0;
		for(int i=0;i<newCard.size();i++)
		{
			int card=newCard.get(i)%13;
			if(card==1)
				max=card;
			else if(card==0 && max!=1)
				max=card;
			else if(card>max && max!=0 && max!=1)
				max=newCard.get(i);
		}
		ArrayList<Integer> ans= new ArrayList<>();
		for(int i=0;i<newCard.size();i++)
			if(newCard.get(i)%13==max)
				ans.add(abc.get(searchelement(newCard,max)));
		
		count=ans.size();
		if(count>0)
		{
			if(count==1)
			{
				System.out.println("By the means of Sudden Death");
				res= ans.get(0);
			}
			else
				res= SuddenDeath.checkSuddenDeath(nameOfPlayers,abc,restOfCard,start+n);
		}			
		return res;
		
	}

	private static int searchelement(ArrayList<Integer> newCard, int z) {
		int n= newCard.size();
		for(int i=0;i<n;i++)
			if(z==newCard.get(i)%13)
				return i;
		return -1;
	}
}
