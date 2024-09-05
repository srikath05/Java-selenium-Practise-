package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class HasSet {

	public static void main(String arg[])
	{
		
		Set al = getDataFromDatabase();
		
		Iterator itr = al.iterator();
		//ListIterator ll= al.listIterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		al.remove("Kiran");
		
		Iterator itr1 = al.iterator();
		while(itr1.hasNext())
		{
			System.out.print("\"After\" ");
			System.out.println(itr1.next());
		}
		
//		while(ll.hasNext())
//		{
//			System.out.println(ll.next());
//			ll.previous();
//			
//		}
	}
	
	public static Set getDataFromDatabase()
	{
		//open db connection
		//gets data
		Set<String> al = new HashSet<String>();
		al.add("Raj");
		al.add("Kiran");
		al.add("Srikanth");
		al.add("Kiran");
		return al;
		
	}
	
	
}
