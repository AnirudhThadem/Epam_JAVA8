package com.epam.java8.assignment;
import java.util.*;
import java.util.stream.Collectors;
public class Polindrome {
	List<String> poly=new ArrayList<String>();
	public void isPolindrome(List<String> strings)
	{
		poly=(ArrayList<String>) strings.stream().filter(ele->ele.equals(((new StringBuffer(ele)).reverse()).toString())).collect(Collectors.toList());
		System.out.println("List of palindromes in the given array of strings :"+poly);
	}

}
