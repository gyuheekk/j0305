package t6_exam;

public class Test_format {
	public static void main(String[] args) {
		int su = 1234000;
		double su2 = 1234000.123;
		String su3 = "1234000";
		System.out.printf("금액 : %,d\n", su);
		System.out.printf("금액 : %,10d\n", su);
		System.out.printf("금액 : %,15.2f\n", su2);
		System.out.println(String.format("%,15d", su));
		System.out.println(String.format("%,15d", Integer.parseInt(su3)));
	}
}
