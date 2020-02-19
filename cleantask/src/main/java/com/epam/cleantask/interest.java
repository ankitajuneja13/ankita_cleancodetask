package com.epam.cleantask;
import java.util.*;
public class interest {

	double rate,p,time;
	interest(double rate,double principle,double time)
	{
		this.rate=rate;
		this.p=principle;
		this.time=time;
	}
	public double simpleInterest()
	{
		double SI;
		SI=(p * time * rate)/100;
		return SI;
	}
	public double compoundInterest()
	{
		double CI;
		double amount= p*Math.pow((1.0+ rate/100.0),time);
		
        CI=amount - p ;
     
		return CI;
	}
}
