package com.sandeep.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.main.TopCard;

class TestTopCard {

	@Test
	void testCheckTopCard() {
		ArrayList<ArrayList<Integer> > aList =  
                new ArrayList<ArrayList<Integer> >(); 
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(2); 
        a1.add(5); 
        a1.add(6); 
        aList.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(14); 
        a2.add(26); 
        a2.add(16); 
        aList.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(12); 
        a3.add(50); 
        a3.add(2); 
        aList.add(a3); 
        
        ArrayList<Integer> a4 = new ArrayList<Integer>(); 
        a4.add(18); 
        a4.add(7); 
        a4.add(19); 
        aList.add(a4); 
        //Even if a2 and a3 both have pair a2 wins because of higher card (Ace)
        assertEquals(1,TopCard.checkTopCard(aList).get(0));
	}

}
