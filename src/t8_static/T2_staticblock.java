package t8_static;

public class T2_staticblock {
	int field1;
	static int field2;
	
	void method1() {}
	static void method2() {} //정적 메소드
	
	// 정적블록
	static {
		
		field2 = 200;
		method2();
		
		// field1 = 100;
		// method1
	}
}
