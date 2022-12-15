package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a list of numbers 33,44,55,66,77,88 and perform below operation
	Remove second element from list using index
	Remove second element from list using value
	Add 90 at index 3
	Get the length of list
	Print all values from list using any values
	Convert List into array.

		 */
		
        List <Integer> list = new ArrayList <Integer>();
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);
        
        System.out.println(list);
        
     
        System.out.println("after removing using index");
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(55));
        System.out.println("after removing using value");
        System.out.println(list);
        
        list.add(3,90);
        System.out.println("after  adding 90 at index 3");
        System.out.println(list);
        
        System.out.println("Length of list " + list.size());
        
        System.out.print("Convert List into array.");
        int num = list.size();
        int arr[] = new int[num];
        for(int i =0 ; i < list.size() ; i++)
        {
          arr[i]=list.get(i);
        	
        }
        System.out.println("");
        for(int i :arr) {
            System.out.print(i + " ");
        }
    
	}

}
