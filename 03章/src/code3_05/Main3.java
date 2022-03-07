package code3_05;

public class Main3 {
	public static void main(String[]args) {
		System.out.println("重さ（kg）を入力してください");
		int kg = new java.util.Scanner(System.in) .nextInt();
		if (kg <= 0){
			System.out.println("正しい値を入力してください");
		} else if (kg < 5) {
			System.out.println("送料は1,000円");
		} else if (kg < 10){
			System.out.println("送料は1,500円");
		} else if (kg < 30){
			System.out.println("送料は2,000円");
		} else if (kg >= 30){
			System.out.println("送料は3,000円");
		}
	}
}
