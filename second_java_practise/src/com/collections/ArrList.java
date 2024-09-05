package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrList {

	public static void main(String arg[])
	{
		//ArrayList al = new ArrayList();
		List aaarylist = getDataFromDatabase();
		
		// converting Array list into set (Hashset) to remove duplicates form the array list
		
		//Set<String> hashset = new HashSet<String>();
		Iterator itr = aaarylist.iterator();
		//ListIterator ll= al.listIterator();
		
		while(itr.hasNext())
		{
			String currentName = itr.next().toString();
			System.out.println("Print all the list before removing the duplicates " + " " +     currentName);
		//	hashset.add(currentName);
//			if(currentName.equals("Kiran"))
//			{
//				al.remove("kiran"); 
//			}
			
		}
		
		//al.remove("Kiran");
		
		/*
		 * Iterator itr1 = al.iterator(); while(itr1.hasNext()) {
		 * 
		 * System.out.println("Print all the list after removing" + itr1.next()); }
		 */
		
		/*
		 * Iterator shitr = hashset.iterator(); while(shitr.hasNext()) {
		 * 
		 * System.out.println("HashSet Print all the list after removing duplicates" +
		 * " " + shitr.next()); }
		 */
//		while(ll.hasNext())
//		{
//			System.out.println(ll.next());
//			ll.previous();
//			
//		}
	}
	
	public static List getDataFromDatabase()
	{
		//open db connection
		//gets data
		List<String> al = new ArrayList<String>();
		al.add("Raj");
		al.add("Kiran");
		al.add("Srikanth");
		al.add("Shirisha");
		al.add("Shirisha");
		al.add("Srikanth");
		return al;
		
	}
	
	
}

