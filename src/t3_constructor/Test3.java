package t3_constructor;
public class Test3 {
// 기본생성자
// 사용자 정의 생성자가 하나라도 있으면 컴파일러는 기본생성자를 만들지 않음
	Test3() {} //#1
	
	int atom = 30; //아톰필드.전역변수
	int atom2;
	double atom3;
	
	Test3(int su1) { //#2
		System.out.println("su1 : " + su1);
	} 
	
	Test3(int su1, int su2) { // #3.프로그래머는 이렇게 절대 하지 않음
		atom = su1;
		atom2 = su2;
	} 
		
	
	Test3(int atom, double atom3) { //#4
		this.atom = atom;
		this.atom3 = atom3;
	}
	
	Test3(Double su2, double su1) {} // 타입, 갯수, 순서에 따라 다른 생성자가 된다. 이게 오버로딩
	
	// Test2(int atom1, int atom2) {} 변수명과는 관계가 없기 때문에 9번 라인과 같아서 생성될 수 없음
}