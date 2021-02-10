package com.sandeep.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopCard {
	public static ArrayList<Integer> checkTopCard(ArrayList<ArrayList<Integer>> cardGot) 
	{
		int max=-1;
		ArrayList<Integer> ans= new ArrayList<>();
		for(int i=0;i<4;i++)
		{
			int card3=cardGot.get(i).get(2)%13;
			if(max<card3)
			{
				max=card3;
			}
			
		}
		for(int i=0;i<4;i++)
		{
			if((cardGot.get(i).get(2)%13)==max)
				ans.add(i);
		}
		return ans;
	}
}