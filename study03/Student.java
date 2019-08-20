package study03;
import java.util.Scanner;
public class Student {

	public String getBmi(String name, double kg, double cm) {
		String eval = "";
				
		double height = cm*0.01; 
		double bmi = kg / (height*height) ;
		
		
		if(bmi>30.0) {
			eval = "고도비만";
		}else if(bmi>25.0) {
			eval = "비만";
		}else if(bmi>23.0) {
			eval = "과체중";
		}else if(bmi>18.5){
			eval = "정상";
		}else {
			eval = "저체중";
		}
		return String.format("%s님의 bmi는 %.2f이고 %s입니다.",name,bmi);
		
	}
	public String gettax(String user, double sal, double rate) {
			
		double tr = sal*rate/100;
		return String.format("%s님은 연봉 %.1f만원을 받으시고 납부할 세금은 %.1f만원 입니다.",user,sal,tr);
		
	}
	public void HowMuch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마에요?");
		int price = scan.nextInt();
			System.out.printf("%d원 입니다.",price);
		System.out.println("몇개 드릴까요?");	
		int ea = scan.nextInt();
			System.out.printf("%d개 주세요.",ea);					
		double total = price*ea; 	
			System.out.printf("총 금액은 %.1f원 입니다.",total);
		
		double dc = total*0.1;	
		System.out.print("\n...비싸다구요?");
			
		System.out.println("번호를 선택하세요 1.[10% 할인가격안내], 2.[정가안내]");
		int op=scan.nextInt();
		switch(op) {
		case 1 : total=total-dc;
			System.out.printf("자주와서 깍아드리는거에요~ %.1f만 주세요.",total);
			break;
		case 2 : 
			System.out.printf("여기서 더 싸게 팔면 남는게 없어요~ %.1f원 입니다.",total);
			break;
	}				
}
	
	public void gettc() {
		Scanner scan = new Scanner(System.in);			
		
		while(true) {
			System.out.println("\n를 입력받아 시간으로 변환합니다. \n초를 입력해주세요");	
			int s = scan.nextInt();						
			int m = s/60;
			int h = m/60;	
			if(s<60) {
				System.out.println(s+"초");
			}else{
				if(m<60) {						
					System.out.printf("%d시간 %d분 %d초",h,m,s-60*m);
				}else {				
					System.out.printf("%d시간 %d분 %d초",h,m-60*h,s-60*m);						
			}
		}
	}
		
	}
}