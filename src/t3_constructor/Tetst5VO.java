package t3_constructor;

public class Tetst5VO {
	private String name;
	private String mid;
	private String password;
	private int age;
	private boolean gender;
	private String address;

	public Tetst5VO() {} //기본생성자
	
	public Tetst5VO(String name, String mid, String password, int age, boolean gender, String address) { // 생성자
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	} //이걸 만들었을때 단점. 기본생성자가 없음. 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
