package homework03;
import java.util.Scanner;


public class Engine1 {

	public static void main(String[] args) {
		Student st = new Student();
		Scanner scan = new Scanner(System.in);
		String result = "";
		String eval = "";
		while(true) {

		System.out.println("메뉴: 0.종료  1.ArithmeticCalc 2.Bmi 3. Timecalc 4.Tax 5.Md 6.Ly");
			int flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료");
						return;
			case 1 :
				System.out.println("===사칙연산 계산기 입니다!===");
				System.out.println("=시작값을 입력하세요=");
				int start = scan.nextInt();
				System.out.println("원하시는 사칙연산은?");
				System.out.println("===1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 ===");
				int op = scan.nextInt();
				System.out.println("===마지막값을 입력하세요===");
				int end = scan.nextInt();
					result = st.getArithmeticCalc(start, op, end);
					System.out.println(result);
				break;
			
			
			case 2 : 
			System.out.println("반갑습니다. BMI지수를 측정합니다 \n사용자분의 성함을 입력해주세요");
			String name = scan.next();
			System.out.println("몸무게를 입력해주세요 (kg)");
			double kg = scan.nextDouble();
			System.out.println("키를 입력해주세요(cm)");
			double h = scan.nextDouble();		
			result = st.getBmi(name,kg,h);
			System.out.println(result);
			
			break;
			case 3 :		
			System.out.println("===시간계산기===");
			System.out.println("===계산하실 초값을 입력하세요!!===");
			int num = scan.nextInt();
				result =st.getTimecalc(num);
				System.out.println(result);
			break;
			
			case 4 : 
			System.out.println("===성함을 입력하세요===");
			String name1 = scan.next();
			System.out.println("===연봉을 만원단위로 입력하세요===");
			int income = scan.nextInt();
				result = st.getTax(name1, income);
				System.out.println(result);
			break;
			}
		}
	}
}