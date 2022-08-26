//program is to find how many word is present

import java.util.Scanner;
public class Countword {                        //class Countword declaration

	public static void main(String... args) {           //Main method
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Sentence: ");       //Take output from user
         String str=sc.nextLine();
        countWord(str);                                        //method call
	}
	
	
	
	static void countWord(String str)               //method define
	{
		 String[] val=str.split(" ");                  //split the sentence into words
         int count=0;
         for(int i=0;i<val.length;i++)
         {
        	 count++;                                   //count the words
        	 
         }
         System.out.println("The total words present is: "+count);      //print total words present in a sentence
	}

}
