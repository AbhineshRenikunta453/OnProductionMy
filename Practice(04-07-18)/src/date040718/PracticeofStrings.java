package date040718;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeofStrings {
	
	
	//example for String polyndrome
	@SuppressWarnings("unlikely-arg-type")
	public boolean checkPolyndrome(String name) {
		if(name==null)
			return false;
		else {
			StringBuffer sb=new StringBuffer(name);
			String next=new String(sb.reverse());
			return next.equalsIgnoreCase(name);
		}
		
		
		
	}
	
	//to replace particular string
	public String replaceString(String s1,String s2) {
		System.out.println(s1.trim().substring(0, 3));
		return s1.replaceAll(" ", s2);
		
		
	}
	
	//using string in switch case introduced in java 1.7
	//switch case internally uses equals method
	
	public String getAction(String action) {
		
		switch(action) {
		case "applnextstg":return "stg pending at  "+"  applnextstg";
		case "applstages":return "stg pending at  "+" applstages";
		case "wflows":return "stg pending at "+" wflows";
		case "multiputups":return "stg pending at "+" multiputups";
		}
		
		return "no match found";
		
	}
	
	
	//in password storing always chararray used why becuase for security
	//after completion of work with password it available as string
	//in jvm till garbage collector collects it but with char array after
	//completion use of password we can set it to null
	public char[] getCharArrayFromString(String sample) {
		
		System.out.println(sample);
		char[] chararray=sample.toCharArray();
		sample=null;
		if(sample!=null)
		System.out.println(sample);
//		chararray=null;
		if(chararray!=null)
			System.out.println(Arrays.toString(chararray));
		return chararray;
		
		
	}
	
	
	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		String name=s.nextLine();*/
		PracticeofStrings ps=new PracticeofStrings();
		/*boolean status=ps.checkPolyndrome(name);
		if(status==true) {
			System.out.println("Given String is a polyndrome");
		}
		else {
			System.out.println("Given String is not a polyndrome");
		}
		String result=ps.replaceString("  Abhinesh   ", "@");
		System.out.println(result);
		
		String action=ps.getAction("found");
		System.out.println(action);
		char[] chararray=ps.getCharArrayFromString("Abhinesh");
		System.out.println(Arrays.toString(chararray));
		String s1=new String("HAI");
		System.out.println(s1.hashCode());
		String s2=new String("HAI");
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);*/
		String s1="HAI";
		System.out.println(s1.hashCode());
		String s2="HAI";
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);

	}
	


}
