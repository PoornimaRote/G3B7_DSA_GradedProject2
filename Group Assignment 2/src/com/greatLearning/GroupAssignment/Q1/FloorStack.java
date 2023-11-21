package com.greatLearning.GroupAssignment.Q1;

import java.util.*;

public class FloorStack {
	public static void constructSkyscraper(int totalFloors, int[] constructionDays) {
		Scanner scn = new Scanner(System.in);
		for (int currentDay = 1; currentDay <= totalFloors; currentDay++) {
			System.out.println("Enter the size of the floor provided on day " + currentDay + ":");
			int floorSize = scn.nextInt();
			// Check if floor size is valid
			if (floorSize < 1 || floorSize > totalFloors) {
				System.out.println("Invalid floor size. Please enter a valid floor size.");
				scn.nextLine();
				currentDay--; // Decrement currentDay to re-enter the current day's size
				continue;
			}
			constructionDays[floorSize] = currentDay;
		}
		scn.close();
	}

	public static void printConstructionOrder(int totalFloors, int[] constructionDays) {
		int remainingFloors = totalFloors;
		System.out.println("\nThe construction order is as follows:\n");
		for (int currentDay = 1; currentDay <= totalFloors; currentDay++) {
			boolean floorAssembled = false;
			System.out.println("Day " + currentDay + ":");
			while (remainingFloors >= 1 && constructionDays[remainingFloors] <= currentDay) {
				floorAssembled = true;
				System.out.print(remainingFloors + " ");
				remainingFloors--;
			}
			if (floorAssembled) {
				System.out.println();
			} else {
				System.out.println();
			}
		}
	}

}