package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("ram");
		list.add("santosh");
		list.add("sachin");
		
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}
