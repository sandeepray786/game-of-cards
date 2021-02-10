package com.sandeep.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Trails {
		public static int checkTrails(ArrayList<ArrayList<Integer>> cardGot) 
		{
			int res=-1;
			int max=-1;
			for(int i=0;i<4;i++)
					if(cardGot.get(i).get(1)%13==cardGot.get(i).get(0)%13 && cardGot.get(i).get(0)%13==cardGot.get(i).get(2)%13)
					{
						if(cardGot.get(i).get(1)%13==0)
							return i;
						else if(cardGot.get(i).get(1)%13>max)
							res= i;
							max=cardGot.get(i).get(1)%13;
					}
			return res;
			
			
		}
}
