package com.sandeep.main;

import java.util.ArrayList;

public class TopCard {
	public static ArrayList<Integer> checkTopCard(ArrayList<ArrayList<Integer>> cardGot) 
	{
		int max=-1;
		
		ArrayList<Integer> ans= new ArrayList<>();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				int card= cardGot.get(i).get(j)%13;
				if(card==1)
					max=card;
				if(card==0 && max!=1)
					max=card;
				if(max<card && max!=0 && max!=1)
					max=card;
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				int card= cardGot.get(i).get(j)%13;
				if(card==max)
					ans.add(i);
			}
		}
		
		return ans;
	}
}