package com.algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.DAOConnection.DBConnnection;

public class tfidf {
	
	
	
	public static Map<Integer,String> getans()
	{
		
		Map<Integer,String> list=DBConnnection.getans();
		String question1="1 Platform independent practically means “write once run anywhere”. Java is called so because of its byte codes which can run on any system irrespective of its underlying operating system.";
		String question2="2 Java is not 100% Object-oriented because it makes use of eight primitive datatypes such as boolean, byte, char, int, float, double, long, short which are not objects.";
		String question3="3 Wrapper classes converts the java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class. Refer to the below image which displays different primitive type, wrapper class and constructor argument. ";
		String question4="4 In Java, runtime polymorphism or dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than at compile-time. In this process, an overridden method is called through the reference variable of a superclass. Let’s take a look at the example below to understand it better.";
		String question5="5 Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.== or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects.";
		String question6="6 You cannot override a private or static method in Java. If you create a similar method with same return type and same method arguments in child class then it will hide the super class method; this is known as method hiding. Similarly, you cannot override a private method in sub class because it’s not accessible there. What you can do is create another private method with the same name in the child class. Let’s take a look at the example below to understand it better.";
		String question7="7 If a child class inherits the property from multiple classes is known as multiple inheritance. Java does not allow to extend multiple classes. The problem with multiple inheritance is that if multiple parent classes have a same method name, then at runtime it becomes difficult for the compiler to decide which method to execute from the child class. Therefore, Java doesn’t support multiple inheritance. The problem is commonly referred as Diamond Problem.";
		String question8="8 Association is a relationship where all object have their own lifecycle and there is no owner. Let’s take an example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers but there is no ownership between the objects and both have their own lifecycle. These relationship can be one to one, One to many, many to one and many to many.";
		String question9="9 Aggregation is a specialized form of Association where all object have their own lifecycle but there is ownership and child object can not belongs to another parent object. Let’s take an example of Department and teacher. A single teacher can not belongs to multiple departments, but if we delete the department teacher object will not destroy.";
		String question10="10 Composition is again specialized form of Aggregation and we can call this as a “death” relationship. It is a strong type of Aggregation. Child object dose not have their lifecycle and if parent object deletes all child object will also be deleted. Let’s take again an example of relationship between House and rooms. House can contain multiple rooms there is no independent life of room and any room can not belongs to two different house if we delete the house room will automatically delete. In case you are facing any challenges with these java interview questions, please comment your problems in the section below. Apart from this Java Interview Questions Blog, if you want to get trained from professionals on this technology, you can opt for a structured training from edureka!";
		
		List<String> answer=new ArrayList<String>();
		answer.add(question1);
		answer.add(question2);
		answer.add(question3);
		answer.add(question4);
		answer.add(question5);
		answer.add(question6);
		answer.add(question7);
		answer.add(question8);
		answer.add(question9);
		answer.add(question10);
		
		return list;
		
	}
	
	
//this method is for find total frequency of the question	******************************************************************************
	
	public static List<String> extract(String str)
	{	
	
	List<String> doc4=new ArrayList<String>();	
	String ans2[]=str.split(" ");
		for(int i=0;i<ans2.length;i++)
		{
			doc4.add(ans2[i]);	
		}
		
		return doc4;	
	}
	
	
	
	
	//this method is used for calculate term frequency***************************************************************************************
	
    public double tf(List<String> doc, String term) {
        double result = 0;
        for (String word : doc) {
            if (term.equalsIgnoreCase(word))
                result++;
        }
        return result / doc.size();
    }


	//this method is used for calculate inverse term frequency************************************************************************************
    
    
    public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        return Math.log(docs.size() / n);
    }

   
    //this method is used for calculate TFIDE ****************************************************************************************************
    
    public double tfIdf(List<String> doc, List<List<String>> docs, String term) {
        return tf(doc, term) * idf(docs, term);

    }

    //main method**********************************************************************************************************************************
    
    public static void main(String[] args) {
    	
    	Map<Integer,String> list=getans();
    	
    	
    	List<String> answer=new ArrayList<>(list.values());
    	List<Integer> questionid=new ArrayList<>(list.keySet());
        	
 
    	//this is for generate arff file and insert attribute code into file
    	FileOperation.AppendToFile1();
    	List<List<Double>> frequency=new ArrayList<>();
    	List<String> doc1 = null;
        int i=1;
        int flage=0;
    	for(String s:answer)
    	{
    		int qid=questionid.get(flage);
    		flage++;
    		
    		doc1=extract(s);
        List<String> doc2 = Arrays.asList();
        List<String> doc3 = Arrays.asList();
        
        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3);

        tfidf calculator = new tfidf();
        
        double tfidf2=0.0;
        for(String s1:doc1)
        {
        	tfidf2 =tfidf2+ calculator.tfIdf(doc1, documents, s1);	
        
        }
        System.out.println(tfidf2);
        
        //this method is used to divide total frequency into five parts*******************************************************************
        
        List<Double> dfrequency=frequencydevide.dividef2(tfidf2);
        //this method is used to add question id,divided frequency and marks into arff file********************************************** 
        FileOperation.AppendToFile(dfrequency,qid,1);
        FileOperation.AppendToFile3(dfrequency,qid);
       
        System.out.println(dfrequency);
       
       
        
    	}
    	
        
    }

}
