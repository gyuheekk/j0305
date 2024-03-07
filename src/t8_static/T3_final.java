package t8_static;

public class T3_final {
	final String nation = "Korea"; // 값 고정
	String jumin;
	String name;
	
	public T3_final() {}
		
//	T3_final(String nation) {
//		this.nation = nation;
//	}
	
	T3_final(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
}
