/**
 * 
 */
package edu.java.util.function.samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the Function Functional Interface example
 */
public class FunctionInterfaceEx {

	public static void main(String[] args) {
		final List<Integer> mList = Arrays.asList(1, 2, 3, 4);
		final Function<List<Integer>, Integer> f = (List<Integer> l) -> {
			Integer x = 0;
			for (Integer i : l) {
				x = x+ (i*i);
			}
			return x;
		};
		System.out.println(performDouble(f, mList));
	}

	public static Integer performDouble(Function<List<Integer>, Integer> f, List<Integer> list) {
		return f.apply(list);
	}

}
