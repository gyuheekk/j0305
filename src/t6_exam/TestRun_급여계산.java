package t6_exam;

import java.util.Scanner;

/*
   사원코드(no), 사원명(name), 직급ㄴ코드(code), 초과시간(overtime)을 입력받아서 실수령액(netpay)을 계산하시오.
   직급(사원코드)코드 : 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
   1시간당 초과수당(sudang)은 25000원입니다.
   공제액(gongje)은 (본봉(bonbong)+초과수당)의 10%로 한다.
   본봉 : 부장 :5000000, 과장 :4000000, 대리 :3000000, 사원 :2000000
   실수령액 = 본봉 + 수당 - 공제액
   계산부는 비즈니스 로직으로 처리(서비스객체를 사용)
 */
public class TestRun_급여계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test_SalaryVO vo = new Test_SalaryVO();
		Test_SalaryService service = new Test_SalaryService();
		
		System.out.print("사원코드를 입력하세요? ");
		vo.setNo(sc.nextInt());
		System.out.print("사원명을 입력하세요? ");
		vo.setName(sc.next());
		System.out.print("직급코드를 입력하세요? ");
		vo.setCode(sc.next());
		service.print1(vo);
		System.out.print("초과시간을 입력하세요? ");
		vo.setOvertime(sc.nextInt());
		
		service.print(vo);
		
		sc.close();
	}
}
