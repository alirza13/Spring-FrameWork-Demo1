package com.alirza.Demo;

public class Stack <T> {
	private int topPosition = -1;
	private T array [];
	private int arraySize;

	public Stack (int size) 
	{	
		arraySize = size;
		array = (T[]) new Object [size];
	}
	
	public void push (T element)
	{
		if (topPosition != arraySize)
		{
			topPosition++;
			array [topPosition] = element;	
		}
		else 
		{
			System.out.println("Stack is full");
		}
	}
	
	public T pop ()
	{
		if (topPosition >= 0)
		{
			T element = array[topPosition];
			array [topPosition] = null;
			topPosition--;
			return element;
		}
		else
		{
			System.out.println("Stack is empty");
			return null;
		}
	}
}
