package com.kodnest.training.VendingMachine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the product number");
		String productCode=scan.nextLine();
		getProduct(productCode);
		}
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "p01" :
			System.out.println("coco cola");
			break;
		case "p02" :
			System.out.println("pepsi");
			break;
		case "p03" :
			System.out.println("thumsup");
			break;
		case "p04" :
			System.out.println("mountdew");
			break;
			default:
				System.out.println(" enter valid product code");
		}
	}
}