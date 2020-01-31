package com.alirza.Demo;

import java.util.*;
import javafx.util.Pair;

public class MyHeap<T extends Comparable<? super T>> {
	private List<T> heapList;

	public MyHeap() {
		heapList = new ArrayList<T>();
		heapList.add(null);
	}

	public void add(T element) {
		int k = heapList.size();
		heapList.add(heapList.size(), element);

		while (k > 1) {
			boolean isLessThanParent = heapList.get(k / 2).compareTo(element) > 0;
			if (isLessThanParent) {
				T swapElement = heapList.get(k / 2);
				heapList.set(k / 2, heapList.get(k));
				heapList.set(k, swapElement);
				k = k / 2;
			} else {
				break;
			}
		}
	}

	public void remove(T element) {
		if (checkEmtpy()) {
			System.out.println("Heap is empty.");
		} else {
			Pair<Boolean, Integer> existingPair = doesElementExist(element);
			if (existingPair.getKey() == true) {
				int existingIndex = existingPair.getValue();
				int heapSize = heapList.size();
				heapList.set(existingIndex, heapList.get(heapSize - 1));
				heapList.remove(heapSize - 1);
				int k = existingIndex;
				while (k * 2 < heapList.size()) {
					boolean isGreaterThanFirstChild = heapList.get(k * 2 ).compareTo(heapList.get(k)) < 0;
				
					if (isGreaterThanFirstChild && heapList.get(k * 2).compareTo(heapList.get(k * 2 + 1)) < 0)
					{
						T swappedElement = heapList.get(k * 2);
						heapList.set(k * 2, heapList.get(k));
						heapList.set(k, swappedElement);
						k = k * 2;
					}
					else if (k * 2  + 1 < heapList.size() && heapList.get(k * 2 + 1).compareTo(heapList.get(k)) < 0  && heapList.get(k * 2).compareTo(heapList.get(k * 2 + 1)) > 0) {
						T swappedElement = heapList.get(k * 2 + 1);
						heapList.set(k * 2 + 1, heapList.get(k));
						heapList.set(k, swappedElement);
						k = k * 2 + 1;
					}			
					else {
						break;
					}
				}
				

			} else {
				System.out.println("Element does not exist.");
			}
		}
	}

	public T get() {
		return heapList.get(1);

	}

	public boolean checkEmtpy() {
		if (heapList.size() == 1)
			return true;
		else
			return false;
	}

	@SuppressWarnings("restriction")
	public Pair<Boolean, Integer> doesElementExist(T element) {
		for (int i = 1; i < heapList.size(); i++) {
			if (heapList.get(i).compareTo(element) == 0) {
				return (new Pair<Boolean, Integer>(true, i));
			}
		}
		return (new Pair<Boolean, Integer>(false, -1));
	}

}
