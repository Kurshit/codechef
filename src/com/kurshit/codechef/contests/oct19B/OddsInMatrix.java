package com.kurshit.codechef.contests.oct19B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddsInMatrix {

	public static int oddsInMatrix(int[][] arr, int N, int M) {
		
		int count = 0;
		
		for(int i=1; i<= N;i++) {
			for(int j=1; j<=M; j++) {
				if(arr[i][j] %2 !=0)
					count++;
			}
			
		}
		
		return count;
	}

	public static void matrixQOperations(int[][] arr, int N, int M, int x, int y) {
		
		for(int i=1; i<=M; i++) {
			arr[x][i] = arr[x][i] + 1;
		}
		
		for(int i=1; i<=N; i++) {
			arr[i][y] = arr[i][y] + 1;
		}
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = null;

		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());

			for (int t = 0; t < T; t++) {

				String[] inputArray = br.readLine().split(" ");

				int N = Integer.parseInt(inputArray[0]);
				int M = Integer.parseInt(inputArray[1]);
				int Q = Integer.parseInt(inputArray[2]);
				
				int[][] arr = new int[N+1][M+1];
				
				for(int i=1; i<= N;i++) {
					for(int j=1; j<=M; j++) {
						arr[i][j] = 0; 
					}
				}			
				
				for(int q =0; q < Q; q++) {
					
					String[] temp = br.readLine().split(" ");
					
					int x = Integer.parseInt(temp[0]);
					int y = Integer.parseInt(temp[1]);
					
					matrixQOperations(arr, N, M, x,y);
					
				}
				
				/*for(int i=1; i<= N;i++) {
					for(int j=1; j<=M; j++) {
						System.out.print(arr[i][j] + " "); 
					}
					System.out.println();
				}*/
				
				int result = oddsInMatrix(arr, N, M);
				System.out.println(result);
				

			}
			
				
			
			

		} 
		catch(NumberFormatException e) {
			
		}
		catch (Exception e) {
			
			e.printStackTrace();

		}

	}

}
