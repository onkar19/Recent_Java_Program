package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner2 {

	public static void main(String[] args) {
		List<Laptop2> laps = new ArrayList<>();
		laps.add(new Laptop2("Dell", 8, 20000));
		laps.add(new Laptop2("Apple", 16, 12000));
		laps.add(new Laptop2("Lenovo", 12, 10000));
		
		Comparator<Laptop2> com = new Comparator<Laptop2>() {
			
			@Override
			public int compare(Laptop2 l1, Laptop2 l2) {
				if(l1.getPrice() > l2.getPrice())
					return 1;
				else
					return -1;
							
				
			}
		};
		
		Collections.sort(laps, com);
		
		for(Laptop2 l : laps) {
			System.out.println(l);
		}

	}

}
