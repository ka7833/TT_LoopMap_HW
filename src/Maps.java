import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Maps {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		ArrayList<String> numbers = new ArrayList<String>();
		String[] numberInput = userInput.nextLine().split(" ");
		
		for (int i = 0; i < 5; i++) {
			numbers.add(numberInput[i]);
		}
		
		System.out.println(numbers);
		String max = Collections.max(numbers);
		String min = Collections.min(numbers);
		int sum = 0;
		int product = 1;
		for (String num : numbers) {
			sum += Integer.parseInt(num);
			product *= Integer.parseInt(num);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

		HashMap<String, String> vehicles = new HashMap<>();
		vehicles.put("Camry", "Toyota");
		vehicles.put("Civic", "Honda");
		vehicles.put("Trailblazer", "Chevrolet");

		System.out.println("What car model are you looking for?");
		String model = userInput.nextLine();

		if (vehicles.containsKey(model)) {
			System.out.format("Oh you are looking for a %s? Our %s selection is right over here...", model,
					vehicles.get(model));
		} else {
			System.out.println("Sorry we dont have the model you are looking for.");
		}
	}
}
