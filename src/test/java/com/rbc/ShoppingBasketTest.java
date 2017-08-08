package com.rbc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rbc.Item;
import com.rbc.ShoppingBasket;

public class ShoppingBasketTest {

	private ShoppingBasket shoppingBasket;
	
	@Before
	public void setUp() {
		shoppingBasket = new ShoppingBasket();
	}
	
	@Test
	public void testAddOneItemToBasket() throws Exception {
		shoppingBasket.addItem(new Item("Oranges"));
		assertEquals(1, shoppingBasket.totalItems());
	}
	
	@Test
	public void testTotalCostOfTwoItems() throws Exception {
		shoppingBasket.addItem(new Item("Oranges"));
		shoppingBasket.addItem(new Item("Apples"));
		assertTrue(3.7 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostOfZeroItem() throws Exception {
		assertTrue(0.0 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostOfAllFiveItems() throws Exception {
		shoppingBasket.addItem(new Item("Oranges"))
			.addItem(new Item("Apples"))
			.addItem(new Item("Bananas"))
			.addItem(new Item("Lemons"))
			.addItem(new Item("Peaches"));
		assertTrue(11.0 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostOfAtLeastOneTypeOfItem() throws Exception {
		shoppingBasket.addItem(new Item("Oranges"))
			.addItem(new Item("Oranges"))
			.addItem(new Item("Apples"))
			.addItem(new Item("Apples"))
			.addItem(new Item("Apples"))
			.addItem(new Item("Bananas"))
			.addItem(new Item("Bananas"))
			.addItem(new Item("Lemons"))
			.addItem(new Item("Lemons"))
			.addItem(new Item("Lemons"))
			.addItem(new Item("Lemons"))
			.addItem(new Item("Peaches"));
		assertTrue(27.5 == shoppingBasket.totalCost());
	}
	
	@Test
	public void testTotalCostWithInvalidItem_shouldReturnCostValidItemsOnly() throws Exception {
		shoppingBasket.addItem(new Item("Oranges"))
		.addItem(new Item("Oranges"))
		.addItem(new Item("Mangos"));
		assertTrue(2.4 == shoppingBasket.totalCost());
	}

}
