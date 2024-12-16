package com.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//import javax.swing.JOptionPane;

public class NearestNumber {
	

  //this is main method which we need to call for frequency count****************************************************************************	
	public static int mainfuncation(double tfidf2,Integer questionid1) throws FileNotFoundException
	{
		
		
		
		int marks=0;
		int marks1=0;
		int questionid=questionid1;
		List<Double> freqlist=fetchfreq(questionid);	
		double array[]=new double[freqlist.size()];
		for(int i=0;i<freqlist.size();i++)
		{
		  array[i]=freqlist.get(i);	
		}
		
		System.out.println("my question frequency=="+tfidf2);
		System.out.println("data base frequency==="+freqlist);
		
		
		if(tfidf2<freqlist.get(0))
		{
			marks=0;
			System.out.println("knn===="+marks);
		}
		else
		{	
		
		
		
		//System.out.println("enter your number==");
		/*String myNumberString="1.0546677971213856";//enter your frequency manualy here..................................................
		double myNumber =Double.parseDouble(myNumberString);
		*/
		double nearestNumber = findNearestNumber(array,tfidf2);
	    System.out.println("nearest number=="+nearestNumber);
	    
	    marks1=findmarks(array,nearestNumber);
	    
	    marks=marks1;
	    System.out.println("knn===="+marks);
	    //marks find here..............................................................................................

		}
	    return marks;
	}


	
	
//this method is used to freched data from ARFF file***************************************************************************************	
public static List<Double> fetchfreq(int questionid) throws FileNotFoundException
{
	
	File file =new File("E:\\vaibhav\\Test\\TestTFIDF.arff"); 
	List<Double> freqlist=new ArrayList<Double>();
	int qid=questionid;
		    Scanner sc = new Scanner(file); 
		    String str="";
		    while (sc.hasNextLine()) 
		    {	
		      str=str+sc.nextLine();
		      
		      
		    }
		    System.out.println(str);
		    
		    String str1[]=str.split(" ");
		    for(int i=1;i<str1.length;i++)
		    {
		     String str3[]=str1[i].split(",");	
		    	
		     
		     for(int j=1;j<str3.length;j++)
		     {
		    	int id=Integer.parseInt(str3[0]); 
		    	 if(id==qid)
		    	 {	 
		    		 freqlist.add(Double.parseDouble(str3[j]));
		    	 }
		     }
		    	
		    }
		    System.out.println(freqlist);
		    
		    
		    return freqlist;
		       
 
}



	
//main method
public static void main(String[] arg) throws IOException
{
	double tfidf2=0.31734617994135447;
	Integer questionid1=1;
	
	
	mainfuncation(tfidf2,questionid1);
	
	/*List<Double> freqlist=fetchfreq();
	
	double array[]=new double[freqlist.size()];
	for(int i=0;i<freqlist.size();i++)
	{
	  array[i]=freqlist.get(i);	
	}
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number==");
    String myNumberString=sc.nextLine();
    
    //String myNumberString ="99";
    //JOptionPane.showInputDialog(null,"Enter the number to test:");
    double myNumber =Double.parseDouble(myNumberString);	

    double nearestNumber = findNearestNumber(array,myNumber);

    System.out.println("nearest number=="+nearestNumber);
    
    int marks=findmarks(array,nearestNumber);
    
    
  //JOptionPane.showMessageDialog(null,"The nearest number is "+nearestNumber);
*/
	}



//this function is used for find nearest frequency*********************************************************
public static double findNearestNumber(double[] array,double myNumber)
{

    double min=0,nearestNumber;
	double max=0;

    for(int i=0;i<array.length;i++)
    {
        if(array[i]<myNumber)
        {
            if(min==0)
            {
                min= array[i];
            }
            else if(array[i]>min)
            {
                min= array[i];
            }
        }
        else if(array[i]>myNumber)
        {
            if(max==0)
            {
                max= array[i];
            }
            else if(array[i]<max)
            {
                max=array[i];
            }
        }
        else
        {
            return array[i];
        }
    }

    if(Math.abs(myNumber-min)<Math.abs(myNumber-max))
    {
        nearestNumber=min;
    }
    else
    {
        nearestNumber=max;
    }

    return nearestNumber;
}




//this method is used to calculate marks*****************************************************************************
public static int findmarks(double array[],double freq)
{
 int marks=0,count=0;;
 
  for(int i=0;i<array.length;i++)
  {
   if(array[i]==freq)
   {
    count=i;	   
   }
  }
 switch (count) {
case 0:
    System.out.println(marks=1); 	
	break;
case 1:
	System.out.println(marks=2);
	break;
case 2:
	System.out.println(marks=3);
	break;
case 3:
	System.out.println(marks=4);
	break;
case 4:
	System.out.println(marks=5);
	break;
default:
	break;
}	
	
	
return marks;	
}


}
