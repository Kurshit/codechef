package com.kurshit.codechef.practice.easy;

import java.io.*;

/*
 *  https://www.codechef.com/problems/FCTRL 
 *  
 *  Problem: Basically, for every N, calculate number of zeros in the end of N!
 *  
 *  Solution: After every multiple of 5, the number of zeros at the end increases by one
 */

public class FACT {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		int testcase = Integer.parseInt(in.readLine());

		try {
			while (testcase-- > 0) {
				int n = Integer.parseInt(in.readLine());
				int ans = 0;
				int k = 5;

				// K will eventually be greater than n at some point of time
				while (n / k > 0) {
					ans += n / k;
					k *= 5;
				}
				out.println(ans);
			}
		} catch (NumberFormatException e) {
			System.out.println("Wrong Input");
		}
		in.close();
		out.close();
	}
}
