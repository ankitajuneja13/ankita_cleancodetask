package com.epam.cleantask2;
import java.util.*;
public class Cost {

	public static void main(String[] args) {
		int material;
		char automated;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter area of house  :");
		area=sc.nextDouble();
		System.out.println("Choose the type of material to construct your house : ");
		System.out.println("1.Standard Material");
		System.out.println("2.Above Standard Material");
		System.out.println("3.Highly Standard Material");
		material=sc.nextInt();
		System.out.println("Do you want Fully Autoamted Home (Y/N)");
		automated=sc.next().charAt(0);
		ConstCost c=new ConstCost(area,material,automated);
		System.out.println("Cost of house is "+c.cost()+" INR");

	}

}
