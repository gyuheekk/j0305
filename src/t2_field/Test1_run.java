package t2_field;

public class Test1_run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println(t1.su1); //기본타입인 경우만 초기값을 줘야 함. 참조타입은 초기값 안줘도 됨. 
		System.out.println(t1.su2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);
		
		Test2 t2 = new Test2(); //t2와 t3는 다른 객체 (클래스만 같음) ex.길동이가 집을 102호 103호 두 개 삼
		System.out.println("t2.name : " + t2.name);
		
		Test2 t3 = new Test2();
		System.out.println("t3.name : " + t3.name);
		t3.name = "김말숙";
		System.out.println("t3.name : " + t3.name);
	}
}
