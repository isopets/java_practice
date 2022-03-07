package quizans14_01;

public class Account {
	String accountNumber;
	int balance;

	//①文字列表現のメソッド
	public String toString() {
		return "\\" + this.balance + "(口座番号: "+ this.accountNumber + ")";
	}
	public boolean equals(Object o) {

	}

}
