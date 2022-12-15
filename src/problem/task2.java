package problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 //Write a program which can store List of Integer values and print all the values using for iterator
		
		 List <Integer> list = new ArrayList<Integer>();
		 list.add(200);
		 list.add(300);
		 list.add(500);
		 list.add(200);
		 list.add(200);
		 System.out.println(list);
	 
		 
		 
		     
		 
		 Iterator<Integer> itr = list.iterator();
		 System.out.println("printing value using iterator");
		  while (itr.hasNext()) {
	            //  Moving cursor to next element
	            
			  int i = itr.next();
	 
	            // Getting elements one by one
			    System.out.println(" ");
	            System.out.print(i + " ");
	 
		 
	}

}
}
