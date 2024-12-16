package com.controller;

import java.io.FileNotFoundException;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.itextpdf.text.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import com.model.Severity;

import java.io.FileOutputStream;
import java.util.ArrayList;

import com.DAOConnection.DBConnnection;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdfHelloWorld
{
   public static void main(String[] args)
   {
	   
	   int tid=2;
	   ArrayList<Integer> list=DBConnnection.getquestionid(tid);

	   ArrayList question=DBConnnection.getquestion(list);
	   ArrayList userans=DBConnnection.getuseranswer(list,tid);

	   ArrayList expectedans=DBConnnection.getanswer(list,2);


	   Document document = new Document();
		try
		{
			String pred1="tushar";
			
			String prediction="abc";
			 String ect2 ="pqr";
			 String fnn ="vai";
			 String lnn ="sagar";
			 
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:/Users/skasar/Desktop/pdf/abc2.pdf"));
			document.open();

			
			Font fontColour_style =  FontFactory.getFont(FontFactory.TIMES, 18f, Font.BOLD, BaseColor.BLACK);          		
			Paragraph p=new Paragraph("Test Question And Answer PDF:",fontColour_style);
			p.setAlignment(Element.ALIGN_CENTER);
			document.add(p);
			
			Font fontColour_style1 =  FontFactory.getFont(FontFactory.TIMES, 14f, Font.BOLD, BaseColor.RED);          		
			Paragraph p1=new Paragraph("Your Test:",fontColour_style1);
			p1.setAlignment(Element.ALIGN_LEFT);
			document.add(p1);
			
			
			PdfPTable table = new PdfPTable(1);
			
			
			
			table.setWidthPercentage(100);
			//Width 100%
			table.setSpacingBefore(10f); //Space before table
			table.setSpacingAfter(10f); //Space after table
			
	   
			//Set Column widths
			float[] columnWidths = {1f};
			table.setWidths(columnWidths);

			
			
		
			PdfPCell cell1 = new PdfPCell(new Paragraph("Question:  "+question.get(0)+"\n\nYourAns:"+userans.get(0)+"\n\nExpectedAns:"+expectedans.get(0)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_LEFT);


			PdfPCell cell2 = new PdfPCell(new Paragraph("Question:  "+question.get(1)+"\n\nYourAns:"+userans.get(1)+"\n\nExpectedAns:"+expectedans.get(1)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			
			PdfPCell cell3 = new PdfPCell(new Paragraph("Question:  "+question.get(2)+"\n\nYourAns:"+userans.get(2)+"\n\nExpectedAns:"+expectedans.get(2)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			
			PdfPCell cell4 = new PdfPCell(new Paragraph("Question:  "+question.get(3)+"\n\nYourAns:"+userans.get(3)+"\n\nExpectedAns:"+expectedans.get(3)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			PdfPCell cell5 = new PdfPCell(new Paragraph("Question:  "+question.get(4)+"\n\nYourAns:"+userans.get(4)+"\n\nExpectedAns:"+expectedans.get(4)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			
			PdfPCell cell6 = new PdfPCell(new Paragraph("Question:  "+question.get(5)+"\n\nYourAns:"+userans.get(5)+"\n\nExpectedAns:"+expectedans.get(5)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			
			PdfPCell cell7 = new PdfPCell(new Paragraph("Question:  "+question.get(6)+"\n\nYourAns:"+userans.get(6)+"\n\nExpectedAns:"+expectedans.get(6)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			
			PdfPCell cell8 = new PdfPCell(new Paragraph("Question:  "+question.get(7)+"\n\nYourAns:"+userans.get(7)+"\n\nExpectedAns:"+expectedans.get(7)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			PdfPCell cell9 = new PdfPCell(new Paragraph("Question:  "+question.get(8)+"\n\nYourAns:"+userans.get(8)+"\n\nExpectedAns:"+expectedans.get(8)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			PdfPCell cel20 = new PdfPCell(new Paragraph("Question:  "+question.get(9)+"\n\nYourAns:"+userans.get(9)+"\n\nExpectedAns:"+expectedans.get(9)));
			cell1.setBorderColor(BaseColor.BLACK);
			cell1.setPaddingLeft(10);
			cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			table.addCell(cell1);
			table.addCell(cell2);
			table.addCell(cell3);
			table.addCell(cell4);
			table.addCell(cell5);
			table.addCell(cell6);
			table.addCell(cell7);
			table.addCell(cell8);
			table.addCell(cell9);
			table.addCell(cel20);
			
			
			document.add(table);

			document.close();
			writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		 String ect2 ="ado";
		
			
		
   }
}