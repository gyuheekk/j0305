package t4_method;

import java.util.Scanner;

public class Test2_3Run {
	public static void main(String[] args) {
		Test2_3 t2 = new Test2_3(); 
		int res;
		
		t2.mod1();
		res = t2.mod2(50);
		//System.out.println("res : " + res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수? ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수? ");
		int su2 = sc.nextInt();
		
		//더하기
		t2.add(su1, su2);
		
		//빼기 (sub)
		t2.sub(su1, su2);
		
		//곱하기 (mul)
		t2.mul(su1, su2);
		
		//나누기 (div)
		double res2 = t2.div(su1, su2);
		// System.out.println(su1 + " / " "+su2+" + res);
		System.out.printf("%d / %d = %.1f", su1, su2, res2);
		
		sc.close();
	}
}
