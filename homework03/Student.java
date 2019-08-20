package homework03;

public class Student {
	public String getArithmeticCalc(int start,int op, int end) {
		
		String eval = "";
		
		if(op==1) {
			eval += (start +end);
			} else if(op==2){
			eval += (start - end);
			} else if(op==3){
			eval += (start * end);
			} else if(op==4){
			if(start / end !=0) {
				eval = start/end + "[" + start%end + "]";
				}else eval += start / end ;
		}
		return String.format(eval);
	}
	public String getBmi(String name,double kg, double h) {
		double h1 = h*0.01; 
		double bmi = kg / (h1*h1) ;
		String eval = "";
		
		if(bmi>30.0) {		eval = "고도비만";	
		}else if(bmi>25.0) {	eval = "비만";		
		}else if(bmi>23.0) {	eval = "과체중";		
		}else if(bmi>18.5){eval = "정상";
		}else {		eval = "저체중";
		}
		
		String result = String.format("%s님의 bmi는 %.2f이고 %s입니다.",name,bmi,eval);
		return result;
		
	}
	public String getTimecalc(int num) {
		int min, hour, sec = num;
		
		hour = (num/60) / 60;
		min  = (num / 60) % 60;
		sec   = num % 60;
		
		return String.format("%d시간 %d분 %d초 ", hour, min , sec);
	}						
	public String getTax(String name1,int income) {
		double taxRate = 0.097;
		double tax = income*taxRate;
		return String.format("연봉 %d 만원을 받으시는 %s님께서 납부할 세금은 %s 만원입니다.", income ,name1, tax );
		//return  "";
	}
	
}