package com.kodnest.training.CharacterIdentifier;
import java.util.Scanner;
public class CharacterIdentifier1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
			
	}
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("enter charcater" +ch+ "is digit");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("enter chatcter is" +ch+ "special charcter");
			
		}
		else {
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println("enter charcter" +ch+ "is lower case vowel");
					
				}
				else
				{
					System.out.println("enter character" +ch+ "is upper case vowel");
				}
				break;

			default:

			if(Character.isLowerCase(ch))

			{

			System.out.println("Entered Character " +ch+ " Is Lower Case Consonent");

			}

			else

			{

			System.out.println("Entered Character " +ch+ " is Upper case Consonent");

			}

			}

			}

			}

			}

		
			
			
		
	


