package t8_static;

public class T1 {
	// 인스턴스 필드.(원래 밑에 있던 애를 위로 올림. 변수에서 필드가 됨. 전역변수가 됨)
	// double pi = 3.141592; //변수에서 필드가 됨. 전역변수가 됨\
	
	// 정적 필드 (메소드 영역에 올라감.이젠 객체 생성하지 않고, 클래스 이름으로 불러서 사용)
	public static double pi = Math.PI;
	
	// 인스턴스 메소드
	static double cicleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
