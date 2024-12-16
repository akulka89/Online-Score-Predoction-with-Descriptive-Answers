package com.DAOConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.CreateProfileModel;

public class CreateProfileDAO {

	
	public static int createProfileConnection(CreateProfileModel objmodel) throws SQLException {
		
		Connection con=GetConnection.getconnection();
		String sql = "insert into profiledata2(uname,age,cname,dname,qualification,tintrest,location,profile,ExamId) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm = con.prepareStatement(sql);
        int i=0;   
		
		pstm.setString(1,objmodel.getUname());
		pstm.setInt(2,objmodel.getAge());
		pstm.setString(3,objmodel.getCname());
		pstm.setString(4,objmodel.getDname());
		pstm.setString(5,objmodel.getQualification());
		pstm.setString(6,objmodel.getTintrest());
		pstm.setString(7,objmodel.getLocation());
		pstm.setString(8,objmodel.getProfile());
		pstm.setString(9,objmodel.getExamID());
		
		
		System.out.println(objmodel.getUname());
        System.out.println(objmodel.getAge());
        System.out.println(objmodel.getCname());
        System.out.println(objmodel.getDname());
        System.out.println(objmodel.getQualification());
        System.out.println(objmodel.getTintrest());
        System.out.println(objmodel.getExamID());
        System.out.println(objmodel.getProfile());
        System.out.println(objmodel.getLocation());

        
		
		i=pstm.executeUpdate();
		
		
		return i;
	}
	
	
	
}
