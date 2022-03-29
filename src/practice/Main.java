package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		big.solution();
		
	}
	
public static void solution() {
		
				
	int[] arr = {3,2,10,59,47,50,7,8,9};
	// 최대값, 최대값의 인덱스 초기값 세팅
	int max = arr[0];
	int maxIndex = 0;
	// 최대값, 최대값의 인덱스 구하기
	for (int i = 0; i < arr.length; i++) {
	if (arr[i] > max) {
	max = arr[i];
	maxIndex = i;
	}
	}
	// 최대값, 최대값 인덱스 출력
	System.out.println("최대값은 " + max);
	System.out.println("최대값 인덱스는 " + maxIndex);

  }

	
	
}
