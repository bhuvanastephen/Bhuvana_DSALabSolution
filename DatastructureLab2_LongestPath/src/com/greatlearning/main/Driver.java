package com.greatlearning.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatlearning.model.Node;
import com.greatlearning.service.LongestPath;

public class Driver {

	private static Scanner sc =new Scanner(System.in);
	private static LongestPath longestPath = null;
	private Node node = null;
	public static void main (String[] args)
	{

		ArrayList<Integer> pathArr=new ArrayList<Integer>();
		Driver tree = new Driver();
		
		//Hard-Coded tree
		tree.node = new Node(100);
		tree.node.left = new Node(20);
		tree.node.left.left = new Node(10);
		tree.node.left.right = new Node(50);
		tree.node.left.left.left = new Node(5);
		tree.node.right = new Node(130);
		tree.node.right.left= new Node(110);
		tree.node.right.right= new Node(110);
		
		//Find Longest Path
		longestPath=new LongestPath();
		pathArr=longestPath.findLongestPath(tree.node); 
		System.out.print("Longest path :" + pathArr.toString());
	
	}
}
