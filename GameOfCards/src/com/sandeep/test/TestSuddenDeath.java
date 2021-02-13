package com.sandeep.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.main.SuddenDeath;

class TestSuddenDeath {

	@Test
	void testCheckSuddenDeath() {
		ArrayList<String> nameOfPlayers= new ArrayList<>();
		nameOfPlayers.add("A1");
		nameOfPlayers.add("A2");
		nameOfPlayers.add("A3");
		nameOfPlayers.add("A4");
		
		ArrayList<Integer> abc= new ArrayList<>();
		abc.add(0);
		abc.add(1);
		abc.add(2);
		ArrayList<Integer> restOfCard= new ArrayList<>();
		for(int i=0;i<12;i++)
			restOfCard.add(0);
		restOfCard.add(2);
		restOfCard.add(15);
		restOfCard.add(28);
		restOfCard.add(13);
		restOfCard.add(27);
		restOfCard.add(12);
		int start=12;
		
			
		int x=SuddenDeath.checkSuddenDeath( nameOfPlayers,
				 abc,
				restOfCard,
				start);
		assertEquals(1,x);
	}

}
