package com.kurshit.codechef.practice.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.kurshit.codechef.utils.FasterInput;
import com.kurshit.codechef.utils.FasterOutput;

public class RacingHorsesMinInArray {

	public static void main(String[] args) {

		FasterInput input = new FasterInput();
		FasterOutput output = new FasterOutput();

		try {

			int T = input.nextInt();

			for (int t = 0; t < T; t++) {

				int N = input.nextInt();

				long[] arr = input.nextLongArray(N);
				long min = Long.MAX_VALUE;

				for (int i = 0; i < N - 1; i++) {
					for (int j = i + 1; j < N; j++) {
						long diff = Math.abs(arr[i] - arr[j]);
						if (diff < min) {
							min = diff;
						}
					}
				}

				System.out.println(min);

			}

		} catch (Exception e) {

		}

	}

}
