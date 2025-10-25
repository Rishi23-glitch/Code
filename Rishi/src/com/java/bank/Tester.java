package com.java.bank;
import java.util.*;
public class Tester {
	public static void main(String[] args) {
		List<Bank> list=new ArrayList<Bank>();
		Bank a1=new Bank(1,223,"A1",23456);
		Bank a2=new Bank(2,2234,"A1",234567);
		Bank a3=new Bank(3,22345,"A1",323456);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		System.out.println(list);
		
		float max=0;
		for (Bank x : list) {
			if (x.getBalance() > max) {
				max = x.getBalance();
			}
		}

		System.out.println("The maximum balance is: " + max);
	}

	}


