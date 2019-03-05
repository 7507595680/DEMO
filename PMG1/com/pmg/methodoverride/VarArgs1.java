package com.pmg.methodoverride;

public class VarArgs1 {
	static void vaTest(int ...v)
	{
		System.out.println("Number of args:" +v.length);
		for(int x:v)//print x how many times(v)
			System.out.println(x + "");
		System.out.println();
		
	}
public static void main(String[] args) {
	//int n1[]= {10};
	//int n2[] = {1,2,3};
	//int n3[] = {};
	vaTest(10);
	vaTest(1,2,3);
	vaTest();
	vaTest(4,51,26,59,54);
}
}
