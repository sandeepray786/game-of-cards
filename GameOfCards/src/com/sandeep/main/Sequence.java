package com.sandeep.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Sequence {
	public static boolean checkSequence(ArrayList<ArrayList<Integer>> cardGot) 
	{
		HashMap<Integer,Integer> res=new HashMap<>();
		for(int i=0;i<4;i++)
				if(cardGot.get(i).get(1)==(cardGot.get(i).get(0)+cardGot.get(i).get(2))/2)
					res.put(i, cardGot.get(i).get(2));
		
//		for(int i )
		return false;
		
		
	}
}
