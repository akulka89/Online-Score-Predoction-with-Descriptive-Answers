package com.controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RandomQuestion {
	
	

	public static Map<Integer, String> getQuestion(int testid) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
    
	    Connection conn = null;
		
		while(map.size()!=10)
		{
		
		int id=randomnumber.randommethod(testid);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreprediction", "root", "root");
			String str = "select * from chiledtest where tid="+testid+" and qno="+id+"";
			PreparedStatement st = conn.prepareStatement(str);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				//System.out.println(rs.getInt("qid"));
				//System.out.println(rs.getString("question"));
				map.put(rs.getInt("qno"), rs.getString("question"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
		return map;

			
		}

	public static void main(String[] args) {
	/*	Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondatabase", "root", "root");
			String str = "select question  from javaquestion where questionid=1";
			PreparedStatement st = conn.prepareStatement(str);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
*/   
		
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		
		map1=getQuestion(1);
		System.out.println(map1);
	}

}
