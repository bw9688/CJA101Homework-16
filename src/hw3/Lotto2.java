package hw3;

import java.util.Scanner;

//進階_電腦選號
public class Lotto2 {
	public static void main(String[] args) {

		int input;
		int[] lotto = new int[6];

		Scanner sc = new Scanner(System.in);
		System.out.println("討厭什麼數字?(1~9)");

		input = sc.nextInt();

//		System.out.println(input);

		// 可以選擇的數字總共有幾個
		int count = 0;

		for (int i = 1; i <= 49; i++) {
			if ((i % 10) != input && (i / 10) != input) {
				count += 1;
			}
		}

		// 把可以選的數字存進陣列
		int[] allNum = new int[count + 1];
		int index = 0;

		for (int i = 1; i <= 49; i++) {
			if ((i % 10) != input && (i / 10) != input) {

				allNum[index] = i;
//				System.out.print(allNum[index] + " ");

				index++;
			}
		}
//		System.out.println();

		// 隨機選號
		String strLotto = "";

		for (int i = 0; i < lotto.length; i++) {

			int pickRandom = allNum[(int) (Math.random() * count)];

			boolean isCheck = false;

			while (!isCheck) {
				for (int j = 0; j < lotto.length; j++) {
					if (pickRandom == lotto[j]) {
						pickRandom = allNum[(int) (Math.random() * count)];
						continue;
					}
				}
				isCheck = true;
			}

			lotto[i] = pickRandom;
			strLotto = strLotto + lotto[i] + " ";
		}
//		
//		
		System.out.println("號碼如下：" + strLotto);

//		int lottoNum = 1, lottoCount = 0;

//		String lottoString = "";
//
//		while (lottoNum <= 49) {
//
//			if ((lottoNum % 10) != input && (lottoNum / 10) != input) {
//				lottoString = lottoString + lottoNum + " ";
//				lottoCount += 1;
//			}
//			lottoNum += 1;
//		}

//		System.out.println("阿文可以選擇的數字有" + "\n" + lottoString);
//		System.out.println("總共有" + count + "個");

	}
}
