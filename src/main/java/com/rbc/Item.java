package com.rbc;

import java.util.Objects;

public class Item {
	private final String name;
	
	public Item(final String name) {
		this.name = Objects.requireNonNull(name);
	}

	/**
	 * Price of the named item.
	 * If the name of the item is invalid not priced it returns 0.0 (zero).
	 * @return the price of the named item in <code>double</code>. 
	 */
	public double price() {
		switch (name) {
		case "Oranges":
			return 1.2;
		case "Apples":
			return 2.50;
		case "Bananas":
			return 3.4;
		case "Lemons":
			return 2.3;
		case "Peaches":
			return 1.6;
		default:
			return 0.0;
		}
	}

}
