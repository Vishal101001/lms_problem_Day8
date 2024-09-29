package com.lmsDay8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a HashMap to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding cricketer names and their scores
        cricketerScores.put("Rohit Sharma", 12000);
        cricketerScores.put("Virat Kohli", 9500);
        cricketerScores.put("Dhone", 8500);
        cricketerScores.put("AB de Villiers", 9200);
        cricketerScores.put("Sachin Tendulkar", 8000);

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the cricketer to search for their score: ");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer in the map
        if (cricketerScores.containsKey(cricketerName)) {
            Integer score = cricketerScores.get(cricketerName);
            System.out.println(cricketerName + " score is: " + score);
        } else {
            System.out.println("Cricketer not found in the records.");
        }

        // Close the scanner
        scanner.close();
    }
}
