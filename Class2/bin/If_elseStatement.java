package bin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class If_elseStatement {

	
	public static void main(String[] args) {
		
		   
/*
 *  IF - IF_ELSE - IF _ IFELSE _ ELSE STATEMENT 
 * 
 * 		We are using if statement to make sure array is containing specific String or integer in it.
 */
		
		
/*
 * 		if I go to java course I could get a good job 
 * 			else I will be working as delivery guy all my life 
 * 
 * 		if(gotojavacourse.equals(true)){
 * 		
 * 			System.out.println("I could get good job");
 *      }else{
 *      	
 *      	System.out.println("I will be working as delivery guy all my life ");
 *      	 }
 * 
 */
	
//		boolean DidAhmetFinishedTheJavaCourse = false;
//		
//		if(DidAhmetFinishedTheJavaCourse) {
//			
//			System.out.println("I could get good job");
//	
//		}else {
//			
//			System.out.println("I will be working as delivery guy all my life ");
//			
//		}
//		
		
//		&& --> and  || --> or operators in java
		
		int Num1 = 100;
		
		if(Num1>=0 && Num1<=30) {
			
			System.out.println("Num1 between 0 and 10");
			
		}else if(Num1>30 && Num1<=60) {
			
			System.out.println("Num1 between 31 and 60");
			
		}else if(Num1>60 && Num1<=100) {
			
			System.out.println("Num1 between 61 and 100");
			
		}else {
			
			System.out.println("Num1 is not between 0 and 100");
		}
		
		
//		break and continue in if else statement
		
		for(int i = 0 ; i<100 ; i++) {
			
			if(i==70) {
				
				continue;
			}else {
				
				System.out.println(i);
			}
		}
		
		
		
		
//		if - else if - else statement with String     ( Equals ignore case )
		
		String myName = "NAHIT";
		
		ArrayList<String> AllNames = new ArrayList<>();
		
		AllNames.add("Zeki");
		AllNames.add("Omer");
		AllNames.add("Ahmet");
		AllNames.add("Nahit");
		AllNames.add("Muhammet Ali");
		AllNames.add("Zahit");
		
		String lastPrint = null;
		
		for ( int i = 0 ; i < AllNames.size() ; i++ ) {
			
			
			String name_from_ArrayList = AllNames.get(i);
			
				if(name_from_ArrayList.equals(myName)) {
				
					lastPrint = "Your name is here: " + myName;
				
//							we dont want to write System.out.println here because it is printing every time we just need its equal 
//								or containing or not equal so thats why we will write it in the end 
//								System.out.println("Your name is here: " + myName);
			 
					break;
					
				}else if(name_from_ArrayList.contains(myName)) {
				
					lastPrint = "Your name contains here: "+ myName;
				
//					System.out.println( "Your name contains here: "+ myName); 
					
					break;
					
				}else if(!name_from_ArrayList.equals(myName)) {
						
					lastPrint = "Your name: "+ myName +" is not in the list and list is here: "+ AllNames + i;
				
//				System.out.println("Your name: "+ myName +" is not in the list and list is here: "+ AllNames); 
				
			}
			
			
		}
		
		System.out.println(lastPrint);
		
		
//		Random class : it is going to create a random number for us 
		
		Random rnd = new Random();
		
		int randomNumber = rnd.nextInt(1000);
		
		System.out.println();
		
		System.out.println("Your random number is here: " + randomNumber);
		
//		Scanner class : This will ask us the what will be the next number 
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("pls write your num here");
		
		int nextnum= scn.nextInt();
		
		System.out.println("your num is here "+ nextnum);
		
		
		
		
/*
 * 		Create one random number 
 * 
 * 		Create min and max numbers
 * 
 * 		for loop ve max number 5 - 10 whatever
 * 
 * 		Scanner class next int 
 * 
 * 		if our next int == to random number print you got the number 
 * 
 * 		if our next int > to random number print number is big so create less number 
 * 
 * 		of our next int < to random number print Your number is pretty small 
 * 		
 * 		if i == 5 print sorry dude yyou didnt get it this time 
 */
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Random rand = new Random();
		
		int randomNumebr2 = rand.nextInt(1000);
		
		int min = 0 ; 
		
		int max =1000;
		
		for(int i=1 ; i<= 10 ; i++ ) {
			  
			Scanner scn2 = new Scanner(System.in);
		  
			System.out.println("Please enter your guess number range is between " +min + " and " + max );
			
			int ourGuess = scn2.nextInt();
			
			
			if(i==10 ) {
				
				System.out.println("Sorry bro u didnt get it " + randomNumebr2);
				
				break;
				
			}else if(ourGuess==randomNumebr2) {
				
				System.out.println("You got it bro ");
			break;
			}else if(ourGuess>randomNumebr2) {
				
				System.out.println("Your number is bigger then a number guess smaller numbers");
				
				max = ourGuess;
				
			}else if(ourGuess<randomNumebr2) {
				
				System.out.println("Your number is smaller then a number guess smaller numbers");
				
				min = ourGuess;
			
			
			} 
			
			System.out.println("i is equal to " + i  + "  random number is " + randomNumebr2);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
/*
 * 		Arraylist get add 
 * 
 * 		For loop - Print arraylist 
 * 
 * 		For loop and if - Is your string is in the arraylist 
 * 
 * 		Random class and scanner class 
 * 
 * 		And homework
 * 		
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
