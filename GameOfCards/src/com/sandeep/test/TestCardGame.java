package com.sandeep.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sandeep.main.CardGame;

class TestCardGame {

	@Test
	void testDrawCards() {
		ArrayList<Integer> listOfCard= new ArrayList<>();
		ArrayList<ArrayList<Integer>> output= CardGame.drawCards(listOfCard);
		
		assertEquals(4,output.size());
		assertEquals(52,listOfCard.size());
		for(int i=0;i<4;i++)
				assertEquals(3,output.get(i).size());
	}

	@Test
	void testCheckAnswer() {
//		fail("Not yet implemented");
	}

	@Test
	void testGetCardNames() {
//		fail("Not yet implemented");
	}

}
