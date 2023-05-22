import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//42. Write a program to find the duplicate word from a long string.
public class Question42Fortytwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		List<Map.Entry<String, Integer>> result = findDuplicateWords(inputString);

		if (!result.isEmpty()) {
			System.out.println("Duplicate words:");
			for (Map.Entry<String, Integer> entry : result) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		} else {
			System.out.println("No duplicate words found.");
		}

		scanner.close();
	}

	public static List<Map.Entry<String, Integer>> findDuplicateWords(String str) {
		// Split the string into words
		String[] words = str.split("\\s+");

		// Create a HashMap to store word counts
		Map<String, Integer> wordCounts = new HashMap<>();

		// Iterate through each word
		for (String word : words) {
			// Remove punctuation and convert to lowercase for better matching
			String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

			// If the word is already in the HashMap, increment its count
			if (wordCounts.containsKey(cleanedWord)) {
				wordCounts.put(cleanedWord, wordCounts.get(cleanedWord) + 1);
			}
			// Otherwise, add the word to the HashMap with a count of 1
			else {
				wordCounts.put(cleanedWord, 1);
			}
		}

		// Create a list to store duplicate words
		List<Map.Entry<String, Integer>> duplicates = new ArrayList<>();

		// Iterate through the word counts and find duplicates
		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry);
			}
		}

		return duplicates;
	}

}
