
//package com.pmg.methodoverride;
import com.pmg.methodoverride.Product;
	public class TestEqualsHashCode {
		
		public static void main(String[] args) {
			
			Product p1 = new Product(10, new String("ProductOne"));//100
			Product p2 = new Product(10, new String("ProductOne"));//110
			Product p3 = new Product(10, new String("ProductTwo"));//120
			Product p4 = new Product(11, new String("ProductOne"));//130
			Product p5 = p1; //100
			
			/*
			System.out.println(p1==p2);//false --
			System.out.println(p2==p3);//false --
			System.out.println(p3==p4);//false --
			System.out.println(p4==p5);//false --
			System.out.println(p5==p1);//true --
			 */																   //id/name	   Id	  	name
			System.out.println(p1.equals(p2)); //false --  true		--   true  -- true   
			System.out.println(p2.equals(p3)); //false --  false		--   true  -- false
			System.out.println(p3.equals(p4)); //false --  false     --   false  -- false
			System.out.println(p4.equals(p5));//false --   false     --   false   -- true
			System.out.println(p5.equals(p1));//true --  true        --   true   -- true
					
			
			
			
		}
	}


