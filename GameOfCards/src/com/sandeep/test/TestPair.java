package com.sandeep.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.main.Pair;

class TestPair {

	@Test
	void testCheckPair() {
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
        a2.add(16); 
        aList.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(12); 
        a3.add(51); 
        a3.add(2); 
        aList.add(a3); 
        
        ArrayList<Integer> a4 = new ArrayList<Integer>(); 
        a4.add(18); 
        a4.add(7); 
        a4.add(19); 
        aList.add(a4); 
        //Even if a2 and a3 both have pair a2 wins because of higher card (Ace)
        assertEquals(1,Pair.checkPair(aList).get(0));
	}

}
