package problem;

import java.util.ArrayList;
import java.util.List;
 
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Write a program which will print sum of all numbers which is stored in list.
	 
		 List <Integer> list = new ArrayList<Integer>();
		 list.add(200);
		 list.add(300);
		 list.add(500);
		 list.add(200);
		 list.add(200);
		 System.out.println(list);
		 
		 int sum = 0 ;
		 for(int i =0 ; i < list.size(); i++)
		 {
			sum= sum + list.get(i); 
		 }
		 
		 System.out.println("Sum of all numbers which is stored in list :" +sum );
	 
		 
		 
	}

}
