package com.algorithm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class FileOperation {

	
	public static void AppendToFile(List<Double> dfrequency, int qID,int count) {

		File file = new File("E:\\vaibhav\\testTFIDF.arff");
		BufferedWriter bw = null;
		FileWriter fw = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// true = append file
		/*String header="@relation classification-of-Question \n"
				+ "@attribute qid numeric \n"
				+ "@attribute frequency numeric \n"
				
				+ "@data \n";*/
		
		
		
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
           // bw.append(header);
            
            for(Double f:dfrequency)	
            {
            	
            	
			bw.append(" "+String.valueOf(qID)+","+String.valueOf(f)+","+String.valueOf(count++));
			bw.append("\n");
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}


	public static void AppendToFile3(List<Double> dfrequency, int qID) {

		File file = new File("E:\\vaibhav\\Test\\TestTFIDF.arff");
		BufferedWriter bw = null;
		FileWriter fw = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// true = append file
		/*String header="@relation classification-of-Question \n"
				+ "@attribute qid numeric \n"
				+ "@attribute frequency numeric \n"
				
				+ "@data \n";*/
		
		
		
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
           // bw.append(header);
            
            for(Double f:dfrequency)	
            {
            	
            	
			bw.append(" "+String.valueOf(qID)+","+String.valueOf(f));
			bw.append("\n");
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}

	
	
	


	
	

	
	
	public static void AppendToFile1() {

		File file = new File("E:\\vaibhav\\testTFIDF.arff");
		BufferedWriter bw = null;
		FileWriter fw = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// true = append file
		String header="@relation classification-of-Question \n"
				+ "@attribute qid numeric \n"
				+ "@attribute frequency numeric \n"
				
				+ "@data \n";
		
		
		
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
            bw.append(header);
            
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}





	
}









