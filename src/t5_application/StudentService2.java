package t5_application;

public class StudentService2 {
	
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

	public void print(StudentVO vo) {
		String genderOk = gerderCheck(vo.isGender()); 
		String ageOk;
		if(ageCheck(vo.getAge())) ageOk = "성인"; 
		else ageOk = "미성년";
		
		System.out.println("번호 :"+vo.getNo()+" , 성명 :"+vo.getName()+" , 나이 :"+vo.getAge()+", 성별:"+genderOk+", 직업:"+vo.getJob()+", 비고:" + ageOk);
	}
}

