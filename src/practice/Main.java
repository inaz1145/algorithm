package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		big.solution();
		
	}
	
public static void solution() {
		
				
	int[] arr = {3,2,10,59,47,50,7,8,9};
	// �ִ밪, �ִ밪�� �ε��� �ʱⰪ ����
	int max = arr[0];
	int maxIndex = 0;
	// �ִ밪, �ִ밪�� �ε��� ���ϱ�
	for (int i = 0; i < arr.length; i++) {
	if (arr[i] > max) {
	max = arr[i];
	maxIndex = i;
	}
	}
	// �ִ밪, �ִ밪 �ε��� ���
	System.out.println("�ִ밪�� " + max);
	System.out.println("�ִ밪 �ε����� " + maxIndex);

  }

	
	
}
