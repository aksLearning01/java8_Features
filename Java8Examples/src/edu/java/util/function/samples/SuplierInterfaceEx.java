/**
 * 
 */
package edu.java.util.function.samples;

import java.util.function.Supplier;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the Suplier Functional Interface example
 */
public class SuplierInterfaceEx {

	public static void main(String[] args) {

		Supplier<String> spwd = () -> {
			String p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$&";
			Supplier<Character> c = () -> p.charAt((int) (Math.random() * 28));
			Supplier<Integer> in = () -> (int) (Math.random() * 10);
			String pwd = "";

			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + c.get();

				} else {
					pwd = pwd + in.get();
				}
			}
			return pwd;

		};

		System.out.println(getRandomPwd(spwd));

	}

	public static String getRandomPwd(Supplier<String> s) {
		return s.get();
	}

}
