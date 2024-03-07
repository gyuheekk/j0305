package t2_field;

public class Test_val {
	int su3 = 10; 
	public void atom() { //void는 메소드에만 적을 수 있음. 메소드에는 괄호가 존재
		int su1 = 100;
		
		for(int i=0; i<5; i++) {
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}
		
		su3 += su1; // 메인메소드의 static때문
		System.out.println("su3 : " + su3);
	}
}
