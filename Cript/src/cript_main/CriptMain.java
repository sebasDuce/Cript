package cript_main;

import java.util.Scanner;

import cript_object.CriptObject;

public class CriptMain {

	public static void main(String[] args) {
		
		boolean on = true;
		String newPW = "Your new Password is: ";
		
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("Welcome User");
		System.out.println("Write your password below:");
		
		String message = scan.nextLine();
		
		CriptObject co = new CriptObject(message);
		
		while(on) {
			System.out.println("Choose an action: \n [1] Cipher with Caesar \n [2] Cipher with Monoalphabetic \n [3] Cipher with Numeration "
					+ "\n [4] Decipher with Caesar \n [7] Log \n [8] Quit");
			int method = scan.nextInt();
			
				if(method == 1)
				{
					if(co.getMessage().equals(co.getCodedMessage())) {
						co.Caesar();
						co.codedCaesar();
						System.out.println(newPW+co.getCodedMessage());
					} else {
						System.out.println("The password has already been changed");
					}
				}
				if(method == 2)
				{
					//co.MonoalMonoalfabetic();
					//co.codedMono();
					System.out.println("N/A");
					System.out.println(newPW+co.getCodedMessage());
				}
				if(method == 3)
				{
					//co2.Numeracio();
					//co.codedNum();
					System.out.println("N/A");
					System.out.println(newPW+co.getCodedMessage());
				}
				if(method == 4)
				{
					if(!co.getMessage().equals(co.getCodedMessage())) {
						co._Caesar();
						co.decodedCaesar();
						System.out.println(newPW+co.getCodedMessage());
					} else {
						System.out.println("The password has not been changed yet");
					}
				}

				if(method == 7)
				{
					co.getCodes();
				}
				if(method == 8)
				{
					on = false;
				}
			System.out.println();
		}
		// CriptObject co2 = new CriptObject("sara", "elcodiesdos");
		
	}
}