package homework02;
import java.util.Scanner;
/*To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.*/

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		String eval = "";
		
		while(true) {
			System.out.println("===사칙연산 계산기 입니다!===");
			System.out.println("=시작값을 입력하세요=");
			int start = scan.nextInt();
			System.out.println("원하시는 사칙연산은?");
			System.out.println("===1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 ===");
			int op = scan.nextInt();
			System.out.println("===마지막값을 입력하세요===");
			int end = scan.nextInt();
			int dd = start % end;
		
			if(op==1) {
			eval += (start +end);
			} else if(op==2){
			eval += (start - end);
			} else if(op==3){
			eval += (start * end);
			} else if(op==4){
			if(start / end !=0) {
				eval = start/end + "[" + start%end + "]";
				}else eval += start / end ;
			}else {System.out.println("잘못 입력하셨습니다."); return;
		} 
		System.out.println(eval);
		}
	}
}