package bank;

import java.util.Random;
import java.util.Scanner;

public class Input_Infor {

	String name;
	String accountNum = "140";
	int password;
	int money;
	Scanner sc = new Scanner(System.in);
	Scanner ss = new Scanner(System.in);
	Dto dto = new Dto();
	Dao dao = Dao.getInstance();
	Random rd = new Random();
	
	void input() {
		dao.arraylist();
		System.out.print("이름을 입력해주세요. : ");
		name = sc.nextLine();
		dto.setName(name);
		System.out.println("비밀번호 4자리를 입력해주세요 : ");
		password = ss.nextInt();
		dto.setPassword(password);
		for(int i = 0; i < 10; i++) {
			accountNum += String.valueOf(rd.nextInt(10));
		}
		dto.setAccountNum(accountNum);
		System.out.println("계좌번호는 " + dto.getAccountNum() + " 입니다.");
		money = 0;
		dto.setMoney(money);
		dao.addArray(dto);
	}
}
