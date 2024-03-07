package t1_class;

public class Test4 { 
	public static void main(String[] args) { // 메인메소드만이 jvm과 약속된 메소드
		Test1 t1 = new Test1(); 
		Test1 t2 = new Test1(); //같은 설계도로 2개를 만듦. 같은 설계도로 만들었을 뿐이지 완전히 다른 객체(처음에는 같음)
		
		if(t1 == t2) {
			System.out.println("t1객체와 t2객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t2객체는 서로 다른 객체입니다.");
		}
		
		Test1 t3; //무조건 타입이 있어야 함
		t3 = t1;  // 얕은복사
		if(t1 == t3) {
			System.out.println("t1객체와 t3객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t3객체는 서로 다른 객체입니다.");
		}
		
		Test1 t4 = null; //객체에는 초기값 null을 중 수 있다
		if(t1 == t4) {
			System.out.println("t1객체와 t4객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t4객체는 서로 다른 객체입니다.");
		}
		
		if(t4 == null) {
			System.out.println("t4는 null입니다.");
		}
		else {
			System.out.println("t4는 null이 아닙니다.");
		}
		
	// null비교시는 '== / !='로 비교해야 한다. .equals이 아닌 ==으로 비교해야 한다. 
	//아무것도 없는것과는 비교할 수 없음. 컴파일에서는 오류가 안 나도, 실행오류가 발생
//		if(t4.equals(null)) {                          // 아무것도 없는것과는 비교할 수 없음. 컴파일에서는 오류가 안 나도, 실행시 오류가 남
//			System.out.println("t4는 null입니다.");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다.");
//		}
	}
}
