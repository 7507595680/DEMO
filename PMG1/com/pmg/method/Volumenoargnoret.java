package com.pmg.method;
import java.util.*;
public class Volumenoargnoret {
	public static void main(String a[]) 
	{
		CylinderVoulme();
		
	}

   static void CylinderVoulme()
   {
   double r,h,v;
   final double PI=3.14;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter radius");
   r=sc.nextDouble();
   System.out.println("Enter Height");
   h=sc.nextDouble();
   v= PI*r*r*h;
   System.out.println("Volume of Cylinder" +v);
    
   }
   
}
