package com.epam.cleantask;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rate,time,principle;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount ");
		principle=sc.nextDouble();
		System.out.println("Enter the number of years ");
		time=sc.nextDouble();
		System.out.println("Enter the rate ");
		rate=sc.nextDouble();
		interest i= new interest(rate,principle,time);
		System.out.println("Simple interest : "+i.simpleInterest());
		System.out.println("Compound interest : "+i.compoundInterest());

	}

}
