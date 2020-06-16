package edu.java.util.function.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the java.util.stream  example
 */
public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 6, 8, 5, 2, 7, 9);

		// to find new list containing only even digitis
		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		evenList.forEach(System.out::println);

		System.out.println("-----------------------------");
		// To make a new list which has all the elements double from previous list
		List<Integer> doubleList = list.stream().map(x -> x * 2).collect(Collectors.toList());
		doubleList.forEach(System.out::println);

	}

}
