package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.service.BalancingBrackets;

public class Driver {

	private static Scanner sc =new Scanner(System.in);
	private static BalancingBrackets bracket = null;

	public static void main (String[] args)
	{
		//String braket ="{[{()}]}";
		String braket ="{[{()}]";
		System.out.println("Please enter the bracket expression " + braket );
		braket=sc.next();
		System.out.println("Brackets " + braket );
		bracket=new BalancingBrackets();
		if (bracket.parseBrackets(braket)) {
			if (bracket.evaluateBrackets()) {
				System.out.println("Brackets are Balanced " + braket );
			}else {
				System.out.println("Brackets are NOT Balanced " + braket );
			}
		}

	}
}
