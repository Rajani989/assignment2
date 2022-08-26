//program to find the middle character from the sentence


import java.util.Scanner;
public class Findmiddle {                       //Class Findmiddle declaration

	public static void main(String... args) {                //Main method
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a sentence: ");             //Take input from the user
      String str=sc.nextLine();
      middleCharacter(str);                                //method call
	}

	static void middleCharacter(String str)               //method define
	{
	   String[] val=str.split(" ");                   //split the sentence
	   int middle=0;
	    middle=(0+val.length)/2;                    //find middle value of sentence
	     System.out.println(val[middle]);              //print middle value
	   
	
	}
	
	
}
