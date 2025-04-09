package collectionPrograms;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();  // TreeSet automatically sorts elements
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input your name:");

		for(int i = 0; i < 5; i++) {
			set.add(scanner.next());
		}

		// Adding extra value
		set.add("User4");

		System.out.println("Output (Sorted & Unique Values):");
		for(String s : set) {
			System.out.println(s);
		}

		scanner.close();
	}
}
