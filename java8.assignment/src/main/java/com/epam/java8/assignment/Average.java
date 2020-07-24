package com.epam.java8.assignment;
import java.util.*;
public class Average {
	public void average(List<Integer> ListOfNumbers)
	{
		ListOfNumbers.stream()
		.mapToInt(number->number)
		.average()
		.ifPresent(avg->System.out.println("Average is:- "+avg));
		
	}

}
