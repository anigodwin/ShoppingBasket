package com.rbs;

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
				.addItem(new Item("Orange", 1.2))
				.addItem(new Item("Aple", 2.50))
				.addItem(new Item("Bananas", 3.4))
				.addItem(new Item("Lemons", 2.3))
				.addItem(new Item("Peaches", 1.6));
		System.out.println(shoppingBasket.totalCost());
	}

}
