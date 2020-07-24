package com.epam.java8.assignment;
import java.util.*;
import java.util.stream.Collectors;
public class StartingLetter {
	List<String> poly=new ArrayList<String>();
	public void findPattern(List<String> strings)
	{
		poly= (ArrayList<String>) strings.stream().filter(str->str.length()==3 && str.startsWith("a")).collect(Collectors.toList());
		System.out.println("Strings that are starting with a and has only 3 letters are :" + poly);
	}

}
