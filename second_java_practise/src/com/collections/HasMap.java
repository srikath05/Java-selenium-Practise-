package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HasMap {

	public static void main(String args[])
	{
//		Map<Integer,String> hm= addStrings();
//		String name= hm.get(3);
//		System.out.println(name);
//		Set<Integer> s=  hm.keySet();
//		System.out.println(s);
		
		Map<String,String> mp= addStrings();
		String name= mp.get("Ganji");
		System.out.println(name);
		Set<String> s=  mp.keySet();
		System.out.println(s);
		Collection c = mp.values();
		//List<String> l =(List<String>) hm.values();
		System.out.println(c);
		System.out.println(mp);
	}
	
	public static Map addStrings()
	{
		//HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		
//		Map<Integer,String> hm = new HashMap<Integer,String>();
//		hm.put(1, "Raju");
//		hm.put(2, "Kiran");
//		hm.put(3, "sri");
		
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("Dasari1", "Raju");
		hm.put("Dasari2", "Kiran");
		hm.put("Ganji", "sri");
		hm.put("", "shirisha");
		
		return hm;
	}
}
