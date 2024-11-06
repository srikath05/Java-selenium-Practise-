package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Removingduplicatesfromarraylistusinghashet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List arraylist = getDataFromDB();
		
		//converting arraylist to hashset to remove duplicates
		Set<String> hashset = new HashSet<String>();
		Iterator itr = arraylist.iterator();
		while(itr.hasNext()){
			String Currentnames = itr.next().toString();
			System.out.println("Before = " + " " + Currentnames);
					
			hashset.add(Currentnames);
		
			
		}
		
		Iterator Hset = hashset.iterator();
		while(Hset.hasNext()) {
			
			System.out.println("After =" + " " + Hset.next());
		}
		

	}

	public static List getDataFromDB() {
		
		
		List<String> al = new ArrayList<String>();
		al.add("Srikanth");
		al.add("Shirisha");
		al.add("Srikanth");
		al.add("Sriansh");
		al.add("Shirisha");
		al.add("Srihamsini");
		return al;
	}
}
