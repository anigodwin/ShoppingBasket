package com.rbs;

import java.util.Objects;

public class Item {

	private final String name;
	private final double unitPrice;
	
	public Item(final String name, final double unitPrice) {
		this.name = Objects.requireNonNull(name);
		this.unitPrice = Math.abs(unitPrice);
	}

	public double price() {
		return unitPrice;
	}

}
