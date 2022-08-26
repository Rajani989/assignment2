//program is to find the total numbers of vowels.

import java.util.Scanner;
public class Findvowels {                //class name Findvowels

	public static void main(String... args) {                 //Main method
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a sentence: ");                
         String str=sc.nextLine();                //Take input from the user
          countVowel(str);    	                        //method call
	
	
	}
	
	static void countVowel(String str)                             //method define
	{
		 int count=0;
         for(int i=0;i<str.length();i++)                               //use loop to access the character       
         {
        	 if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
        	 {                                     //check the condition if any vowels(a,e,i,o,u) is present then incerement the count value
        		 count=count+1;
        		
        	 }
         }
         System.out.println("The number of vowels : "+count);            //print the total number of vowels present.

	}
	

}
