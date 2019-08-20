package homework01;
import java.util.Scanner;

class GenderChecker{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				String ssn = "";
				System.out.println("주민번호를 - 포함해서 입력하세요!~");
				ssn = scan.next();
				String num = ssn.substring(7,8);
				switch(num) {
				case "9" : num ="1800 ~ 1899년에 태어난 남성"; break;
				case "0" : num ="1800 ~ 1899년에 태어난 여성"; break;
				case "1" : num = "1900 ~ 1999년에 태어난 남성"; break;
				case "2" : num = "1900 ~ 1999년에 태어난 여성"; break;
				case "3" : num = "2000 ~ 2099년에 태어난 남성"; break;
				case "4" : num = "2000 ~ 2099년에 태어난 여성"; break;
				case "5" : num = "1900 ~ 1999년에 태어난 외국인 남성"; break;
				case "6" : num = "1900 ~ 1999년에 태어난 외국인 여성"; break;
				case "7" : num = "2000 ~ 2099년에 태어난 외국인 남성"; break;
				case "8" : num = "2000 ~ 2099년에 태어난 외국인 여성"; break;
				default : System.out.println("다시 입력하세요."); break;
				}
				System.out.println("이 사람은 " + num + " 입니다.");
	}
}