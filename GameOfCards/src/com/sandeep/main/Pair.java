package com.sandeep.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pair {
	public static ArrayList<Integer> checkPair(ArrayList<ArrayList<Integer>> cardGot) 
	{
		HashMap<Integer,Integer> res=new HashMap<>();
		int max=-1;
		ArrayList<Integer> ans= new ArrayList<>();
		for(int i=0;i<4;i++)
		{
			int card1=cardGot.get(i).get(0)%13;
			int card2=cardGot.get(i).get(1)%13;
			int card3=cardGot.get(i).get(2)%13;
			if(card1==card2||card2==card3)
			{
				res.put(i,card2);
				if(card2>max)
					max=card2;
			}
			else if(card1==card3)
			{
				res.put(i,card1);
				if(card1>max)
					max=card1;
			}
			
		}
		
		for (Map.Entry<Integer,Integer> mapElement : res.entrySet()) { 
            Integer key = mapElement.getKey();
            Integer value =mapElement.getValue();
            if(value==max)
            	ans.add(key);
        }
		
		return ans;
	}
}
