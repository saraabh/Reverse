package sampleproject;

import java.util.Scanner;

public class AlphabetOrNot
{public static void main (String[] args) {
	
	char[] letters= { 'g','o','d',' ','y','p','p','a','h',' ','a',' ', 'e','v','a','h',' ','I'};
	
			printReverse(letters,18);
			
}
 
   public static void printReverse(char[] letters, int size) {
	   for (int i= size-1; i>=0; i--)
	   {
		   System.out.print(letters[i]);
		   
	   }

}

}
