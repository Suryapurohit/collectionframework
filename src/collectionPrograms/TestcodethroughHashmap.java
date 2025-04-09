package collectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestcodethroughHashmap {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input your name:");

		for(int i = 1; i <= 5; i++) {
			System.out.print("Enter name " + i + ": ");
			map.put(i, scanner.next());
		}

		
		map.put(6, "User4");

		System.out.println("Output:");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " → Value: " + entry.getValue());
		}

		scanner.close();
	}
}
