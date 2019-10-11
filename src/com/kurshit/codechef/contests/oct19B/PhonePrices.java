package com.kurshit.codechef.contests.oct19B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Contest Code : OCT19B
 *  Problem Code : S10E
 *  
 *  Statement : Chef wants to buy a new phone, but he is not willing to spend a lot of money. 
 *  Instead, he checks the price of his chosen model everyday and waits for the price to drop to an 
 *  acceptable value. So far, he has observed the price for N days (numbere 1 through N); 
 *  for each valid i, the price on the i-th day was Pi dollars.
 *  On each day, Chef considers the price of the phone to be good if it is strictly smaller 
 *  than all the prices he has observed during the previous five days. 
 *  If there is no record of the price on some of the previous five days 
 *  (because Chef has not started checking the price on that day yet), then Chef simply ignores 
 *  that previous day ― we could say that he considers the price on that day to be infinite.
 *  Now, Chef is wondering ― on how many days has he considered the price to be good? 
 *  Find the number of these days.
 *  
 *   
 */

public class PhonePrices {


	public static int bestDays(int[] arr) {


		int count = 0;
		int min = Integer.MAX_VALUE;
		if(arr.length >1) {
			count = 1;
			min = arr[0];
		}


		for(int i=1; i < arr.length; i++) {

			if(i <5 && arr[i] < min) {
				count++;
				min = arr[i];
			}

			if(i >= 5) {

				int j = i-5;
				boolean valid = false;
				while(arr[j] > arr[i]) {
					j++;
				}

				if(j == i) {
					count++;
				}

			}


		}


		return count;


	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int T = Integer.parseInt(br.readLine());

			for( int t=0; t <T; t++) {

				int N = Integer.parseInt(br.readLine());

				int[] arr = new int[N];

				String[] stringArr = br.readLine().split(" ");

				for(int i=0; i< stringArr.length; i++) {
					arr[i] = Integer.parseInt(stringArr[i]);
				}	

				System.out.println(bestDays(arr));
			}



		} catch(Exception e) {


		} finally {


		}


	}

}
