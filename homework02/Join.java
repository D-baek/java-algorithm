package homework02;
import java.util.Scanner;
/*여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요
=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 
입력이 종료되면 ...아래처럼 보이게 해주세요
=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형
*/
public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==== 회원가입 ====");
		System.out.print("아이디 : ");
		String ID = scan.next();
		System.out.print("비밀번호 : ");
		String pwd = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("생년월일(예) 1980-01-01 : ");
		String birth = scan.next();
		System.out.print("성인여부(성인 : true, 미성년 : false) : ");
		String adult = scan.next();
		System.out.print("키(소수점 첫째자리까지) : ");
		String tall = scan.next();
		System.out.print("몸무게(소수점 첫째자리까지) : ");
		String weight = scan.next();
		System.out.print("혈액형(예) A : ");
		String bld = scan.next();
		
	
		System.out.println("==== 회원정보 ====");
		System.out.printf("%s : ", ID);
		System.out.printf("%s : ", pwd);
		System.out.printf("이름 : " + name);
		System.out.printf("생년월일 : " + birth);
		System.out.printf("성인여부 : " + adult);
		System.out.println("키 : " + tall + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bld);
		
	}

}