package bin;

import java.util.ArrayList;

public class Arrays2 {
	
//	Arrrays Exercise 
	   
/*   
 * 		create int array 
 * 		it should have 5 elements in it 
 * 		get sum of 3th and 5th  
 */
		
	public static void main(String[] args) {
	
		
		int[] intArray = new int[6];
		
		intArray[0]=15;
		intArray[1]=4;
		intArray[2]=78;
		intArray[3]=25;						
		intArray[4]=20;
//		122  ->  142
		
//		int total= intArray[2]+ intArray[4];
		
//		System.out.println(total);
		
		System.out.println(intArray[2]+ intArray[4]);
		
		
//		create one more array 10 values and get both arrays length and sum them 
		
		String[] name = new String[10];
		
		name[0]="Omer";
		name[1]="Muhammet";
		name[2]="Jim";
		name[3]="Leslie";
		name[4]="Ali";
		name[5]="Ahmet";
		name[6]="BMW";
		
		System.out.println(name[8]);
		
		
		int name_length = name.length;
		int intArray_lengt = intArray.length;
		
		System.out.println(name_length + intArray_lengt);
		
/*
 * 		in ArrayList we also store multiple values 
 * 
 * 		int string double any variables 
 * 
 * 		Array 				vs 			ArrayList
 * 
 * 		fixed size (int[] i1 = new int[5]) vs you can as much as u can ArrayList<Integer> al1 = new ArrayList<>();
 * 
 * 		to get the value count in array we use length vs  we use size() in arraylist 
 * 
 * 		to store value in the array we write: 
 * 		i1[2] = 12; 						al1.add(4);
 * 		
 * 			System.out.println(i1[2]);			 	System.out.println(al1[4].get());
 * 
 * 		
 */

/*
 * 		primitives  int double boolean char 
 * 	
 * 		Objects( wrapper class ) 
 * 		
 */
		
		Integer i21= 12; 
		
		Boolean  b12= true;
		
		Double dw1= 5.25 ;
		
		String number1 = "15.06";
		
		String number2 = "20";
		
		double d1 = Double.parseDouble(number1);
		
		double d2 = Double.parseDouble(number2);
		
		double total = d1+d2;
		
//		overview                    detail 
		
//		1050						1050.03
		
		
//		fixed size (int[] i1 = new int[5]) vs you can as much as u can ArrayList<Integer> al1 = new ArrayList<>();
		
		String[] stringArray = new String[5];
		 
		stringArray[2] = "strArray";
		
		System.out.println("stringArray[2] : "+stringArray[2]);
		
		ArrayList<Integer> integerArraylist = new ArrayList<>();
		
		integerArraylist.add(0);   // 0th element
		integerArraylist.add(5);	//1th element 
		integerArraylist.add(10);	//2th element 
		integerArraylist.add(20);	//3th element 
		
		System.out.println("integerArray 3th nnumber =  " +integerArraylist.get(1));
		
		
		
		d1= Math.max(d1, d2);
		
		System.out.println("d1 : "+d1);
		
		
		System.out.println("d1 + d2 is : " + total);
		
		//Integer , Double , Float, Boolean	
		
		ArrayList<Integer> al1 = new ArrayList<>();
		
	
		
		
		
		
//		for loop do while loop 
				
				
		
		
		
	}
	
	
}
