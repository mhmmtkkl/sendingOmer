package bin;

import java.util.ArrayList;

public class Loops_class1 {

	
	public static void main(String[] args) {
		
//		
ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1); //0
		numbers.add(2); //1
		numbers.add(8); //2
		numbers.add(4); //3
		numbers.add(5); //4
		
		int total =0;
//						if i  less then 4 , if i equal to 4 then stop executing  the for loop
		for(int i=0 ; i<numbers.size() ; i++) {
			
//	      when i =0    0     +   1     
//		  when i=1    	1	 +	2
//        when i=2      3     +   8
//		  when i=3      11    +    4
//		  when i=4     15	      +    5
			 total = total + numbers.get(i);
		
			 System.out.println("inside of the for loop " + total);
			 System.out.println("i =  " + i ) ;
		}
		
		 System.out.println("outside --->" + total);
		
	
	
/*
 * What is wrapper class
 * 		
 * 		Wrapper class is an object on top off the variables 
 * 		
 * 		In my script it help me to change from strign to integer or double 	
 * 
 * 	How do you change from String to double or integer 
 * 
 * 		I have a String str= "1000";
 * 
 * 		double dbl = Double.parseDouble(str);
 * 
 * 	Why do you changing from String to double 
 * 
 * 		Because if I need to sum or divide .... in my website 
 * 
 * 		I cannot do it with string so I need an Integer or double this is why I am using parseIntger or parseDouble 
 * 
 * 				
 */	
	
/*
 * While loop 
 * 
 * for each loop 
 * 
 * do while loop 
 * 
 * infinite loop 	
 */
	
	
/*
 * What loop those? 
 * 		
 * 		Loop is doing some execution in java until some condition is true 
 * 	
 */
	
	
//	while loop 
	
	int i =0;
	
	int y = 1;
	
//	while this condition is true execute the this script ---> { code is here } 
	while(i<10) {
		
		y= y*3;
		System.out.println("y is = "+ y);
		
		i++;
		
	}
	
//	for loop : while loop is 3 line of code which is int i =0 and  i<10 and i++ ||| but we can write this code in one line 
//				
//				with for loop 
	
	for(int i2 = 0 ; i2 <10 ; i2++) {
		
		System.out.println("i2 is here = "+ i2);
		
	}
	
	 
	
	
	ArrayList<String> name = new ArrayList<>();
	
	name.add("Sema");
	name.add("Ayse");
	name.add("Huseyin");
	name.add("Omer");
	name.add("Melih");
	name.add("Kerim");
	name.add("John");
	
//	previously this is how we were printing the values in the arraylist 
//	System.out.println(name.get(2));
//	System.out.println(name.get(3));
	
	for(int i3=0 ; i3<name.size() ; i3++) {
		
		System.out.println("my name array has these names : "+name.get(i3));
	
	}
	
//	countries or states arraylist and print arraylist like 

//	Str="Muhammet Ali" have been in Ohio 
//	Str="Muhammet Ali" have been in New York 
	
	ArrayList<String> states = new ArrayList<>();
	
	states.add("New York");
	states.add("Ohio");
	states.add("New Jersey");
	states.add("Georgia");
	states.add("North Caroline");
	states.add("Nashville");
	states.add("Illinois");
	states.add("Kentucky");
	
	for(int a = 0 ; a<states.size() ; a++) {
		
		String myName= "Muhammet Ali";
		System.out.println(myName + " have been in "+ states.get(a));
	
	
	}
	
//	write an arraylist has a values from 1 to 10 and get the total even and odd numbers total 
	
	int totalEven = 0;
	int totalOdd = 0;
	
	ArrayList<Integer> numberfrom0to10 = new ArrayList<>();
	
	
	numberfrom0to10.add(1);
	numberfrom0to10.add(2);
	numberfrom0to10.add(3);
	numberfrom0to10.add(4);
	numberfrom0to10.add(5);
	numberfrom0to10.add(6);
	numberfrom0to10.add(7);
	numberfrom0to10.add(8);
	numberfrom0to10.add(9);
	numberfrom0to10.add(10);
	
	int counter2 = 0;
	
