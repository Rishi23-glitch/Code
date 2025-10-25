package com.java.bank;

public class Bank {
	
	int ID;
	double Accountnum;
	String Name;
	float Balance;
	public Bank(int iD, double accountnum, String name, float balance) {
		this.ID = iD;
		this.Accountnum = accountnum;
		this.Name = name;
		this.Balance = balance;
		
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getAccountnum() {
		return Accountnum;
	}
	public void setAccountnum(double accountnum) {
		Accountnum = accountnum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [ID=" + ID + ", Accountnum=" + Accountnum + ", Name=" + Name + ", Balance=" + Balance + "]";
	}
	
}
	
	
			
	


