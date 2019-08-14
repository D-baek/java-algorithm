package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + 4 + 5 +
		for(int i=1; i<=10; i++) {
			/*switch(i){
				case 10 : System.out.print(i + "="); break;
				default : System.out.print(i + "+");break;
			}*/
			if(i==10) {
				System.out.print(i + "=");
			}else{System.out.print(i + "+");}
			}
	}
}	