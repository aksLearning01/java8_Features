package edu.java.util.function.samples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the UnaryOperator Functional Interface example
 */
public class UnaryOperatorEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6);
		UnaryOperator<Integer> uo = i -> i * i;
		squareFunction(list, uo).forEach(System.out::println);
	}

	public static List<Integer> squareFunction(List<Integer> list, UnaryOperator<Integer> uo) {
		List<Integer> newList = new LinkedList<>();
		list.forEach(i -> newList.add(uo.apply(i)));
		return newList;
	}

}
