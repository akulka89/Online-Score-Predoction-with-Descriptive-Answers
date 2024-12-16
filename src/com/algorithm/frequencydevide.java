package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class frequencydevide {
	
	
	static double freq=1.3183347464017319;
	static double count=0.0;
	static int i=1;
	public static List<Double> dividef2(double freq)
	{
		
		double f=freq/5;
		
		double f2=0.0;
		List<Double> dfrequency=new ArrayList<Double>();
		for(int j=0;j<5;j++)
		{	
			f2=f2+f;	
		//System.out.println("frequency["+(i++)+"]");
		//System.out.println(f2);
		dfrequency.add(f2);
		}
		
		return dfrequency;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
