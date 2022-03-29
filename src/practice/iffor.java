package practice;

import java.util.Scanner;

public class iffor {

	public static void solution() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b){//1번
		System.out.println(">");	
		}
		else if(a<b) {//2번
	    System.out.println("<");	
		}
		else {//1,2번 그외 조건
		System.out.println("==");	
		}	
		
	}
	
}
