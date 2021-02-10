package com.sandeep.main;

import java.util.ArrayList;

public class SuddenDeath {
	public static int checkSuddenDeath(ArrayList<String> nameOfPlayers,ArrayList<Integer> abc,ArrayList<Integer> restOfCard,int start) 
	{	
		System.out.println("Here is a tie. Time for sudden death...");

		int res=-1;
		ArrayList<Integer> newCard= new ArrayList<>();
		int n= abc.size();
		for(int i=0;i<n;i++)
		{
			newCard.add(restOfCard.get(start+i)%13);
		}
		System.out.println("New Cards picked by each players are:");
		
		for(int i=0;i<n;i++)
			System.out.println(nameOfPlayers.get(abc.get(i))+":"+CardGame.getCardNames(newCard.get(i)));

		
		int max=-1;
		int countZero=0;
		int count=0;
		for(int i=0;i<newCard.size();i++)
		{
			if(newCard.get(i)>max)
				max=newCard.get(i);
		}
		for(int i=0;i<newCard.size();i++)
		{
			if(newCard.get(i)==1)
			{
				countZero++;
				continue;
			}
			if(newCard.get(i)==max)
			{
				count++;
			}
		}
		if(countZero>0)
		{
			if(countZero==1)
			{
				System.out.println("By the means of Sudden Death");
				return abc.get(searchelement(newCard,1));
			}
			else
				return SuddenDeath.checkSuddenDeath(nameOfPlayers,abc,restOfCard,start+n);
		}
		if(count>0)
		{
			if(count==1)
			{
				System.out.println("By the means of Sudden Death");
				res= abc.get(searchelement(newCard,max));
			}
			else
				res= SuddenDeath.checkSuddenDeath(nameOfPlayers,abc,restOfCard,start+n);
		}			
		return res;
		
	}

	private static int searchelement(ArrayList<Integer> newCard, int z) {
		int n= newCard.size();
		for(int i=0;i<n;i++)
			if(z==newCard.get(i))
				return i;
		return -1;
	}
}
