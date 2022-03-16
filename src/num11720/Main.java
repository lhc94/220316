package num11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int sum = 0;
		
		String a = sc.next();
		//next()와 nextLine() 차이
		// next()는 공백전까지의 문자열을 반환
		// nextLine()은 Enter를 치기 전까지 쓴 문자열 모두 반환
		for (int i = 0; i < n; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
		sc.close();
	}
}