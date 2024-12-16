package com.DAOConnection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import com.model.SaveTest;
import com.model.Testinfo;
import com.model.UserDetails;
import com.model.UserRegisterModel;


public class DBConnnection {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/scoreprediction?autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASS = "root";

	public static Connection makeConnection() {
		java.sql.Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			con =DriverManager.getConnection(DB_URL , USER, PASS);
//			con = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (Connection) con;

	}

	public static int addUser(UserDetails um) {

		Connection con = makeConnection();
		int i = 0;
		try {
			System.out.println("AArraa  raha hai");
			String sql = "insert into registration(fname,lname,gender,dob,city,state,email,password) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			

			pstm.setString(1, um.getFname());
			pstm.setString(2, um.getLname());
			pstm.setString(3, um.getGender());
			pstm.setString(4, um.getDate());
			pstm.setString(5, um.getCity());
			pstm.setString(6, um.getState());
			pstm.setString(7, um.getEmail());
			pstm.setString(8, um.getPass());
			
           
            
			i = pstm.executeUpdate();
			if (i == 1)
				System.out.println("Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	public static List<String> getsubject()
	{
		List<String> sname=new ArrayList<String>();
		Connection con = makeConnection();
		int i = 0;
		try {
			//System.out.println("AArraa  raha hai");
			String sql = "select sname from subject";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				sname.add(rs.getString("sname")); 	
				
			}
			//System.out.println(sname);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return sname;
		
	}
	
	
	public static List<Testinfo> gettestdata()
	{
		
		List<Testinfo> list=new ArrayList<Testinfo>();
		Connection con = makeConnection();
		int i = 0;
		try {
			//System.out.println("AArraa  raha hai");
			String sql = "select * from alltest";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				Testinfo info=new Testinfo();
				info.setTestid(rs.getInt("testid"));
				info.setTeacherid(rs.getInt("teacherid"));
				info.setTname(rs.getString("testname"));
				info.setCtime(rs.getString("CreateTime"));
				info.setCdate(rs.getString("CreateDate"));
				
				list.add(info);
			}
			//System.out.println(sname);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
	
	public static int getTestQuestionCount(int tid)
	{
		
     	Connection con = makeConnection();
		int count = 0;
		try {
			//System.out.println("AArraa  raha hai");
			String sql = "select count(*) from chiledtest where tid="+tid;
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				count=rs.getInt(1);
				
			}
			//System.out.println(sname);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return count;
		
	}
	
	
	
	
	public static int createTest(SaveTest s)
	{
		
		Connection con = makeConnection();
		int flage=0;
		try {
			//testid, teacherid, testname, CreateTime, CreateDate
			String sql ="insert into alltest(teacherid,testname,CreateTime,CreateDate) values(?,?,?,?)";
			
		    PreparedStatement st=con.prepareStatement(sql);
			 st.setInt(1,s.getUid());
			 st.setString(2,s.getTname());
			 st.setString(3,s.getTime());
			 st.setString(4,s.getDate());
			 flage=st.executeUpdate();
	        
			 System.out.println("CreateTable sucessfully");
 
	        
	        
								
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	 return flage;	
	}
	
	
	public static int getTesttId() {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		int id=0;		
			String sql = "select * from alltest order by testid desc limit 0,1";	
		
			try {
				pstm = con.prepareStatement(sql);
				ResultSet rs=pstm.executeQuery();
				
				while(rs.next())
				{
				id=rs.getInt("testid");	
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
			
			return id;
			
		}
		
	
	
	
	public static int saveTest(SaveTest s)
	{
		
		Connection con = makeConnection();
		int i=0;
		
		try {
			String sql ="insert into subject(sname,uname,date,time) values(?,?,?,?)";
		    PreparedStatement st=con.prepareStatement(sql);
		    st.setString(1,s.getTname());
		    st.setString(2,s.getUname());
		    st.setString(3, s.getDate());
		    st.setString(4, s.getTime());
			 i=st.executeUpdate();
	        System.out.println("insert sucessfully");
 
	        
	        
								
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	return i;
	}
	
	
	
	public static String getTestInfo(int id)
	{
		
		Connection con = makeConnection();
		int i=0;
		String uname="";
		try {
			String sql ="select * from teacherregister where id=?";
		    PreparedStatement st=con.prepareStatement(sql);
		    st.setInt(1,id);
		   
			 ResultSet rs=st.executeQuery();
	        
			 while (rs.next()) {
				
				 uname=rs.getString("fname")+" "+rs.getString("lname");
				 
				 
			    }
	        
	        
								
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	return uname;
	}
	
	public static int addQuestion(SaveTest s) {

		Connection con = makeConnection();
		String test=s.getTname();
		int i = 0;
		try {
			
			String sql = "insert into chiledtest(tid,question,answer) values(?,?,?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			
			//pstm.setString(1,s.getTname()); 
			pstm.setInt(1,s.getUid());
			pstm.setString(2,s.getQuestion());
			pstm.setString(3,s.getAnswer());
			i = pstm.executeUpdate();
			
			if (i == 1)
				System.out.println("Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
		
	
	
	
	public static int addQuestion2(int id,String question,String answer) {

		Connection con = makeConnection();
		
		int i = 0;
		try {
			
			String sql = "insert into chiledtest(tid,question,answer) values(?,?,?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			
			//pstm.setString(1,s.getTname()); 
			pstm.setInt(1,id);
			pstm.setString(2,question);
			pstm.setString(3,answer);
			i = pstm.executeUpdate();
			
			if (i == 1)
				System.out.println("Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	
	
	/*public static int addQuestion() {

		Connection con = makeConnection();
		
		SaveTest s=new SaveTest();
		s.setTid("1");
		s.setQuestion("what is java");
		s.setAnswer("jhvjhvjh");
		s.setTname("english1");
		String test=s.getTname();
		
		int i = 0;
		try {
			
			String sql = "insert into "+test+"(tid,question,answer) values(?,?,?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			
			//pstm.setString(1,s.getTname()); 
			pstm.setInt(1,s.getUid());
			pstm.setString(2,s.getQuestion());
			pstm.setString(3,s.getAnswer());
			
           
			i = pstm.executeUpdate();
			if (i == 1)
				System.out.println("Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
*/		
	
	public static UserDetails getprofileinfo(int id) {

	Connection con = makeConnection();
	
	UserDetails s=new UserDetails();
	int i = 0;
	try {
		
		String sql = "Select * from userregister2 where id="+id;
		PreparedStatement pstm = con.prepareStatement(sql);
       
		ResultSet rs= pstm.executeQuery();
		
		while(rs.next())
		{
		s.setFname(rs.getString("fname"));
		s.setLname(rs.getString("lname"));
		s.setEmail(rs.getString("email"));
		s.setGender(rs.getString("gender"));
		s.setDate(rs.getString("date"));
		s.setNumber(rs.getString("number"));
		s.setMobile(rs.getString("mobile"));
		s.setCity(rs.getString("city"));
		s.setQualification(rs.getString("Qualification"));
		s.setTI(rs.getString("TI"));
		s.setDepartment(rs.getString("Department"));
		s.setCN(rs.getString("CN"));
		s.setCA(rs.getString("CA"));
		s.setPA(rs.getString("PA"));
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return s;
	
}

	public static UserDetails getprofileinfo_teacher(int id) {

		Connection con = makeConnection();
		
		UserDetails s=new UserDetails();
		int i = 0;
		try {
			
			String sql = "Select * from teacherregister where id="+id;
			PreparedStatement pstm = con.prepareStatement(sql);
	       
			ResultSet rs= pstm.executeQuery();
			
			while(rs.next())
			{
			s.setFname(rs.getString("fname"));
			System.out.println("fname=="+s.getFname());
			s.setLname(rs.getString("lname"));
			System.out.println("lname=="+s.getLname());
			s.setEmail(rs.getString("email"));
			
			s.setNumber(rs.getString("number"));
			s.setGender(rs.getString("gender"));
			s.setDate(rs.getString("date"));
			
			/*s.setMobile(rs.getString("mobile"));
			s.setCity(rs.getString("city"));
			s.setQualification(rs.getString("Qualification"));
			s.setTI(rs.getString("TI"));
			s.setDepartment(rs.getString("Department"));
			s.setCN(rs.getString("CN"));
			s.setCA(rs.getString("CA"));
			s.setPA(rs.getString("PA"));*/
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
		
	}


	public static int profiledataupdate(int id,UserDetails s) {

		Connection con = makeConnection();
		
		
		int i = 0;
		try {
			
			String sql = "update userregister2 set fname='"+s.getFname()+"',lname='"+s.getLname()+"',email='"+s.getEmail()+"',number='"+s.getNumber()+"',gender='"+s.getGender()+"',date='"+s.getDate()+"',mobile='"+s.getMobile()+"',city='"+s.getCity()+"',Qualification='"+s.getQualification()+"',TI='"+s.getTI()+"',Department='"+s.getDepartment()+"',CN='"+s.getCN()+"',CA='"+s.getCA()+"',PA='"+s.getPA()+"' where id="+id;
			PreparedStatement pstm = con.prepareStatement(sql);
	       
			 i= pstm.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}
	public static int profiledataupdate1(int id,UserDetails s) {

		Connection con = makeConnection();
		
		
		int i = 0;
		try {
			
			String sql = "update teacherregister set fname='"+s.getFname()+"',lname='"+s.getLname()+"',email='"+s.getEmail()+"',number='"+s.getNumber()+"',gender='"+s.getGender()+"',date='"+s.getDate()+"'where id="+id;
			PreparedStatement pstm = con.prepareStatement(sql);
	       
			 i= pstm.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}
	
	
	public static UserRegisterModel getImg(int uid) throws IOException {
		//BufferedImage image = null;
		Connection connection = makeConnection();
		String sql = "select * from userregister2 where id=" + uid;
		UserRegisterModel obj=new UserRegisterModel();
		String base64Image=null;
		try {
			ResultSet rs = connection.createStatement().executeQuery(sql);
			
			
			while (rs.next()) {
				int uid1 = rs.getInt("id");
				if(rs.getBlob("profile")==null)
				{
					
				}
				else
				{	
				
				Blob blob = rs.getBlob("profile");
				InputStream inputStream = blob.getBinaryStream();
				//InputStream inputStream = blob.getBinaryStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;
                 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);                  
                }
                 
                byte[] imageBytes = outputStream.toByteArray();
                base64Image = Base64.getEncoder().encodeToString(imageBytes);
                 
                 
                inputStream.close();
                outputStream.close();
                
                obj.setBase64Image(base64Image);

				
			}					
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return obj;
		
	}


	public static void uploadImage(UserRegisterModel obj, int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		String sql = "update userregister2 set profile=? where id=?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setBlob(1,obj.getImage());
			pstm.setInt(2,id);
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	/*	public static void uploadImage1(UserRegisterModel obj, int id) {
			Connection con = makeConnection();
			PreparedStatement pstm = null;
			String sql = "update teacherregister set profile=? where id=?";
			try {
				pstm = con.prepareStatement(sql);
				pstm.setBlob(1,obj.getImage());
				pstm.setInt(2,id);
				pstm.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
	}
*/
	

	
	public static ArrayList<String> getheading() {
		Connection con = makeConnection();
		ArrayList<String> heading=new ArrayList<>();
		PreparedStatement pstm = null;
		String sql = "select * from studynotes1";
		try {
			pstm = con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			
			while(rs.next())
			{
				
				heading.add(rs.getString("heading"));	
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return heading;
	}

	

	
	public static ArrayList<String> getchiledheading(int cid) {
		Connection con = makeConnection();
		ArrayList<String> heading=new ArrayList<>();
		PreparedStatement pstm = null;
		String sql = "select * from studynotes2 where cid="+cid;
		try {
			pstm = con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			
			while(rs.next())
			{
				
				heading.add(rs.getString("heading"));	
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		System.out.println(heading);
		return heading;
	}

	
	
	
	
	
	public static Double profilePercentage(int id) {
		Double percentage=0.0;
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		String sql = "select * from userregister2 where id="+id;
		try {
			
			pstm = con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			Double columnsNumber = (double) rsmd.getColumnCount();
			Double total=(100.0/columnsNumber); 
			System.out.println("percentage="+100.0/columnsNumber);  
			//id, fname, lname, email, password, number, gender, date, mobile, city, Qualification, TI, Department, CN, CA, PA, profile
			while(rs.next())
			{
			 if(rs.getString("fname")!=null)
			 {
				 if(!rs.getString("fname").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 
			 if(rs.getString("lname")!=null)
			 {
				 if(!rs.getString("lname").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("email")!=null)
			 {
				 if(!rs.getString("email").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("password")!=null)
			 {
				 if(!rs.getString("password").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("number")!=null)
			 {
				 if(!rs.getString("number").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("gender")!=null)
			 {
				 if(!rs.getString("gender").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("date")!=null)
			 {
				 if(!rs.getString("date").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("mobile")!=null)
			 {
				 if(!rs.getString("mobile").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("city")!=null)
			 {
				 if(!rs.getString("city").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("Qualification")!=null)
			 {
				 if(!rs.getString("Qualification").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("TI")!=null)
			 {
				 if(!rs.getString("TI").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("Department")!=null)
			 {
				 if(!rs.getString("Department").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("CN")!=null)
			 {
				 if(!rs.getString("CN").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("CA")!=null)
			 {
				 if(!rs.getString("CA").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("PA")!=null)
			 {
				 if(!rs.getString("PA").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 if(rs.getString("profile")!=null)
			 {
				 if(!rs.getString("profile").equals(""))
				 {
					 System.out.println("welcomw");
					 percentage=percentage+total;	 
					 
				 }	 
				 
			 }
			 
			 
			 percentage=percentage+total;
		 
			 System.out.println("percentage===="+percentage);
				 
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		
		return percentage;
	}

	
	
	
	public static int gettid() {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		int id=0;		
			String sql = "select * from testscore1 order by tid desc limit 0,1";	
		
			try {
				pstm = con.prepareStatement(sql);
				ResultSet rs=pstm.executeQuery();
				
				while(rs.next())
				{
				id=rs.getInt("tid");	
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
			
			return id;
			
		}
		
	
	public static int gettestId(String testname) {
		int tid=0;
		Connection con = makeConnection();
		PreparedStatement pstm = null;		
			String sql = "select * from alltest where testname='"+testname.trim()+"'";	
		
			try {
				pstm = con.prepareStatement(sql);
				ResultSet rs=pstm.executeQuery();
				
				while(rs.next())
				{
				tid=rs.getInt("testid");	
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
			
			return tid;
			
		}
		
	

	
	public static void addtest(int tid1,int id,String testname,String testtime,String testdate,int marks)
	{
		Connection con = makeConnection();
		
		String testdate1="2019-05-31";
		String testtime1="12:01:30";
		PreparedStatement pstm = null;
				
			String sql = "insert into testscore1(uid,tid,testname,testtime,testdate,totalmarks)values(?,?,?,?,?,?)";	
		
			try {
				pstm = con.prepareStatement(sql);
				
				pstm.setInt(1,id);
				pstm.setInt(2,tid1);
				pstm.setString(3,testname);
				pstm.setString(4,testtime);
				pstm.setString(5,testdate);
				pstm.setInt(6,marks);
				
				pstm.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
			
		}

		
		
	

	
	public static void addanswer(int tid,Map<Integer,String> answerlist,List<Integer> marklist) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
			
		List<Integer> qid=new ArrayList<>(answerlist.keySet());
		List<String> answer=new ArrayList<>(answerlist.values());
		
		
		 for(int i=0;i<answer.size();i++)
		 {
		
			String sql = "insert into testscore2(tid,qid,answer,marks)values(?,?,?,?)";	
		
			try {
				pstm = con.prepareStatement(sql);
				
				pstm.setInt(1,tid);
				pstm.setInt(2,qid.get(i));
				pstm.setString(3,answer.get(i));
				pstm.setInt(4,marklist.get(i));
				 	
				pstm.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
			
		 }
		 
		 
		}

		

	
	
	


	/*public static void addmarks(int qid,int marks) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
			
	    String sql = "update testscore2 set marks="+marks+" where qid="+qid+"";	
		
			try {
				pstm = con.prepareStatement(sql);
				
				pstm.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

 
			
		}
		
		}
				

	*/
	

	
	
	/*public static int getid() {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		int uid=0;	
	    String sql = "select uid from testscore order by uid desc limit 0,1";	
		
			try {
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
				uid=rs.getInt("uid");
				
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

 
				
			
		}
			
		return uid;	
		
		}

*/

	
	
	
	public static Map<Integer,String> getans() {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		Map<Integer,String> list=new HashMap<>();
		int uid=0;	
	   // String sql = "select * from java";	
		 String sql = "select * from chiledtest";	
			try {
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
				list.put(rs.getInt("qno"),rs.getString("answer"));
				
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

 
				
			
		}
			
		return list;	
		
		}

		
	

	
	public static ArrayList<ArrayList> gettestdata(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList<ArrayList> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int uid=0;	
	    String sql = "select * from testscore1 where uid="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
			   ArrayList al=new ArrayList();
					
				al.add(rs.getInt("tid"));
				al.add(rs.getString("testname"));
				al.add(rs.getString("testtime"));
				al.add(rs.getString("testdate"));
				al.add(rs.getInt("totalmarks"));
				
				list.add(al);
				 
				}
				
			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
		}
			
			//System.out.println(list.toString());
		return list;	
		
		}

	
	
	
	
	
	public static ArrayList<ArrayList> gettestdata2(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList<ArrayList> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int uid=0;	
	    String sql = "select * from alltest where teacherid="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
			   ArrayList al=new ArrayList();
					
				al.add(rs.getInt("testid"));
				al.add(rs.getString("testname"));
				al.add(rs.getString("Createtime"));
				al.add(rs.getString("Createdate"));
				list.add(al);
				 
				}
				
			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

 
				
			
		}
			
			//System.out.println(list.toString());
	      	return list;	
		
		}
	
	
	
	
	
	
	
	public static ArrayList<ArrayList> gettestlist1(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList<ArrayList> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int uid=0;	
	    String sql = "select * from alltest where teacherid="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
				
					ArrayList al=new ArrayList();
			   	
					al.add(rs.getInt("testid"));
					 
					al.add(rs.getString("testname"));
				 
					list.add(al);
				}
				
			//System.out.println(list);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

 
				
			
		}
			
			//System.out.println(list.toString());
	      	return list;	
		
		}
	
	
	
	
	
	
	public static int gettotalquestion(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList<ArrayList> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int tq=0;	
	    String sql = "select count(qno) from chiledtest where tid="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				
				while (rs.next()) {
			
				tq=rs.getInt(1);
					
				 
				}
				
			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

 
				
			
		}
			
			//System.out.println(tq);
	      	return tq;	
		
		}
	
	
	
	
	

	public static int deletetest(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
        ArrayList<ArrayList> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int flage=0;	
	    String sql = "delete from alltest where testid="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				flage=pstm.executeUpdate();
				
				if(flage!=0)
				{	
				System.out.println("delete sucessfully");
				}
				else
				{
					System.out.println("delete failed");
						
				}	
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

		}
	      	return flage;	
		
		}
	
	

	public static ArrayList<ArrayList> gettestquestion(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
        ArrayList<ArrayList> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int flage=0;	
	    String sql = "select * from chiledtest where tid="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while(rs.next())
				{
				ArrayList al=new ArrayList();
				
				al.add(rs.getInt("qno"));
				al.add(rs.getString("question"));
				al.add(rs.getString("answer"));
				
				list.add(al);
				}
				
				System.out.println(list);
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

		}
	      	return list;	
		
		}
		
	
	public static int deletetestquestion(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
       	int flage=0;	
	    String sql = "delete from chiledtest where qno="+id;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				flage=pstm.executeUpdate();
				
				if(flage!=0)
				{
					System.out.println("sucess");
					
				}
				else
				{
					System.out.println("failed");
					
				}	
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

		}
	      	return flage;	
		
		}
	
	
	
	
	
	
	
	
	
	

	
	
	
	//this method is for retriving graph chart values
	public static ArrayList<Integer> getchartcontent(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;		
		
		ArrayList<Integer> list=new ArrayList<>(); 
		
		for(int i=0;i<=5;i++)
		{	
		
	    String sql = "select sum(marks) from testscore2 where tid=? and marks=?";	
		
			try {
				
				pstm = con.prepareStatement(sql);
				pstm.setInt(1, id);
				pstm.setInt(2, i);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
			
					list.add(rs.getInt(1));
					System.out.println(rs.getInt(1));
					
				}
				
			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 

		
}		
		
		return list;
		//System.out.println(list);
			
		
		}


	
	
	public static ArrayList<String> gettestlist(int id) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;		
		
		ArrayList<String> list=new ArrayList<>(); 
		
		
		
	    String sql = "select testname from alltest where teacherid=?";	
		
			try {
				
				pstm = con.prepareStatement(sql);
				pstm.setInt(1, id);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
			
					list.add(rs.getString(1));
					
				}
				
			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
	
	
		

		
		return list;
		//System.out.println(list);
			
		
		}
	
	
	
	
	public static ArrayList<Integer> getquestionid(int tid) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList<Integer> list=new ArrayList();
		//HashSet<String> list=new HashSet<>();
		int uid=0;	
	    String sql = "select * from testscore2 where tid="+tid;	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
			     list.add(rs.getInt("qid"));
					
				}
				
				//System.out.println(list);
			
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (pstm != null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
		}
			
			//System.out.println(list.toString());
		return list;	
		
		}

	
	
	
	public static ArrayList<Integer> getquestion(ArrayList<Integer> list1) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList list=new ArrayList();
	
		for(int i=0;i<list1.size();i++)
		{
		int uid=0;	
	    String sql = "select * from chiledtest where qno="+list1.get(i);	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
			     list.add(rs.getString("question"));
					
				}
				
				//System.out.println(list);
			
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		}
			
			//System.out.println(list.toString());
		return list;	
		
		}

	
	
	public static ArrayList<Integer> getanswer(ArrayList<Integer> list1,int tid) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList list=new ArrayList();
	
		for(int i=0;i<list1.size();i++)
		{
		int uid=0;	
	    String sql = "select * from chiledtest where qno=? and tid=?";	
		
			try {
				
				pstm = con.prepareStatement(sql);
				pstm.setInt(1,list1.get(i));
				pstm.setInt(2,tid);
			//	pstm.set
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
			     list.add(rs.getString("answer"));
					
				}
				
			//	System.out.println(list);
			
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		}
			
			//System.out.println(list.toString());
		System.out.println("list----"+list);
		return list;	
		
		}

	
	
	
	public static ArrayList<Integer> getuseranswer(ArrayList<Integer> list1,int tid) {
		Connection con = makeConnection();
		PreparedStatement pstm = null;
		
		ArrayList list=new ArrayList();
	
		for(int i=0;i<list1.size();i++)
		{
		int uid=0;	
	    String sql = "select * from testscore2 where tid=? and qid=?";	
		
			try {
				
				pstm = con.prepareStatement(sql);
				
				pstm.setInt(1,tid);
				pstm.setInt(2,list1.get(i));
				
				
				ResultSet rs=pstm.executeQuery();
				
				while (rs.next()) {
					
			     list.add(rs.getString("answer"));
					
				}
				
			//	System.out.println(list);
			
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		}
			
			//System.out.println(list.toString());
		return list;	
		
		}

	
	public static int checkMailForPass(String email) {

		Connection con = makeConnection();
		
		int flage = 0;
		try {
			
			String sql = "select * from teacherregister where email='"+email+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	while(rs.next())
	     	{
	     		
	     	flage=rs.getInt(1);	
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flage;
	}
		
	
	
	public static int checkMailForPass2(String email) {

		Connection con = makeConnection();
		
		int flage = 0;
		try {
			
			String sql = "select * from userregister2 where email='"+email+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	while(rs.next())
	     	{
	     		
	     	flage=rs.getInt(1);	
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flage;
	}
		
	
	public static String returnPassForReset(String email) {

		Connection con = makeConnection();
		
		String pass="";
		try {
			
			String sql = "select * from teacherregister where email='"+email+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	while(rs.next())
	     	{
	     		
	     	pass=rs.getString("password");
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
	}
		
	
	
	
	
	public static String returnPassForReset2(String email) {

		Connection con = makeConnection();
		
		String pass="";
		try {
			
			String sql = "select * from userregister2 where email='"+email+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	while(rs.next())
	     	{
	     		
	     	pass=rs.getString("password");
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
	}
		
	
	
	
	public static int checkPass(String email,String oldpass) {

		Connection con = makeConnection();
		
		int flage=0;
		try {
			
			String sql = "select * from teacherregister where email='"+email+"' and password='"+oldpass+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	while(rs.next())
	     	{
	     		
	     	flage=rs.getInt(1);
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flage;
	}
	
	
	
	public static int checkPass2(String email,String oldpass) {

		Connection con = makeConnection();
		
		int flage=0;
		try {
			
			String sql = "select * from userregister2 where email='"+email+"' and password='"+oldpass+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	while(rs.next())
	     	{
	     		
	     	flage=rs.getInt(1);
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flage;
	}
	
	
	public static int chnagepass(String email,String newpass) {

		Connection con = makeConnection();
		
		int flage=0;
		try {
			
			String sql = "update teacherregister  set password='"+newpass+"' where email='"+email+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	flage= pstm.executeUpdate();
		   
	     
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flage;
	}
	
	
	
	public static int chnagepass2(String email,String newpass) {

		Connection con = makeConnection();
		
		int flage=0;
		try {
			
			String sql = "update userregister2  set password='"+newpass+"' where email='"+email+"'";
			PreparedStatement pstm = con.prepareStatement(sql);
	     	flage= pstm.executeUpdate();
		   
	     
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flage;
	}
	
	
	
	
	public static String gettestname(int tid) {

		Connection con = makeConnection();
		
		String testname="";
		try {
			
			String sql = "select * from alltest where testid="+tid;
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     
	     	while(rs.next())
	     	{
	     		testname=rs.getString("testname");
	     		
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testname;
	}
	
	
	
	public static int getmin(int tid) {

		Connection con = makeConnection();
		
		int min=0;
		try {
			
			String sql = "select * from chiledtest where tid=? limit 1";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1,tid);
	     	ResultSet rs= pstm.executeQuery();
		   
	     
	     	while(rs.next())
	     	{
	     		min=rs.getInt("qno");
	     		
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return min;
	}
	
	
	public static int getmax(int tid) {

		Connection con = makeConnection();
		
		int max=0;
		try {
			
			String sql = "select * from chiledtest where tid=? order by qno desc limit 1";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1,tid);
	     	ResultSet rs= pstm.executeQuery();
		   
	     
	     	while(rs.next())
	     	{
	     		max=rs.getInt("qno");
	     		
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return max;
	}
	
	
	
	
	public static ArrayList<Integer> getuserid(int tid) {

		Connection con = makeConnection();
		
		ArrayList<Integer> al=new ArrayList<>();
		try {
			
			String sql = "select * from testscore1 where tid="+tid;
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     
	     	while(rs.next())
	     	{
	     		al.add(rs.getInt("uid"));
	     		
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;
	}
	
	
	public static ArrayList<ArrayList> getresultinfo(int tid,ArrayList<String> list1) {

		
		Connection con = makeConnection();
		ArrayList<ArrayList> al=new ArrayList<ArrayList>();
		String uname="";
		
		try {
			
			String sql = "select * from testscore1 where tid="+tid;
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     	 int temp=0;
	     
	     	while(rs.next())
	     	{
	     	
	     	ArrayList list=new ArrayList();
	     	list.add(rs.getInt("uid"));
	     	list.add(rs.getInt("tid"));
	     	list.add(rs.getString("testname"));
	     	list.add(rs.getInt("totalmarks"));
	     	
	     	if(temp<=list1.size()-1)
	     	{
	     		list.add(list1.get(temp));
	     		temp++;
	     	}	
	     	
	     	al.add(list);	
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	
	public static String getuname(int uid) {

		Connection con = makeConnection();
		String uname="";
		int max=0;
		try {
			
			String sql = "select * from userregister2 where id="+uid;
			PreparedStatement pstm = con.prepareStatement(sql);
	     	ResultSet rs= pstm.executeQuery();
		   
	     
	     	while(rs.next())
	     	{
	     	uname=rs.getString("fname")+" "+rs.getString("lname");	
	     		
	     	}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return uname;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		/*System.out.println(getuserid(2));
		ArrayList al=new ArrayList();
		al.add("vaibhav");
		al.add("tushar");
		System.out.println(getresultinfo(2,al));*/
		getprofileinfo_teacher(15);
		//getanswer(list1,2);
		/*System.out.println(gettestId("english"));*/
		//getchartcontent(18);
		//deletetest(2);	
	//System.out.println(getTestQuestionCount(2));
	/*ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(10);
	
		getuseranswer(list,11);*/
		//gettestquestion(3);
		//deletetest(4);
	
		//gettestlist1(2);
		
		//gettotalquestion(4);
		
		/*ArrayList<String> list=gettestlist(2);
		System.out.println(list.toString());*/
		
		/*Retrive graph  value
	    getchartcontent(6);
       */
		
		
	/*	Map<Integer, String> map1=new HashMap<Integer,String>();
		
	   map1.put(1,"tushar");
	   map1.put(2,"sagar");
	   map1.put(3,"vaibhav");
	   map1.put(4,"Rahul");
	   map1.put(5,"yogesh");

	
	
	   Map<Integer, String> map2=new HashMap<Integer,String>(map1);

	   System.out.println("data=="+map2);
	   */
	   
	//	addmarks(16,4);
		
		
		/*int id=gettid();
		System.out.println(id);*/
		
	
		
		
	/*//ADD TEST ANSWER	
		int tid=1;
		Map<Integer, String> answerlist=new  HashMap<>();
		
		answerlist.put(13,"1umale");
		answerlist.put(14,"1patil");
		answerlist.put(15,"1sawarkar");
		answerlist.put(16,"1shete");
		
		addanswer(tid,answerlist);
		
		
	*/
		
		
		
		//gettestdata();
		
		/*Map<Integer, String> answerlist=new HashMap<>();
		
		answerlist.put(6,"vaibhav");
		answerlist.put(7,"vaibhav umale");
		answerlist.put(2,"umale");
		answerlist.put(1,"tushar");
		
		addanswer(answerlist);
		*/
		//addmarks(2,3,15);
		
		
	}
	

}
