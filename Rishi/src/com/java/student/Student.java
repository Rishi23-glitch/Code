package com.java.student;

public class Student {
	int ID;
	String Name;
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	int mark5;
	
	public Student(int iD, String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
		this.ID = iD;
		this.Name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.mark5 = mark5;
	}
	public int getTotalMarks() {
		return mark1 + mark2 + mark3 + mark4 + mark5;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public int getMark4() {
		return mark4;
	}
	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}
	public int getMark5() {
		return mark5;
	}
	public void setMark5(int mark5) {
		this.mark5 = mark5;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", totalMarks=" + getTotalMarks() + "]";
	}
}