package com.tom;

public class Student {
	private  int math;
	private int chinese;
	private int english;
	int avg;
	static int pass = 60;

	//
	public Student(int math, int chinese, int english) {
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}

	public int getEnglish() {
		return english;
	}

	public int getChinese() {
		return chinese;
	}

	public int getMath() {
		return math;
	}

	public Student() {

	}

	public Student(int english) {
		// this.english = english;
		this(0, 0, english);
	}

	public int getAverage() {
		int avg = ((math + chinese + english) / 3);
		return avg;
	}

	public void print() {
		System.out.print(math + "\t" + chinese + "\t" + english + "\t");
		if (getAverage() < pass)
			System.out.println("*");
		else
			System.out.println();
	}

	public static void main(String[] args) {
		Student stu1 = new Student(60, 55, 80);
		Student stu2 = new Student(70, 66, 70);

		Student.pass = 55;
		System.out.println(Math.max(5, 8));
		System.out.println(Math.random());
		stu1.print();
		stu2.print();
		stu1.english = 55;
		int n = Integer.parseInt("5");
		String s = String.valueOf(n);

		// System.out.println(stu.getAverage());
		// 研究生
		GraduateStudent gstu = new GraduateStudent(55, 77, 66, 67);
		gstu.print();

	}

}
