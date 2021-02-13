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
						int card=cardGot.get(i).get(1);
						
						if (card==1)
						{
							max=card;
							res=i;
						}
						else if(card==0 && max!=1)
						{
							res=i;
							max=card;
						}
						if(card>max && max!=0 && max!=1)
						{
							res= i;
							max=card;
						}
					}
			return res;
			
			
		}
}
