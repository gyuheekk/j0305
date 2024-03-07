package t6_exam;

import java.util.Scanner;

public class Test_SalaryService {
	int hap;
	String position;
	
	public void print1(Test_SalaryVO vo) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String code = vo.getCode().toUpperCase();
			
			if(!code.equals("B") && !code.equals("K") && !code.equals("D") && !code.equals("s")) {
				System.out.println("B, K, D, S 중에서만 입력하세요. ");
				System.out.print("직급코드를 입력하세요? (부장:B, 과장:K, 대리:D, 사원:S)");
				vo.setCode(sc.next());
			}
			else break;
		}
		// sc.close();
	}
		
		public void print(Test_SalaryVO vo) {
			String code = vo.getCode().toUpperCase();
			
			if(code.equals("B")) {
				position = "부장";
				vo.setBonbong(5000000);
			}
			else if(code.equals("K")) {
				position = "과장";
				vo.setBonbong(4000000);
			}
			else if(code.equals("D")) {
				position = "대리";
				vo.setBonbong(3000000);
			}
			else if(code.equals("S")) {
				position = "사원";
				vo.setBonbong(2000000);
			}
			else {
				vo.setPosition("비사원");
				vo.setBonbong(0);
			}
			hap = vo.getBonbong() + (vo.getOvertime()*25000);
			
			int gongje = vo.getGongje();
			gongje = (int)(hap * 0.1);
			int netpay = hap - gongje;
			
			System.out.println(vo.getNo() + "번 "+vo.getName()+" " + position + "님의 실수령액은 "+netpay+"원 입니다. ");
	}
}