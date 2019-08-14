package homework01;
import java.util.Random;
import java.util.Scanner;
class RSP{

public static void main(String[] args) {
	System.out.println("가위 바위 보!");
	System.out.println("무엇을 내시겠어요?! 1.가위 2.바위 3.보");
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	int rsp = ran.nextInt(3)+1;
	System.out.println(String.format("랜덤으로 나온 수 %d", rsp));
	
	int user = scan.nextInt();
	
		switch(rsp) {
			case 1 : switch (user) {
							case 1 : System.out.println("비겼네요~") ; return;
							case 2 : System.out.println("이겼어요!!"); return;
							case 3 : System.out.println("졌어요ㅋ"); return;
			}
			case 2 : switch(user) {
							case 1 : System.out.println("졌어요ㅋ"); return;
							case 2 : System.out.println("비겼네요~"); return;
							case 3 : System.out.println("이겼어요!!"); return;
			}
			case 3 :  switch (user) {
							case 1 : System.out.println("이겼어요!!"); return;
							case 2 : System.out.println("졌어요ㅋ");  return;
							case 3 : System.out.println("비겼네요~"); return;
			}
			default : System.out.println("장난질 ㄴㄴ"); return;

	}
	}
 }