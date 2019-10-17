package com.kurshit.codechef.practice.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrongMinus {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String tempString = br.readLine();
			
			if(tempString == null || tempString.isEmpty() )
				return;
			
			String[] temp = tempString.split(" ");
			
			int A = Integer.parseInt(temp[0]);
			int B = Integer.parseInt(temp[1]);
			
			int diff = Math.abs(A - B);			
			
			String s=String.valueOf(diff);

			int last=diff%10;
			System.out.println(s.substring(0, s.length()-1)+(last+1)%9);		
			
		}
		catch(NumberFormatException e) {
			System.out.println("Wrong Input");
		}
		
	
	}

}
