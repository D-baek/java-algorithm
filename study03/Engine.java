package study03;
import java.util.Scanner;
import study03.Student;
	public class Engine {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Student st = new Student();
			int flag = 0;
			String result = "";
		
		while(true) {			
			System.out.println("메뉴: 1.BMI  2.tax 3.howmuch , 4.tc");
			flag = scan.nextInt();
			switch(flag) {
			case 0 :
				System.out.println("종료");
				
				return;
			case 1 :	
			System.out.println("BMI"); 						
			System.out.println("반갑습니다. BMI지수를 측정합니다 \n사용자분의 성함을 입력해주세요");
			String name = scan.next();
			System.out.println("몸무게를 입력해주세요 (kg)");
			double kg = scan.nextDouble();
			System.out.println("키를 입력해주세요(cm)");
			double cm = scan.nextDouble();
			result =st.getBmi(name,kg,cm);
			System.out.println(result);
			break;		
				
			case 2 :	System.out.println("tax");
			
			System.out.println("세금 계산기입니다 \n이름을 입력해주세요");
			String user = scan.next();		
			System.out.println("연봉을 입력해주세요.(만원)");
			int sal = scan.nextInt();		
			System.out.println("세율(%) 입력");
			double rate = scan.nextDouble();	
			result = st.gettax(user,sal,rate);
				break;
			case 3 :	System.out.println("HowMuch");
				break;
			case 4 :	System.out.println("tc");
				break;
			
			}			
		}		
	}
}