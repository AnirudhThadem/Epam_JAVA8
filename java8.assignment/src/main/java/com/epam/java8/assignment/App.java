package com.epam.java8.assignment;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	 List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    	 Average obj = new Average();
    	 obj.average(numbers);
    	 List<String> polind =Arrays.asList("aba","malayalam","bunny","12321","hit","polindrome","noon");
    	 Polindrome object=new Polindrome();
    	 object.isPolindrome(polind);
    	 
    	 List<String> arr=Arrays.asList("abb","ABB","ARUN","AVI","abi","bot","noob","karan","thop","aaa");
    	 StartingLetter ob=new StartingLetter();
    	 ob.findPattern(arr);
    }
}
