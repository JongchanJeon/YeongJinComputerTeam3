package CodeUp;

import java.util.*;

public class Q1068_DaYeon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(i%2 == 0) {
				sum += i;			
			}
		}
		System.out.println(sum);
	}

}

/*
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 3분
*/