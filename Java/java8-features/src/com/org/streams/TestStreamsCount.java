package com.org.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamsCount {

	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops = Laptop.getAllLaptops();
		long count = laptops.stream().filter(laptop -> laptop.getName().equals("Dell")).count();
		System.out.println(count);
	}

}
