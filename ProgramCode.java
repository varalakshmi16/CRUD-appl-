import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ProgramCode 
{
	public static Map<String,String> getStudents(String studentsList)
	{
		
		// Write a program to accept a list of students with marks as CSV values and perform the following tasks.
		// Store the student details in a map.
		// Store the name of the students with their status like "PASS" or "FAIL" based on the pass mark of 70.
		// For the student with maximum mark - > Give the status as "TOPPER".
		// For the student with minimum mark - >Give the status as "BOTTOM".
		// Arrange the students based on their names in ascending order.
		
		int max=0,min=Integer.MAX_VALUE;
		String topper = null;
		String looser=null;
		StringTokenizer stringTokenizer=new StringTokenizer(studentsList,",");

		TreeMap<String, String> map = new TreeMap<String, String>();
		
		while(stringTokenizer.hasMoreTokens())
		{
	    String str = stringTokenizer.nextToken();

		StringTokenizer stt=new StringTokenizer(str,"-");

		String name = stt.nextToken();
		name=Character.toUpperCase(name.charAt(0))+name.substring(1);
		String mark = stt.nextToken();
		int i=Integer.parseInt(mark); 
		if(max<i)
		{
			max=i;
		topper=name;
		}
		if(min>i)
		{
			min=i;
			looser=name;
		}
		   
		if (i>= 70){
			map.put(name, "PASS");
			}
		else
		map.put(name, "FAIL");
		}
		
		map.put(topper, "TOPPER");
		map.put(looser, "BOTTOM");
		return map;

	}
}
