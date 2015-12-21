package com.machhue;

import java.util.Scanner;

public class Person {
	float weight;
	float height;

	public Person(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}

	public String advice() {
		float bmi = bmi();
		String msg;
		if (bmi < 16) {
			msg = "多吃點喔!";
		} else {
			if (bmi > 25) {
				msg = "少吃一點喔!";
			} else {
				msg = "正常!";
			}
		}
		/*
		 * if (bmi>=16 && bmi<=25){ msg ="正常!";
		 * 
		 * }else{ if(bmi<16){ msg = "多吃一點喔!"; }else{ msg ="少吃一點喔!"; } }
		 */
		return msg;

	}

	public float bmi() {
		int n = 5;
		System.out.println(3 + (n++));
		System.out.println(n);

		float bmi = weight / (height * height);
		bmi = ((int) (bmi * 100)) / 100.0f;
		return bmi;
	}

	public void sayHello() {
		System.out.println("HELLO");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入體重:");
		String line = scanner.nextLine(); // 字串輸入
		System.out.println(line);
		float h = Float.parseFloat(line); // 字串轉型福點數
		System.out.print("請輸入身高:");
		line = scanner.nextLine(); //
		System.out.println(line);
		float w = Float.parseFloat(line);

		Person p = new Person(w, h);
		System.out.println(p.bmi());

		int n = 5;
		int m = 7;
		if (n > m) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}
		// System.out.println(n>m ? n: m);

		System.out.println(6 >= 3); // ==, !=
		// System.out.println(p.advice());
		Person p1 = new Person(65.5f, 1.7f);
		p1.sayHello();
		// p.weight =65.5f;
		// p.height =1.7f;
		// float bmi = p.bmi();
		float f = 10;
		float f2 = (float) 10.5;
		System.out.println("abc" + f);
	}

}
