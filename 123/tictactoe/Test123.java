package tictactoe;
import java.lang.*;

import java.util.*;
import java.io.*;
 class Test implements Comparable<Test>{
	
	int marks;
	String name;
	String add;
	

	public Test(int marks, String name, String add) {
		
		this.marks = marks;
		this.name = name;
		this.add = add;
	}

	public int compareTo(Test t)
	{
		if(marks== t.marks)
			return 0;
		else if(marks>t.marks)
			return 1;
		else
			
			return -1;
	}

}

public class Test123 
	
{
	
	public static void main(String[] args) {
		
		ArrayList<Test> al=new ArrayList<Test>();
		al.add(new Test(234,"abcd","xyz"));
		al.add(new Test(24,"acd","xyzv"));
		al.add(new Test(34,"abcde","xz"));
		Collections.sort(al);
		for(Test t:al)
		{
			System.out.println(t.add +t.marks +t.name);
		}
		
		
		
		
		

	}

}