	for(int counter = 0 ; counter<numberfrom0to10.size() ; counter =counter+2) {
		
		totalEven = totalEven + numberfrom0to10.get(counter+1 );
		totalOdd = totalOdd + numberfrom0to10.get(counter);
		 
		System.out.println(numberfrom0to10.get(counter+1 ));
		System.out.println(numberfrom0to10.get(counter));
		  
		
		counter2 = counter2 + 2 ;
	}
	
	System.out.println("totalEven numbers are "+totalEven);
	
	System.out.println("totalOdd numbers are "+totalOdd);
	
	
//	Today we will study Do while loop and will have an exercises 
	
//	for loop : we give start and end point and it will execute the script until it match with end point 
	
//	for(int i =0 ; i< 10 ; i++){}
	
//	today we will learn do while loop 
	
	int num = 0 ;
	
	do{

		System.out.println("num is here : "	+ num);

		num++;
		
	}while(	num<10); 
		
	
ArrayList<String> countries = new ArrayList<>();
	
	countries.add("United States");
	countries.add("Turkey");
	countries.add("Georgia");
	countries.add("South Aftica");
	countries.add("Phillipines");
	countries.add("China");
	countries.add("South Korea");
	countries.add("Germany");
	
	int counting = 0;
	
	do {
		
		String MyName = "Muhammet Ali";
		System.out.println(MyName + " have been in these countries "+ countries.get(counting));
		
		counting++;
		
	}while(counting<countries.size());
	
	
	
	
//	Nested for loop 

	for(int j = 0 ; j< 10 ; j++) {
		
		for(int k =10; k>j ; k--) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	
//	******
//	*****
//	****
//	***
//	**
//	*
	
	 int number = 7;
     int count = number - 1;
     
     for (int k = 1; k <= number; k++) {
         for (int ul = 1; ul <= count; ul++)
             System.out.print(" ");
         count--;
         for (int pl = 1; pl <= 2 * k - 1; pl++)
             System.out.print("*");
         System.out.println();

     }
	
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//*************
     
     number =7;
     
     for(int kl = 0 ; kl<number ; kl++ ) {
    	 
    	 if(kl==0 || kl==6) {
    		 
    		 System.out.print("*");
    	 }
    	 System.out.println();
     	
    	 	if(kl>0 && kl<6) {
    	 		
    	 		for(int jk = 0 ;jk < number ; jk++) {
        	 		
    	 			if(jk==0 || jk==6) {
    	 				System.out.print("*");
    	 			}else if(jk>0 || jk<6) {
    	 					System.out.print(" ");
    	 			}
    	 				
    	 		}
    	 		System.out.println();
    	 		
    	 	}	
    	 	
     }
	
//	*******
//	*	  *
//	*	  *
//	*	  *
//	*******
	

//	nested for loop : for loop inside the for loop 
     
//      multi dimensinol array

/*
 *  We are using multi dimensional array for big data like database or excel sheet 
 *  	it has a row and column so to get those data we need multi dimensional array 
 *  	
 *  	Note: We are not using this patter that much but it is good to know about it at least get the idea of multi dimensional
 *  			array
 *       
 */
     
     String[][] nameForEachLocation = new String[3][7];
     
     nameForEachLocation[0][0]="Manhattan";
     nameForEachLocation[0][1]="John";
     nameForEachLocation[0][2]="Kerry";
     nameForEachLocation[0][3]="Omar";
     nameForEachLocation[0][4]="Nic";
     nameForEachLocation[0][5]="Lemar";
     
     nameForEachLocation[1][0]="Lodi";
     nameForEachLocation[1][1]="Emily";
     nameForEachLocation[1][2]="Kim";
     nameForEachLocation[1][3]="Tim";
     nameForEachLocation[1][4]="Josh";
 
     nameForEachLocation[2][0]="Paterson";
     nameForEachLocation[2][1]="Muhammet";
     nameForEachLocation[2][2]="Ahmet";
     nameForEachLocation[2][3]="Ketty";
     nameForEachLocation[2][4]="Steven";
     nameForEachLocation[2][5]="Pittsy";	
     nameForEachLocation[2][6]="Terry";	
 	
	for(int row = 0 ; row<nameForEachLocation.length; row++ ) {
		
		for(int column =0 ; column<nameForEachLocation[row].length;column++ ) {
			
			System.out.print (nameForEachLocation[row][column] +" ");
		}
		System.out.println();
		
	}
	

	
	
	
	
	
	
	
	
	
	 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
