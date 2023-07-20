package com.kodnest.training.AgeCategorizer;

import java.util.Scanner;

public class AgeCategorizer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age");
		int age=scan.nextInt();
		categorizeAge(age);
	}
	public static void categorizeAge(int age)
	{
		if(age>=0 && age<=12)
		{
			System.out.println("child");
		}
		else if(age>12 && age<=19)
		{
			System.out.println("teen");
		}
		else if(age>20 && age<=59)
		{
			System.out.println("adult");
		}
		else
		{
			System.out.println("senior");
		}
	}

}
