package t4_method;

public class Test2_1 {
	void mod1() {
		System.out.println("안녕");
	}
	
	int mod2(int su1) { //여기서 su1은 매개변수
		// return 10; ->리턴값
		return su1; //리턴밸류
	}
		
	int mod1(int su1) { 
		return su1; 
	}
	
	int add(int su1, int su2) { 
		return su1 + su2; 
	}
	
	//빼기 (sub)
	int sub(int su1, int su2) {
		return su1 - su2;
	}
	
	//곱하기 (mul)
	int mul(int su1, int su2) {
		return su1 * su2;
	}
	
	//나누기 (div)
	double div(int su1, int su2) {
		return (double)su1 / su2;
	}
	
}
