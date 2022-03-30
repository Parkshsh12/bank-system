package bank;

import java.util.Scanner;

public class Recive_Pay {

	Dto dt;
	void recive(String accountNumber) {
		dt = new Dto();
		Dao dao = Dao.getInstance();
		Scanner sc = new Scanner(System.in);
		dt = dao.search(accountNumber);
		
		System.out.println("입금하실 금액을 입력하세요.");
		int recive = sc.nextInt();
		int money = dt.getMoney()+recive;
		dt.setMoney(money);
		System.out.println(recive+"원이 입금되셨습니다. 현재 잔액은 " + dt.getMoney()+"원 입니다.");
	}
	
	void pay(String accountNumber) {
		dt = new Dto();
		Dao dao = Dao.getInstance();
		Scanner sc = new Scanner(System.in);
		dt = dao.search(accountNumber);
		int pay;
		while(true) {
			System.out.println("출금하실 금액을 입력하세요.");
			pay = sc.nextInt();
			if(dt.getMoney() < pay) {
				System.out.println("잔액이 부족합니다.");
				continue;
			}
			else {
				int money = dt.getMoney() - pay;
				dt.setMoney(money);
				break;
			}
		}
		System.out.printf("%d원이 출금되셨습니다. 현재 잔액은 %d원 입니다.\n",pay,dt.getMoney());
	}
	
	void e_Che(String name) {
		dt = new Dto();
		Dto dto2 = new Dto();
		Dao dao = Dao.getInstance();
		dt = dao.search(name);
		
	}
}
