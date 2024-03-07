package t5_application;

public class StudentService {

	void print(int no, String name, int age, boolean gender, String job) {
		String genderOk = gerderCheck(gender); //타입은 지워도 됨
	
		String ageOk;
		if(ageCheck(age)) ageOk = "성인"; //메소드 호출. 이 통채로가 트루나 펄스
		else ageOk = "미성년";
		
		System.out.println("번호 :"+no+" , 성명 :"+name+" , 나이 :"+age+", 성별:"+genderOk+", 직업:"+job+", 비고:" + ageOk);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String gerderCheck(boolean gender) {
		String res = "";
		if(gender) res = "남자"; //펄스를 참으로 보겠다
		else res = "여자";
		return res;
	}
	
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;
	}
}
