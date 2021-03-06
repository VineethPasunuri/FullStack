package com.org.streams;

import java.util.List;

public class TestParallelStream {

	public static void main(String[] args) {
		List<Laptop> laptops = Laptop.getAllLaptops();
		laptops.stream().filter(item -> item.getRamSize() > 8)
				.forEach(item -> System.out.println(item + " " + Thread.currentThread().getName()));
		System.out.println("---------------------------------------------------------");
		laptops.parallelStream().filter(item -> item.getRamSize() > 8)
				.forEach(item -> System.out.println(item + " => " + Thread.currentThread().getName()));

	}

}
