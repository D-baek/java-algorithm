package study04;
import java.util.Scanner;
public class Engine3 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3. 아이디 찾기 4.BMI 5.세금계산 6.합격여부");
			switch(scan.nextInt()) {
			case 0 : System.out.println(("종료"));
			return;
			case 1 : 
				member = new Member();
				System.out.println("====== 회원가입 ======");
				System.out.print("아이디 : ");
				member.setID(scan.next());
				System.out.print("비밀번호 : ");
				member.setPwd(scan.next());
				System.out.print("이름 : ");
				member.setName(scan.next());
				System.out.print("주민번호 : ");
				member.setSsn(scan.next());
				System.out.print("키 : (소수점 첫재짜리까지)");
				member.setTall(scan.nextDouble());
				System.out.print("몸무게 : (소수점 첫째짜리까지)");
				member.setWeight(scan.nextDouble());
				System.out.print("혈액형 : ");
				member.setBld(scan.next());
				System.out.println("국어점수 : ");
				member.setKor(scan.nextInt());
				System.out.println("영어점수 : ");
				member.setEng(scan.nextInt());
				System.out.println("수학점수 : ");
				member.setMath(scan.nextInt());
				System.out.println("연봉 : (만원단위로 입력하세요)");
				member.setIncome(scan.nextInt());
				break;
			case 2 :
				System.out.println(member.toString());
				break;
			case 3 :
				System.out.println("아이디 , 이름을 입력하면 비번과 주민번호 알려줌");
				String searchName = scan.next();
				String searchID = scan.next();
				if(searchName.equals("a") &&
						searchID.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
														+ "주민번호 : %s",member.getID(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다");} 
				break;
			case 4 :
				System.out.println("BMI 구하기");
				System.out.println(service.getBMI(member));
				break;
			case 5 :
				System.out.println(service.getTax(member));
				break;
			case 6 :
				System.out.println(service.getReportcard(member));
				break;
			}
		}
}

}
