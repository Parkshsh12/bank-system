package bank;

import java.util.Scanner;

public class Bank_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		boolean flag = true;
		String num;
		Recive_Pay rp = new Recive_Pay();;
		
		System.out.println("안녕하세요. **은행입니다.");
		while(flag) {
			System.out.println("1. 고객등록 / 2. 입금 / 3. 출금 / 4. 계좌이체 / 5. 잔액조회 / 6. 프로그램 종료");
			int select = sc.nextInt();
			switch(select) {
				case 1:
					Input_Infor information = new Input_Infor();
					information.input();
					break;
					
				case 2:
					System.out.println("계좌번호를 입력하시오.");
					num = ss.nextLine();
					rp.recive(num);
					break;
					
				case 3:
					System.out.println("계좌번호를 입력하시오.");
					num = ss.nextLine();
					rp.pay(num);
					break;
					
				case 4:
					System.out.println("계좌번호를 입력하시오.");
					num = ss.nextLine();
					rp.pay(num);
					break;
					
				case 5:
					System.out.println("계좌번호를 입력하시오.");
					num = ss.nextLine();
					rp.pay(num);
					break;
					
				case 6:
					System.out.println("서비스를 종료하겠습니다.");
					flag = false;
					break;
					
				default :
					System.out.println("다시 선택해주세요.");
					continue;
			
			}
		}
		
		
	}

}
