package com.epam.cleantask2;

public class ConstCost {

	double area;
	int material;
	char automated;
	ConstCost(double area,int material,char automated)
	{
		this.area=area;
		this.material=material;
		this.automated=automated;
	}
	public double cost()
	{
		double housecost=0;
		if(material==1)
		{
			housecost=area*1200;
		}
		else if(material==2)
		{
			housecost=area*1500;
		}
		else if(material==3)
		{
			if(automated=='Y')
			{
				housecost=area*1800;
			}
			else
			{
				housecost=area*2500;
			}
			
		}
		return housecost;
	}
		
		
 }
