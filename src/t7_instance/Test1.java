package t7_instance;

public class Test1 {
	// 인스턴스 필드.(원래 밑에 있던 애를 위로 올림. 변수에서 필드가 됨. 전역변수가 됨)
	// double pi = 3.141592; //변수에서 필드가 됨. 전역변수가 됨\
	public double pi = Math.PI;
	
	// 인스턴스 메소드
	double cicleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
