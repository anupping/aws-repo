package com.lambda.lambdaOne;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepo {

	public List<Inventory> buildInventory() {
		return Stream.of(
				new Inventory(101, "Movie", 22, 1),
				new Inventory(102, "Book", 33, 2),
				new Inventory(103, "Toys", 44, 3),
				new Inventory(104, "Movie", 55, 1)
			).collect(Collectors.toList());
	}

}
