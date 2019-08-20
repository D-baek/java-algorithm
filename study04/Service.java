package study04;

public class Service {
	public String getBMI(Member member) {
		String name = member.getName();
		double height = member.getTall();
		double weight = member.getWeight();
		double bmi = weight / (height * height / 10000);
		String eval = "";
		
		if(bmi > 30.0) {
			eval ="고도비만";
		}else if(bmi > 25.0 && bmi <= 30.0) {
			eval = "비만";
		}else if(bmi > 23.0 && bmi <= 25.0) {
			eval = "과체중";
		}else if(bmi > 18.5) {
			eval = "정상";
		}else if(bmi <= 18.5) {
			eval = "저체중";
			
		}
		return String.format("%s 님의 BMI지수는 %.1f 이고 %s 입니다." , member.getName(),bmi, eval);
}
	
	
	public String getReportcard(Member member) {
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int total = kor + eng + math;
		int average = total / 3;
		String grade = "";
		if(average >= 90) {
			grade = "(장학생)";
		}else if(average >= 70) {
			grade = "(합격)";
		}else {
			grade = "(불합격)";
		}
		String[] menu = new String[7];
		menu[0] = "이름";
		menu[1] = "국어";
		menu[2] = "영어";
		menu[3] = "수학";
		menu[4] = "총점";
		menu[5] = "평균";
		menu[6] = "합격여부";
		
		for(int i = 0; i < menu.length; i++) {
		
			System.out.print(menu[i] + "     ");
		}
		
		System.out.println("\n=================================\n");
		return String.format(member.getName() + "    " +member.getKor()+ "    " +member.getEng()+ "    " +member.getMath()+ "    " 
				+ total + "    " + average + "    " + grade);
	}
		
	public String getTax(Member member) {
		int income = member.getIncome();
		String name = member.getName();
		double taxRate = 0.097;
		double tax = income*taxRate;

		return String.format("연봉 %d 만원을 받으시는 %s님께서 납부할 세금은 %s 만원입니다.", member.getIncome(), member.getName(), tax);		

	}
}
