package com.tom;

public class GraduateStudent extends Student {

	int thesis;
	static int pass = 70;

	public GraduateStudent(int math, int chinese, int english) {
		super(math, chinese, english);
		thesis = 0;
	}

	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english);
		this.thesis = thesis;
	}

	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}

	@Override
	public void print() {
		System.out.print(getMath() + "\t" + getChinese() + "\t" + getEnglish() + "\t" + getAverage());
		if (getAverage() < pass)
			System.out.print("*");
		System.out.println("\t" + thesis + ((thesis < 70) ? "*" : " "));
	}

}