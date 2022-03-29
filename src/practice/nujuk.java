package practice;

import java.util.Arrays;
import java.util.Scanner;

public class nujuk {

	public static void solution() {
		
	
			Scanner in = new Scanner(System.in);
	        
			int N = in.nextInt();
			int[] arr = new int[N];
	        
			for (int i = 0; i < N; i++) {
				arr[i] = in.nextInt();
			}
	      
			Arrays.sort(arr);//정렬
			System.out.print(arr[0] + " " + arr[N - 1]);//오름차순
		
	 }
}

	
