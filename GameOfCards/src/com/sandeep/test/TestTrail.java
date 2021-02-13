package com.sandeep.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.main.Pair;
import com.sandeep.main.Trails;

class TestTrail {

	@Test
	void testCheckTrails() {
		ArrayList<ArrayList<Integer> > aList =  
                new ArrayList<ArrayList<Integer> >(); 
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(1); 
        a1.add(5); 
        a1.add(6); 
        aList.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(13); 
        a2.add(26); 
        a2.add(52); 
        aList.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(12); 
        a3.add(51); 
        a3.add(2); 
        aList.add(a3); 
        
        ArrayList<Integer> a4 = new ArrayList<Integer>(); 
        a4.add(15); 
        a4.add(7); 
        a4.add(16); 
        aList.add(a4); 
		assertEquals(1,Trails.checkTrails(aList));
	}

}
