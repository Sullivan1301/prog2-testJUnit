package org.example;

public class HidingSpot {
    public static boolean isHidingAnOption(String input) {
        // Find the positions of X (you), A (animal), and C (hiding spots)
        int yourPosition = input.indexOf('X');
        int animalPosition = input.indexOf('A');
        int[] hidingSpotPositions = new int[input.length() - 2]; // Maximum number of hiding spots

        int numHidingSpots = 0;

        // Iterate through the input string to find hiding spots (C)
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'C') {
                hidingSpotPositions[numHidingSpots] = i;
                numHidingSpots++;
            }
        }

        // Calculate time it takes to reach each hiding spot
        for (int i = 0; i < numHidingSpots; i++) {
            int hidingSpotDistance = Math.abs(hidingSpotPositions[i] - yourPosition);
            int animalDistance = Math.abs(hidingSpotPositions[i] - animalPosition);

            // If you can reach the hiding spot before the animal, return true
            if (hidingSpotDistance <= animalDistance) {
                return true;
            }
        }

        // If no hiding spot can be reached before the animal, return false
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHidingAnOption("X..C....A..")); // true
        System.out.println(isHidingAnOption("X...C..A"));    // false
        System.out.println(isHidingAnOption("X....A.C.....C.C")); // false
    }
}
