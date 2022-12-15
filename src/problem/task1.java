package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program which can store List of Integer values and print all the values using for loop.
	 List <Integer> list = new ArrayList<Integer>();
	 list.add(200);
	 list.add(300);
	 list.add(500);
	 list.add(200);
	 list.add(200);
	 System.out.println(list);
 
	 System.out.println(" Printing all the values using forloop :");
	 
	 for(int i :list)
	 {
		 System.out.println(i); 
	 }
 
	}

}
