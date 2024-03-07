package t9_package;

import t4_method.Calculator;
import t4_method.Test2_1;
import t4_method.Test3_1;

//import t4_method.*; 이 패키지에 있는 모든 클래스를 참조하겠다.하지만 전부 참조하게되면 엑세스 속도차가 나게 됨. 되도록이면 지정해서 임포트 걸어주는게 더 좋음

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("1. 번호 : " + t1.getNo());
		System.out.println("1. 성명 : " + t1.getName());
		
		t1.setNo(10);
		t1.setName("홍길동");
		System.out.println("2. 번호 : " + t1.getNo()); //게터 세터 만들어두고 사용하려면 t1.get누르면 됨
		System.out.println("2. 성명 : " + t1.getName());
		
		System.out.println("t8_static.T1의 PI : " + t8_static.T1.pi);
		
		
		t7_instance.Test1 t7 = new t7_instance.Test1(); 
		System.out.println("t7_instance.Test1의 PI : " + t7.pi);
		
		new Calculator(); //new+클래스명 누르고 ctrl 스페이스 하면 위에 임포트 걸림
		new Test2_1(); //단축키 컨트롤 쉬프트 오
		new Test3_1();
	}
}
