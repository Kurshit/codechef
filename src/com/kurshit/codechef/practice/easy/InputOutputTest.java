package com.kurshit.codechef.practice.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputOutputTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
			    int r = Integer.parseInt(br.readLine());
			    System.out.println(r);
			    if(r == 42)
			        break;
			}
			
			br.close();
		}
		catch(Exception e) {
			
		}
		
		
	}
}

