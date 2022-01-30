package com.greatlearning.service;

import java.util.ArrayList;
import com.greatlearning.model.Node;
public class LongestPath {
  

	public ArrayList<Integer> findLongestPath(Node root)
    {
		ArrayList<Integer> p1=new ArrayList<Integer>();
		ArrayList<Integer> p2=new ArrayList<Integer>();
		ArrayList<Integer> returnArr =new ArrayList<Integer>();
		
        if(root == null)
        {
            return returnArr;
        }
 
        p1= findLongestPath(root.left);
        p2= findLongestPath(root.right);

        if (p1.size() >= p2.size()) {
        	p1.add(root.value);
        	returnArr=p1;
        }else  if (p1.size() < p2.size()) {
        	p2.add(root.value);
        	returnArr=p2;
        }
        
        return returnArr;

    }			
}
