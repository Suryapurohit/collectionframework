package collectionPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class testcode {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();  
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input your name:");

		for(int i = 0; i < 5; i++) {
			set.add(scanner.next());
		}

		set.add("User4");  

		System.out.println("Output:");
		for(String s : set) {
			System.out.println(s);
		}

		scanner.close();
	}
}
