package com.inheritance;

import java.util.HashMap;
import java.util.Map;

public class Eduinfo {

	public static void main(String[] args) {
		
		Map<Integer,Education> TV=new HashMap<Integer,Education>();
		int x=0;
		while(x<5)
		{
			int deptno=0+x;
			String sub="seven"+x;
			String pra="pra"+x;
			int labs=6+x;
			Education edu=createeduinfo(deptno,sub,pra,labs);
			TV.put(deptno, edu);
			x++;
		}
			System.out.println(TV);
			System.out.println("******************");
			Education edu=TV.get(4);
			edu.printeducationinfo();
			
		
	}

	
	
		public static Education createeduinfo(int deptno,String sub,String pra,int labs) {
				
			Education edu=new Education();
			edu.setDeptno(deptno);
			edu.setSub(sub);
			edu.setPra(pra);
			edu.setLabs(labs);
			return edu;
		}
}
