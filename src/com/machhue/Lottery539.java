package com.machhue;

import java.util.Random;

public class Lottery539 {
	int[] nums = new int[5];
public Lottery539(){
	generate();
}
public Lottery539(int n1, int n2, int n3, int n4, int n5){
	nums[0] = n1;
}
public Lottery539(int[] nums){
	this.nums = nums;
}
protected boolean validate(){
	int[] spots = new int[39];
	for (int i=0; i<5; i++){
		spots[nums[i]-1] =1;
		
	}
	 int sum =0;
	 for (int i=0; i<39; i++){
			sum = sum+ spots[i];
			
			
		}
	  if (sum<5);
	  return 
}
	public void generate() {
		Random r = new Random();
		int[] spots = new int[40];
		for (int i = 0; i < 5; i++) {
			int n = r.nextInt(39) + 1;
			if (spots[n] == 1) {
				i--;
				continue;
			} else {
				nums[i] = n;
				spots[n] = 1;
			}
		}
	}

	public void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	/*	Lottery539 lot = new Lottery539();
		lot.generate();
		lot.print(); */
		
	}

}
