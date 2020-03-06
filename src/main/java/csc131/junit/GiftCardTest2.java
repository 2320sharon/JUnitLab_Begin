package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiftCardTest2 {


	@Test
	void testGetIssuingStore() {
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100;
		card = new GiftCard (issuingStore,balance);

		assertEquals(issuingStore,card.getIssuingStore(),"getIssingStore()");
	}
	
	@Test
	void constructor_IncorrectID_low() {
		assertThrows(IllegalArgumentException.class, ()->{new GiftCard(1,-100.00);});
	}
	
	@Test
	void constructor_IncorrectID_High() {
		assertThrows(IllegalArgumentException.class, ()->{new GiftCard(-100,100.00);});
	}
	
	
	@Test
	void testdeduct()
	{
	 double balance;
	 GiftCard card;
		int issuingstore;
		
		issuingstore = 1337;
		balance = 100;
	 card=new GiftCard(issuingstore,balance);
	 assertEquals("Remaining Balance: 100.00",card.deduct(0),"deduct()");
	 
	 assertEquals("Invalid Transaction",card.deduct(-200),"deduct()");
	 
	 assertEquals("Amount Due: 100.00",card.deduct(200),"deduct()");
	}
	
	@Test
	void testbalance()
	{
	 double balance;
	 GiftCard card;
		int issuingstore;
		
		issuingstore = 1337;
		balance = 100;
	 card=new GiftCard(issuingstore,balance);
	 assertEquals(balance,card.getBalance(),0.001,"Test Balance()");
	}
	

}
