package t8_static;

public class T1Run {
	public static void main(String[] args) {
		T1 t1 = new T1(); //T1 생성(힙에 생성)
		
		System.out.println("pi : " + t1.pi);
		
		double area = t1.cicleArea(10);
		System.out.println("반지름 10인 원넓이는? " + area);
		
		double area2 = T1.cicleArea(20);
		System.out.println("반지름 20인 원넓이는? " + area2);
	}
}
