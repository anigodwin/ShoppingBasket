package com.rbc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
	private final List<Item> items;
	
	public ShoppingBasket() {
		this.items = new ArrayList<Item>();
	}
	
	public ShoppingBasket addItem(final Item item) {
		items.add(item);
		return this;
	}
 
	public int totalItems() {
		return items.size();
	}

	public double totalCost() {
		return items.stream().mapToDouble(item -> item.price()).sum();
	}
	
	public static void main(String[] args) {
		ShoppingBasket shoppingBasket = new ShoppingBasket()
				.addItem(new Item("Oranges"))
				.addItem(new Item("Apples"))
				.addItem(new Item("Bananas"))
				.addItem(new Item("Lemons"))
				.addItem(new Item("Peaches"));
		System.out.println("Total cost of basket: " + shoppingBasket.totalCost() + "GBP");
	}

}
