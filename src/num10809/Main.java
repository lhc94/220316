package num10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		int[] num = new int[26];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = -1;
		}
//		내가 한 것
//		for (int i = 0; i < a.length(); i++) {
//			
//			for(char j = 'a'; j <= 'z'; j++) {
//				
//				if(a.charAt(i) == j) {
//					num[j-97] = i;
//				}
//			}
//		}
//      해결 못한 부분 : 첫음으로 같은 알파벳을 찾았을 떄의 위치만 출력하도록 하는 방법
//		구현 하지 못했다 
//		 계속 맨마지막 번 째의 같은 알파벳을 찾았을 경우의 위치 값만 출력되었다
		
		for(int i = 0; i <  a.length(); i++) {
			char ch = a.charAt(i);
			
    		if(num[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				num[ch - 'a'] = i;
			}
		}
		// 방법 : 단어를 각각 쪼개서 ch에 초기화 시켜준다
		// -1인 경우에만 그러니까 첫번째로 같은 알파벳을 찾을 경우에만 초기화한다
		
		for(int Onum : num) {
			System.out.println(Onum);
		}
		sc.close();
	}
}
