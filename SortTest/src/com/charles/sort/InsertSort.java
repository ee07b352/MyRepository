package com.charles.sort;

public class InsertSort {
	
	
	
	
	
	public int[] insertSort(int[] in){
		int temp=0;
		int j=0;
		for(int i=1;i<in.length;i++){
			
			j=i;
			while(j>0&&in[j-1]>in[j]){
				
				temp=in[j];
				in[j]=in[j-1];
				in[j-1]=temp;
				
				j--;
				
				
				
			}
			
			
		}
		
		
		
		return in;
	}
	
	
}
