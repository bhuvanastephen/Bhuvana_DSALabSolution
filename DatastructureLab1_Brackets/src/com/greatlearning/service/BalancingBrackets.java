package com.greatlearning.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancingBrackets {

	String bracket="";
	ArrayList<String> arrStr =null;
	Stack<String> stack1 = null;

	public BalancingBrackets() {
	}

	public boolean parseBrackets(String bracket) {
		try {
			arrStr= new ArrayList<String>(bracket.length());
			for (int i = 0; i < bracket.length(); i++){
				arrStr.add(i,String.valueOf(bracket.charAt(i)) );  
			}
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public Boolean evaluateBrackets() {
		String openBrackets= "{([<"; 
		String closeBrackets= "})]>";
		String str1;
		String str2;
		Boolean result =true;
		stack1 =new Stack<String>();
		
		try {
			Map<String, String> map = new HashMap<>();
			for (int i = 0; i < openBrackets.length(); i++){
				map.put(String.valueOf( openBrackets.charAt(i)), String.valueOf( closeBrackets.charAt(i)));
			}

			String topelement="";
			if (arrStr.size() %2 != 0) {
				result=false;
			}
			for (int i = 0; i < arrStr.size(); i++){
				if (openBrackets.contains(arrStr.get(i))) {
					stack1.push(arrStr.get(i));
				}else if (closeBrackets.contains(arrStr.get(i))){
					topelement=(String) stack1.peek();

					str1=map.get(topelement);
					str2=arrStr.get(i);
					//if (str1.contains(str2)) {
					if (str1.contains(str2)) {
						stack1.pop();
					}else {
						result=false;
						break;
					}
				}
				else {
					result=false;
					break;
				}
			}
			return result;
		}catch(Exception e) {
			return false;
		}

	}
}
