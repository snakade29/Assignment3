package problem;

import java.util.ArrayList;
import java.util.List;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program which will pick the values from Array and Store them List.

        int arr[] = {1,2,3,4,5} ;
        
        List <Integer> list = new ArrayList<Integer>();
        
        for(int i=0 ; i < arr.length ;i++)
        {
        	list.add(arr[i]);
        }
        
        System.out.println(list);
		
         
	}

}
