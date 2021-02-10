package com.sandeep.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sequence {
	public static ArrayList<Integer> checkSequence(ArrayList<ArrayList<Integer>> cardGot) 
	{
		ArrayList<Integer> ans= new ArrayList<>(); 
		int max=-1;
		
		HashMap<Integer,Integer> res=new HashMap<>();
		for(int i=0;i<4;i++)
				if(cardGot.get(i).get(1)==(cardGot.get(i).get(0)+cardGot.get(i).get(2))/2)
				{
					res.put(i, cardGot.get(i).get(2)%13);
					int maxNow=res.get(i);
					if(max>maxNow)
						max=maxNow;
				}
		//check repeat
		for (Map.Entry<Integer,Integer> mapElement : res.entrySet()) { 
            Integer key = mapElement.getKey();
            Integer value =mapElement.getValue();
            if(value==max)
            	ans.add(key);
        } 
		return ans;
		
		
	}
}
