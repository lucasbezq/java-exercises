package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Project {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Lucas");
		list.add("Elis");
		list.add("Luis");
		list.add("Thais");
		list.add(2, "Aline");
		
		System.out.println(list.size());
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
		list.removeIf(p -> p.charAt(0) == 'A');
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		System.out.println("Index of Thais: " + list.indexOf("Thais"));
		System.out.println("Index of João: " + list.indexOf("João"));
		System.out.println("---------------");
		
		List<String> result = list.stream().filter(p -> p.charAt(0) == 'L')
				.collect(Collectors.toList());
		for (String name : result) {
			System.out.println(name);
		}
		
		System.out.println("---------------");
		String name = list.stream().filter(p -> p.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}
}
