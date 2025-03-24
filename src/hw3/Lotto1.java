package hw3;

import java.util.Scanner;

//樂透可以選的數字
public class Lotto1 {

	public static void main(String[] args) {

		int input;

		Scanner sc = new Scanner(System.in);
		System.out.println("討厭什麼數字?");

		input = sc.nextInt();

//		System.out.println(input);

		int lottoNum = 1, lottoCount = 0;
		String lottoString = "";

		while (lottoNum <= 49) {
			
			if ((lottoNum % 10) != input && (lottoNum / 10) != input) {
				lottoString = lottoString + lottoNum + " ";
				lottoCount += 1;
			}
			lottoNum += 1;
		}

		System.out.println("阿文可以選擇的數字有" + "\n" + lottoString);
		System.out.println("總共有" + lottoCount + "個");

	}

}
