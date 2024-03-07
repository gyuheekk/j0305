package t3_constructor;
public class Test2 {
// 기본생성자
// 사용자 정의 생성자가 하나라도 있으면 컴파일러는 기본생성자를 만들지 않음
	Test2() {}
	
	Test2(int su1) {}
	
	Test2(int su1, int su2) {}
	
	Test2(int su1, double su2) {}
	
	Test2(Double su2, double su1) {} // 타입, 갯수, 순서에 따라 다른 생성자가 된다. 이게 오버로딩
}