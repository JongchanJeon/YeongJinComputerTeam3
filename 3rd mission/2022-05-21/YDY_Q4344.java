package _2022_05_21;

import java.util.*;

public class YDY_Q4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];	
			
			int sum = 0;
			
			for (int j = 0; j < n; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double avg = (double)sum / n;
			double cnt = 0;
			
			for (int j = 0; j < n; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", cnt / n * 100);
		}
		
	}
}
/*
2022-05-21
문제 이해도 : 2
문제 해결 : O
코딩 시간 : 55분
*/
