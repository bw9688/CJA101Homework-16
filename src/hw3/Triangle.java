package hw3;

import java.util.Arrays;
import java.util.Scanner;

//計算是否為三角形、是什麼樣的三角形
public class Triangle {

	public static void main(String[] args) {
		int input, count = 0;

		int[] num = new int[3];

		Scanner sc = new Scanner(System.in);
		String str = "";

		System.out.println("請在下方輸入3個10000以內的數字，可以用空白分隔");

		while (count < num.length) {

			if (!sc.hasNextInt()) {
				System.out.println("輸入的不是數字耶，重新輸入好嗎？");
				sc.next();
				continue; // 下一次迴圈
			}

			input = sc.nextInt();

			if (input <= 10000) {

				str = str + input + " ";
				num[count] = input;

				count++;

			} else {
				System.out.println("數字太大啦請重新輸入"); // 繼續迴圈
			}

		}

//		System.out.println("輸入的數字分別是" + num[0] + " " + num[1] + " " + num[2]);

		Arrays.sort(num); // 排序完num[0]為最小值、num[2]為最大值(三角形長邊)

		if (num[2] > (num[0] + num[1]) || num[0] < 0) {
			System.out.println("這不是三角形");
		} else if (num[0] == num[1] && num[1] == num[2]) {
			System.out.println("正三角形"); // 三邊相等
		} else if (num[0] == num[1]) {
			System.out.println("等腰三角形"); // 短邊相等
		} else if ((Math.pow(num[0], 2) + Math.pow(num[1], 2)) == Math.pow(num[2], 2)) {
			System.out.println("直角三角形"); // 畢氏定理
		} else {
			System.out.println("其他三角形");
		}

	}

}
