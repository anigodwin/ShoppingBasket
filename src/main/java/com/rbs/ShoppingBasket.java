package com.rbs;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
	private final List<Item> items;
	
	public ShoppingBasket () {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(final Item item) {
		items.add(item);
	}
 
	public int totalItems() {
		return items.size();
	}

	public double totalCost() {
		return items.stream().mapToDouble(item -> item.cost()).sum();
	}

}
