package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 8, 20000));
		laps.add(new Laptop("Apple", 12, 12000));
		laps.add(new Laptop("Lenovo", 16, 10000));
		
		Collections.sort(laps);
		
		for(Laptop l : laps) {
			System.out.println(l);
		}

	}

}
