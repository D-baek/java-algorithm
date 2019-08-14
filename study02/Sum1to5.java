package study02;
// 1 + 2 + 3 + 4 + 5 +
public class Sum1to5 {
	public static void main(String[] args) {
		String eval = "";
		int sum = 0;
		for(int i=1; i<=5; i++) {
				if(i == 5) {
				eval += i + " = ";
				} else {
				eval += i + " + ";
			}
				sum += i;
				
			/**switch(i){
				case 5 : System.out.print(i + "="); break;
				default : System.out.print(i + "+");break;
			}*/
			/**if(i==5) {
				System.out.print(i + "=");
			}else{System.out.print(i + "+");}
			}*/
			/**if(i==5) {
				result += i+" =";
				}else {
					result += i + "+";
				}
			}*/
			}
		System.out.print(eval + sum);
	}
}