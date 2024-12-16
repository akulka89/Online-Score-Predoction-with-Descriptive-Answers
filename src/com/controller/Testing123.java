package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import com.DAOConnection.DBConnnection;

public class Testing123 {
	
public static void main(String[] args) {
	
	 ArrayList<Integer> markslist=DBConnnection.getchartcontent(6);
	  
	 int total=0;
	 for(int i=0;i<markslist.size();i++)
	 {
	 	total=total+markslist.get(i);
	 	
	 	
	 }

	 System.out.println("total=="+total);

	 double percentage1=(22*100)/50;
	 System.out.println("percentage=="+percentage1);
	 double percentage2=100-percentage1;
	 
}	
	

}
