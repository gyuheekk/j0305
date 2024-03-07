package t4_method;

public class Test1 { //  메소드 오버로딩
	int su1;
	double su2;
	String name = "홍길동";
	
	public Test1() {}
	
	Test1(int su1) {
		this.su1 = su1;
	}
	
	void mod1() {
		
	}
		
	void mod1(int su1) {
		this.su1 = su1;
	}
	
	void mod1(int su1, double su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void mod2() {
		System.out.println("안녕하세요!");
	}
	void mod3() {
		//System.out.println(this.name + "님 안녕하세요!");
		System.out.println(name + "님 안녕하세요!");
	}
	
	void mod3(String name) {
		System.out.println(name + "님 안녕하세요!");
	}
	
	void mod4(String name) {
		System.out.println(this.name + "님 안녕하세요!");
		System.out.println(name + "님 안녕하세요!");
	}
	
	void mod5(int i) {
		System.out.println(i + ".안녕하세요!");
	}
	
	// 3의 배수가 되면 메소드 종료처리하세요.
	void mod6() {
		int i = 0;
		while(i<5) {
			i++;
			System.out.println(i + ".안녕하세요!");
			// if(i % 3 == 0) break; //해당 블럭을 빠져나감
			 if(i % 3 == 0) return; //밑부분은 수행하지 않고 끝냄
			System.out.println("작업중");
		}
		System.out.println("작업 끝~");
	}
}
