package Main;

import comment.Zenhan;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Zenhan.doWarusa();
		Zenhan.doTogame();
		comment.Kouhan.callDeae();
		comment.Kouhan.showMondokoro();
	}
	public static void doWarusa() {
		System.out.println("きなこでござる。食えませんがの。");
	}
	public static void doTogame() {
		System.out.println("この老いぼれの目はごまかせませんぞ。");
	}
	public static void callDeae() {
		System.out.println("ええい、こしゃくな。くせ者だ！であえい！");
	}
	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		Thread.sleep(3000);
		doTogame();
	}

}
