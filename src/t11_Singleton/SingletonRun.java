package t11_Singleton;

public class SingletonRun {
	public static void main(String[] args) {
		// new Singleton(); 프라이빗이 붙어있어서 생성 안 됨
		
		Singleton.getInstance();
	}
}
