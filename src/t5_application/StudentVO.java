package t5_application;

public class StudentVO { //Value Object -> VO라고 함. 변수 관리하는 객체
	private int no;
	String name;
	int age;
	boolean gender;
	String job;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}

/* 이게 있으면 계속 복붙해서 사용할 수 있음
   Value Object -> VO라고 함. 변수 관리하는 객체. 값 저장해서 가지고다니는 객체
   Date Transfer Objevt => DTO
   데이터를 변환하면서 가지고다니는 객체
   인터넷에서 VO와 DTO차이점 알아보고 카페에 올려보기()
   
   저장 set. 자바에서는 setter
   읽기 get. 자바에서는 getter
   읽어오는애는 돌려줘야하는거라 리턴타입이 있어야 한다.
   
   //boolean 타입은 getter만들때 앞에 is가 붙음
*/