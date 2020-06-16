/**
 * 
 */
package edu.java.util.function.samples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the BinaryOperator Functional Interface example
 */
public class BinaryOperatorInterfaceEx {

	public static void main(String[] args) {
		BinaryOperator<Integer> bo = (i, j) -> i * j;
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> newList = doubleValue(bo, list1);
		newList.forEach(System.out::println);

	}

	public static List<Integer> doubleValue(BinaryOperator<Integer> bo, List<Integer> list) {
		List<Integer> resultList = new LinkedList<>();
		list.forEach(z -> resultList.add(bo.apply(z, 2)));
		return resultList;
	}
}
