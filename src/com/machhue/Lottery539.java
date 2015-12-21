package com.machhue;

import java.util.Random;

public class Lottery539 implements Game{
	int[] nums = new int[5];

	public Lottery539() {
		generate();
	}

	public Lottery539(int n1, int n2, int n3, int n4, int n5) {
		nums[0] = n1;
		nums[1] = n2;
		nums[2] = n3;
		nums[3] = n4;
		nums[4] = n5;
	}

	public Lottery539(int[] nums) {
		this.nums = nums;
	}
@Override
	public boolean validate() {
		int[] spots = new int[39];
		for (int i = 0; i < 5; i++) {
			spots[nums[i] - 1] = 1;

		}
		int sum = 0;
		for (int i = 0; i < 39; i++) {
			sum = sum + spots[i];
		}
		if (sum < 5)
			return false;

		else

			return true;

	}
@Override
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
@Override
	public void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * Lottery539 lot = new Lottery539(); lot.generate(); lot.print();
		 */
		Lottery539 lot1 = new Lottery539(3, 5, 9, 10, 35);
		System.out.println(lot1.validate());
		//介面使用,多型
		Game[] games = new  Game[3];
		games[0] = new Lottery539();
		games[1] = new Lottery539(5, 21, 33, 12, 4);
		games[2] = new WillyGame();
		for (int i =0; i< games.length; i++){
			games[i].print();
		}
	}

}
