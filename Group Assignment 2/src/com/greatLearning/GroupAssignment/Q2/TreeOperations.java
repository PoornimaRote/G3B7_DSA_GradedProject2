package com.greatLearning.GroupAssignment.Q2;

import java.util.*;

public class TreeOperations {
	Node node;
	Node prevNode = null;
	Node headNode = null;

	void modifyAndDisplay(Node root) {
		if (root == null) {
			return;
		}
		// Convert left subtree to skewed tree
		modifyAndDisplay(root.left);
		Node rightNode = root.right;
		// Condition to check if the headNode is null
		if (headNode == null) {
			headNode = root;
			prevNode = root;
		} else {
			prevNode.right = root;
			prevNode = root;
		}
		root.left = null;
		// Recursion for the remaining right subtree
		modifyAndDisplay(rightNode);
	}

	void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
	}

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	void buildInitialBST() {
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);
	}
}
