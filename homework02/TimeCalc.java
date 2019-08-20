package homework02;
import java.util.Scanner;


/*초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.*/


public class TimeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int min = 0;
		int hour = 0;
		int sec = 0;
		
		System.out.println("===시간계산기===");
		System.out.println("===계산하실 초값을 입력하세요!!===");
		System.out.println("===초값에 0을 입력하시면 종료 됩니다!===");
		while(true) {
			num = scan.nextInt();
			if(num==0) {
				System.out.println("===계산기를 종료합니다!==="); return;
			}
			
				hour= (num/60) / 60;
				min  = (num / 60) % 60;
				sec   = num % 60;
				
				System.out.printf("%d시간 %d분 %d초 ", hour, min , sec);	
				}	
		}
}