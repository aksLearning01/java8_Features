package edu.java.util.function.samples;

import java.util.function.Predicate;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the Predicate Functional Interface example
 */

public class PredicateInterfaceEx {

	public static void main(String[] args) {

		// Single Predicate
		Predicate<Integer> p1 = I -> I > 100;
		System.out.println("Simple example result " + p1.test(200));

		// Predicate Joining
		Predicate<String> p2 = S -> S.startsWith("Ak");
		Predicate<String> p3 = S -> S.length() >= 8;

		System.out.println("Joining example result " + p2.and(p3).test("Akanksha"));

		Predicate<Integer> p4 = S -> S % 2 == 0;
		
		System.out.println("Negate example result " + p4.negate().test(21));
		
		
		Predicate<Integer> p5 = S -> S % 2 == 0;
		
		Predicate<Integer> p6= S -> S % 3 == 0;
		
		
		System.out.println("Or example result " + p5.or(p6).test(30));

	}

}
