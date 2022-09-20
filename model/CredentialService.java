package org.greatlearning.model;

import java.util.*;

public class CredentialService 
{
	public String generateEmailAddress (String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".greatlearning.com";
	}
		
		public char[] generatePassword()
		{
			String capitalLetters = "A B C D E F G H T I J K L M N O P Q R S T U V W X Y Z";
			String smallLetters = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			String specialCharactors = "! @ # $ % ^ & * < >";
			String numbers = "0 1 2 3 4 5 6 7 8 9";
			String values = capitalLetters+smallLetters+specialCharactors+numbers;
			Random random = new Random();
			char[] password = new char[8];
			for (int i=0; i<8; i++)
			{
				password[i]= values.charAt(random.nextInt(values.length()));
			}
			return password;
		}
		
		public void showCredentials (Employee e, String email, char[] generatedPassword)
		{
			System.out.println("Dear "+e.getFirstName()+" your generated credentials are as follows");
			System.out.println("Email--->" + email);
			System.out.println ("Generated Password--->"+generatedPassword);
		}
}