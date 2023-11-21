package com.greatLearning.GroupAssignment.Q1;

import java.util.*;

public class SkyscraperConstruction {
	public static void main(String args[]) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter the total number of floors in the building:");
		int totalFloors = inputScanner.nextInt();
		int[] constructionDays = new int[totalFloors + 1];
		FloorStack.constructSkyscraper(totalFloors, constructionDays);
		FloorStack.printConstructionOrder(totalFloors, constructionDays);
		inputScanner.close();
	}
}