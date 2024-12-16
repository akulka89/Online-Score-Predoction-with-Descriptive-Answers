package com.algorithm;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.DAOConnection.DBConnnection;

public class TfidfForStudent {

	public static List<Integer> getans(Map<Integer, String> answerlist) throws FileNotFoundException
	{
		
		
		/*Map<Integer, String> answerlist=new HashMap<>();
		answerlist.put(1, "Platform independent practically means “write once run anywhere”. Java is called so because of its byte codes which can run on any system irrespective of its underlying operating system.");
		answerlist.put(2, "Java is not 100% Object-oriented because it makes use of eight primitive datatypes such as boolean, byte, char, int, float, double, long, short which are not objects.");
		answerlist.put(4, "hiii this is tushar");
		answerlist.put(9, "hiii this is pooja");
		answerlist.put(10, "hiii this is amol");*/
		
		/*Collection<String> value1=answerlist.values();
		
		List<String> answer=new ArrayList<String>(value1);*/
		
		List<Integer> marklist=mainfunction1(answerlist);
		
		
		//System.out.println("total marks==="+marks);
		return marklist;
		
		
	}
	
	
	
	public static List<String> getans1(List<String> answer )
	{
		
		
	
		
		
		return answer;
		
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
    
/*    public static double mainfunction(List<String> answer)
    {
    	
    }
*/    
    
    public static List<Integer> mainfunction1(Map<Integer, String> answerlist) throws FileNotFoundException 
    {
    	double tfidf2=0.0;
    	int marks=0;
    	int marks1=0;
    	//List<String> answer=getans1(List<String> answer);
    	
    	//hash map set for marks and question id
    	
    	List<Integer> marklist=new ArrayList<>();
    	
    	
        Collection<String> value1=answerlist.values();
        Collection<Integer> value2=answerlist.keySet();
		
		List<String> answer=new ArrayList<String>(value1);
		List<Integer> questionid=new ArrayList<Integer>(value2);
	
    	
    	List<List<Double>> frequency=new ArrayList<>();
    	List<String> doc1 = null;
        
    	int i=0;
        
    	for(String s:answer)
    	{
    		
    		Integer questionid1=questionid.get(i);
    		 i++;
    		
    		doc1=extract(s);
    		
        List<String> doc2 = Arrays.asList();
        List<String> doc3 = Arrays.asList();
        
        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3);

        tfidf calculator = new tfidf();
        
        
        for(String s1:doc1)
        {
        	tfidf2 =tfidf2+ calculator.tfIdf(doc1, documents, s1);	
        
        }
        //NearestNumber.mainfuncation();
        
        
       
        //System.out.println(" student tfidf="+tfidf2);
        
        
        marks=NearestNumber.mainfuncation(tfidf2,questionid1);
        //marks1=marks1+marks;
        //System.out.println("tfidf==="+marks);
 
      // DBConnnection.addmarks(questionid1,marks);
        
        marklist.add(marks);
        
       // marks=0;
        
        tfidf2=0.0;
       
       
        
    	}
    	
	
    	
    return marklist;
    	
    }
    
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
   
    	//getans();
    	
    	
        
    }

	
	
	
	
	
}
