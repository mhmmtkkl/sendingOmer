package bin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_FirstClass {

	public static void main(String[] args) {
		
// Differences between array and ArrayList
		
//		1) Array is a fixed size and arraylist re-size it self 
		
		String[] name = new String[5];
		
		name[0] = "Jim";
		name[1] = "Gerard";
		name[2] = "Fernando";
		name[3] = "David";
		name[4] = "Jim";
		

		
		
//		We can not store after this point because max 5 values we are able to store
//		name[5] = "Gerard";
//		name[6] = "Fernando";
//		name[7] = "David";
		
//		printing from array
//		System.out.println(name[2]);
		
		
//		How to sort array
		int[] sorted= new int[5];
		
		sorted[0] = 1;
		sorted[1] = 2;
		sorted[2] = 3;
		sorted[3] = 4;
		sorted[4] = 0;
		
		Arrays.sort(sorted);
		
		System.out.println(sorted[2]);
		
//		Starting arrayList
		ArrayList<String> name_List = new ArrayList<>();
		
		name_List.add("Jim");     	//0
		name_List.add("Gerard");	//1
		name_List.add("Fernando");  //2
		name_List.add("David");		//3
		name_List.add("Sergio");	//4
		name_List.add("Jim");		//5
		name_List.add("Gerard");	//6
		name_List.add("Fernando ");	//7
		name_List.add("David");		//8
		name_List.add("Sergio");	//9
		
//		printing from arrayList
		System.out.println(name_List.get(7) + " went to miami last week");
		
		System.out.println(name_List.get(7) + " went to miami last week");
		
//		how to sort arrayList
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(8);
		numbers.add(4);  
		numbers.add(5);
		
		System.out.println("numbers array before sort " + numbers);
		
		Collections.sort(numbers);
		
		System.out.println("numbers array after sort " + numbers);
		
//		System.out.println("total numbers of the numbersArray is : "+numbers.get(0) + numbers.get(1) + numbers.get(2));
		
		
		int total = numbers.get(0) + numbers.get(1) + numbers.get(2)+ numbers.get(3)+ numbers.get(4);
		
		System.out.println("sum of the numbers_array is : "+total);
		
		// change 4th value in numbersArrayList
		
		numbers.set(3, 6);
		
		int total2 = numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3)+ numbers.get(4);
		
		System.out.println("sum of the numbers_array is : "+total2);
		
		System.out.println(numbers);
		
		numbers.remove(3);
		
		System.out.println(numbers);
		
		String address ="290 Garibaldi avenue 07075 NJ";
		
//		adding end of the string 
		
		
		System.out.println(address.concat(" not assigning to address"));
		
		System.out.println(address);
		
		address = address.concat(" assigning to address");
		
		System.out.println(address);
		 
		
		/*
		 *  array how to declere it 
		 *  	how to store value in the array 
		 *  	how to get value from the array 
		 *  	how to use it  + - / * 
		 *  	sorting the array
		 *  
		 *  	
		 *  arrayList how to declere it 
		 *  	how to store value in the array  ( .add )
		 *  	how to get value from the array  ( . get )	
		 *  	how to use it  + - / *    
		 *  	Sorting the arrayList
		 *  	remove from arraylist 
		 *  
		 */
		
		
 
		
		
		
		
		
		
		
	}
}
