package quizans1_01;

public class main2 {

	public static void main(String[] args) {
		int isHungry = new java.util.Random() .nextInt(2);
		String food = "Orange";
		System.out.println("こんにちは");
		switch (isHungry) {
		case 0:
		System.out.println("お腹がいっぱいです");
		break;
		case 1:
			System.out.println("はらぺこです");
		System.out.println(food + "をいただきます");
		}
		
	System.out.println("ごちそうさまでした");
		
	}
	
}
