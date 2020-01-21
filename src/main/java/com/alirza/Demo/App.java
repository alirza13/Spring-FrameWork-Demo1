package com.alirza.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle vehicle = (Vehicle)context.getBean("vehicle");
    	vehicle.Drive();
    	Stack<Integer> stack1 = new Stack<Integer>(4);
    	stack1.push(1);
    	stack1.push(2);
    	System.out.println(stack1.pop());
    	System.out.println(stack1.pop());
    	System.out.println(stack1.pop());
    	stack1.push(1);
    	stack1.push(2);
    	System.out.println(stack1.pop());
    	System.out.println(stack1.pop());
    	System.out.println(stack1.pop());
    	System.out.println(stack1.pop());
    }
}
