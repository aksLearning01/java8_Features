/**
 * 
 */
package edu.java.util.function.samples;

import java.util.function.Consumer;

/*
 * @author Akanksha Kaskar
 * @Description : This class is used to demonstrate the Consumer Functional Interface example
 */
public class ConsumerInterfaceEx {
	
	public static void main(String[] args) {
		Consumer<String> c=s -> System.out.println(s+ " Hello");
		c.accept("Akanksha");
				
	}
	
	
	
	

}
