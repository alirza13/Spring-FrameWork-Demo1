package com.alirza.Demo;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

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
    	/*
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
		Integer [] myList = new Integer [] {5,2,99,3,4,1,100};
		Integer [] testList = new Integer [] {0,0,0,1,1,1,0,1};
		HashMap<Integer,Integer> myDict = new HashMap<Integer,Integer>();
		for (int i = 0; i < myList.length; i++)
		{
			myDict.put(myList[i], 1);
			
		}
		System.out.println(myDict);
		int maxLength = 0, currentLength = 0;
		
		for (int i = 0; i < testList.length; i++)
		{
			if (myDict.containsKey(testList[i]))
			{
				currentLength++;
				
			}
			else
			{
				if (currentLength > maxLength)
				{
					maxLength = currentLength;
				}
				currentLength = 0;			
			}
		}
		if (currentLength == testList.length || currentLength > maxLength)
		{
			System.out.println(currentLength);
		}
		else 
		{			
			System.out.println(maxLength);
		}
		*/
    	
    	MyHeap<Integer> heap = new MyHeap<Integer>();
    	System.out.println(heap.checkEmtpy());
    	heap.add(3);
    	heap.add(2);
    	heap.add(9);
    	heap.add(1);
    	heap.add(-2);
    	heap.add(3);
    	heap.add(2);
    	heap.add(9);
    	heap.add(-3);
    	heap.remove(-3);
    	heap.remove(-2);
    	heap.remove(9);
    	heap.remove(9);
    	heap.remove(1);
    	heap.remove(2);
    	
    	System.out.println(heap.get());

    }
}
