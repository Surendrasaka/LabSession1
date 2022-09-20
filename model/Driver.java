package org.greatlearning.model;

import java.util.Scanner;

public class Driver 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Employee e = new Employee("Surendra", "Saka");
		CredentialService credentialService = new CredentialService();
		int choice;
		do
		{
			System.out.println("Please Enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				String email = credentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password = credentialService.generatePassword();
				credentialService.showCredentials(e, email, password);
				break;
				
		default:
			
			break;
			}
		}
		while (choice<=4);
		
	}

}
