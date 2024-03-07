package t4_method;

import java.util.Scanner;

public class Test2_2Run {
	public static void main(String[] args) {
		Test2_2 t2 = new Test2_2(); 
		int res;
		
		t2.mod1();
		res = t2.mod2(50);
		System.out.println("res : " + res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수? ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수? ");
		int su2 = sc.nextInt();
		
		//더하기
		res = t2.add(su1, su2);
		t2.prn(su1, su2, res, "+"); //앞에 t2를 쓴 이유는 prn객체가 어디있는지를 불러온 것
		
		//빼기 (sub)
		res = t2.sub(su1, su2);
		t2.prn(su1, su2, res, "-");
		
		//곱하기 (mul)
		res = t2.mul(su1, su2);
		t2.prn(su1, su2, res, "*");
		
		//나누기 (div)
		double res2 = t2.div(su1, su2);
		// System.out.println(su1 + " / " "+su2+" + res);
		System.out.printf("%d / %d = %.1f", su1, su2, res2);
		
		sc.close();
	}
}
