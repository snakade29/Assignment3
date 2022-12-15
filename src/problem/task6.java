package problem;

import java.util.ArrayList;
import java.util.List;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Write a program which will display true if list contains Mobile else prints false
		//List  - Web Automation, API Automation, Mobile Automation.
		//Output – True 

		List <String> list = new ArrayList<String>() ;
		list.add( "Web Automation");
		list.add("API Automation");
		list.add("Mobile Automation");
		 
		String arr[]= new String[3];
		for (int i =0 ; i <arr.length ; i++)
		{
			arr[i]=list.get(i);
			if(arr[i].contains("Mobile"))
			{
				System.out.print("True");
			}
		}
	}

}
