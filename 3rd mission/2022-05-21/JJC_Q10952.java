package gitup;

import java.util.Scanner;

public class JJC_Q10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			else
				System.out.println(a + b);
		}
	}	
}
/*
20220521
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 2분
*/

