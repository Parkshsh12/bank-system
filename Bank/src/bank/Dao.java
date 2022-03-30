package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Dao {

	static Dao db = new Dao();
	
	static ArrayList<Dto> list = new ArrayList<>();
	
	static Dao getInstance() {
		return db;
	}
	
	ArrayList<Dto> arraylist() {
		return list;
	}
	
	void addArray(Dto dto) {
		list.add(dto);
	}
	
	Dto search(String accountNumber) {
		Scanner sc = new Scanner(System.in);
		Dto dt = null;
		Dto dto = new Dto();
		for(int i = 0; i < list.size(); i++) {
			dto = list.get(i);
			if(dto.getAccountNum().equals(accountNumber)) {
				System.out.print("비밀번호를 입력해주세요. :");
				int password = sc.nextInt();
				if(dto.getPassword() == password) {
					System.out.println("신원이 확인되셨습니다.");
					return dto;
				}
			}
		}
		return dt;
		
	}
}
