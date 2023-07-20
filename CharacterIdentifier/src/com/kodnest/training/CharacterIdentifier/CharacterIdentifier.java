package com.kodnest.training.CharacterIdentifier;
import java.util.Scanner;

public class CharacterIdentifier {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a character");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
}
public static void identifyCharacter(char ch)
{
	if(Character.isUpperCase(ch))
	{	
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("the charcater is an upper case vowel");
		}
		else
		{
			System.out.println("the charcter is an upper case constant");
		}
	}
	else if(Character.isLowerCase(ch))
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("the character is an lower case vowel");
		}
		else
		{
		System.out.println("the character is an lower case constant");
	}
	}
	else if(Character.isDigit(ch))
	{
		System.out.println(" the character is digit");
	}
	else
	{
		System.out.println("the character is special character");
	}
}

}
