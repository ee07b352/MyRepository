package com.charles.test;

import java.util.Arrays;

import com.charles.sort.InsertSort;

public class InsertTest {

	public static void main(String args[]) {
		
		InsertSort is=new InsertSort();
		
		int[] a={3,5,6,2,1,4,7};
		
		System.out.println("before sort in is "+ Arrays.toString(a));
		
		is.insertSort(a);
		
		System.out.println("after sort in is "+ Arrays.toString(a));
		
		
		
	}

}
