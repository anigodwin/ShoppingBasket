package com.rbs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {

	private ShoppingBasket shoppingBasket;
	
	@Before
	public void setUp() {
		shoppingBasket = new ShoppingBasket();
	}
	
	@Test
	public void testAddOneItemToBasket() throws Exception {
		shoppingBasket.addItem(new Item("Orange", 1.2));
		assertEquals(1, shoppingBasket.totalItems());
	}
	
	@Test
	public void testTotalCostOfTwoItems() throws Exception {
		shoppingBasket.addItem(new Item("Orange", 1.2));
		shoppingBasket.addItem(new Item("Aple", 2.50));
		assertTrue(3.7 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostOfZeroItem() throws Exception {
		assertTrue(0.0 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostOfAllFiveItems() throws Exception {
		shoppingBasket.addItem(new Item("Orange", 1.2));
		shoppingBasket.addItem(new Item("Aple", 2.50));
		shoppingBasket.addItem(new Item("Bananas", 3.4));
		shoppingBasket.addItem(new Item("Lemons", 2.3));
		shoppingBasket.addItem(new Item("Peaches", 1.6));
		assertTrue(11.0 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostOfAtLeastOneTypeOfItem() throws Exception {
		shoppingBasket.addItem(new Item("Orange", 1.2));
		shoppingBasket.addItem(new Item("Orange", 1.2));
		shoppingBasket.addItem(new Item("Aple", 2.50));
		shoppingBasket.addItem(new Item("Aple", 2.50));
		shoppingBasket.addItem(new Item("Aple", 2.50));
		shoppingBasket.addItem(new Item("Bananas", 3.4));
		shoppingBasket.addItem(new Item("Bananas", 3.4));
		shoppingBasket.addItem(new Item("Lemons", 2.3));
		shoppingBasket.addItem(new Item("Lemons", 2.3));
		shoppingBasket.addItem(new Item("Lemons", 2.3));
		shoppingBasket.addItem(new Item("Lemons", 2.3));
		shoppingBasket.addItem(new Item("Peaches", 1.6));
		assertTrue(27.5 == shoppingBasket.totalCost());
	}

}
