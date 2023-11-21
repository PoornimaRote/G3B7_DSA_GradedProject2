package com.greatLearning.GroupAssignment.Q2;

public class Main {
	public static void main(String[] args) {
		TreeOperations treeOps = new TreeOperations();
		treeOps.buildInitialBST();
		System.out.println("Initial BST (Level Order):");
		treeOps.levelOrder(treeOps.node);
		treeOps.modifyAndDisplay(treeOps.node);
		System.out.println("\nSkewed BST (In-order):");
		treeOps.inOrder(treeOps.headNode);
	}
}