package hw3;

import java.util.Scanner;

//進階猜數字
public class GuessNumber2 {
	public static void main(String[] args) {

		int i, input = 0;
		i = (int) (Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字(0~100)");

		input = sc.nextInt();

		while (input != i) {
			if(input > i) {
				System.out.println("數字太大了");
			}else {
				System.out.println("數字太小了");
			}
			input = sc.nextInt();
		}

		System.out.println("答對了！ 答案就是" + i);

	}

}
