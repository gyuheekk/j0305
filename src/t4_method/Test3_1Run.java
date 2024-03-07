package t4_method;

public class Test3_1Run {
	public static void main(String[] args) {
		
		int[] su = {90,80,100,70,60,}; // 정수를 쭉 담고있는 배열
		
		Test3_1 t3 = new Test3_1();
		
		int res = t3.hap(su);
		System.out.println("총합 : " + res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : " + res);
		
		res = t3.hap(new int[] {1,2,3,4,5}); //배열 생성
		System.out.println("총합3 : " + res);
		
		res = t3.sum(new int[] {1,2,3,4,5}); //배열 생성
		System.out.println("총합4 : " + res);
		
		// res = t3.hap({1,2,3,4,5}); // (x)
		// res = t3.hap(1,2,3,4,5); // (x)
		res = t3.sum(1,2,3,4,5); // (o)
		System.out.println("총합5 : " + res);
	}
}
