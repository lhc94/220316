package num11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main01 {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// 또는 (a-48)
		}
//		밑에 것과 비교
//		for (int i = 0; i < n; i++) {
//			sum += a.charAt(i)-'0';
//		}
		
//		getBytes() 는 문자열을 byte배열로 반환한다
//		for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
		
		System.out.print(sum);
		
	}
}
