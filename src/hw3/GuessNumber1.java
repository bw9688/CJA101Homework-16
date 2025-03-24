package hw3;

import java.util.Scanner;

//猜數字
public class GuessNumber1 {

	public static void main(String[] args) {

		int i, input = 0;
		i = (int) (Math.random() * 9) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字(1~9)");

		input = sc.nextInt();

		while (input != i) {
			System.out.println("錯了ㄟ");
			input = sc.nextInt();
		}

		System.out.println("答對了！ 答案就是" + i);

	}

}
