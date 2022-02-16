package com.org.streams;

import java.util.ArrayList;
import java.util.List;

public class TestforEach {

	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops = Laptop.getAllLaptops();
		laptops.parallelStream().forEach(l -> System.out.println(l));

	}

}
