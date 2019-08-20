package study04;

public class Member {
		private String name, ID,pwd, ssn, bld;
		private double tall, weight ;
		private int kor, eng, math, income;
		
		public void setName(String name) {
			this.name = name;
		}
			public String getName() {
				return this.name;
			}
		public void setID(String ID) {
			this.ID = ID;
		}
		public String getID() {
			return this.ID;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getPwd() {
			return this.pwd;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getSsn() {
			return this.ssn;
		}
		public void setBld(String bld) {
			this.bld = bld;
		}
		public String getBld() {
			return this.bld;
		}
		public void setTall(double tall) {
			this.tall = tall;
		}
		public double getTall() {
			return this.tall;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getWeight() {
			return this.weight;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getKor() {
			return this.kor;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getEng() {
			return this.eng;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getMath() {
			return this.math;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public int getIncome() {
			return this.income;
		}

			

		
		@Override
		public String toString() {
			return String.format("회원정보: \n"
					+ "이름 : %s \n"
					+ "아이디 : %s \n"
					+ "비밀번호 : %s \n"
					+ "주민번호 : %s \n"
					+ "혈액형 : %s \n"
					+ "키 : %.1f \n"
					+ "몸무게 : %.1f \n"
					+ "국어점수 : %d \n"
					+ "영어점수 : %d \n"
					+ "수학점수 : %d \n"
					+ "연봉 : %d \n" , name, ID, pwd, ssn, bld, tall, weight, kor, eng, math, income);
		}
}
