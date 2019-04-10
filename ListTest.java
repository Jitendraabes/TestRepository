package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		List<String> list = new ArrayList<String>(); // Preferred way ? 
		
		 List<?> wildcardList = new ArrayList<Integer>();
		 
		  List<int> wildcardList1 = new ArrayList<int>(); // Compile time error
		  List<Integer> wildcardList1 = new ArrayList<Integer>(); // Correct i.e. should use the wrapper class
	}

}
