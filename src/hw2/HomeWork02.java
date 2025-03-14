package hw2;

import java.util.Iterator;

public class HomeWork02 {

	public static void main(String[] arg) {

//		 • 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)

		int sum = 0;

		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}

		System.out.println("1～1000的偶數和: " + sum);

//		 • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)

		int productForLoop = 1;

		for (int i = 1; i <= 10; i++) {
			productForLoop = productForLoop * i;
		}

		System.out.println("用for迴圈算1～10的連乘積: " + productForLoop);

//		 • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)

		int num = 1, productWhileLoop = 1;

		while (num <= 10) {
			productWhileLoop *= num;
			num++;
		}

		System.out.println("用while迴圈算1～10的連乘積: " + productWhileLoop);

//		 • 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
//		 3 5 7  9  11 13 15 17 19   彼此的間隔

		String str1 = "";

		int num2 = 1;

		str1 += num2;

		for (int numAdd = 3; num2 < 100; numAdd += 2) {
			num2 = num2 + numAdd;
			str1 = str1 + " " + num2;
		}

		System.out.println(str1);
		System.out.println("-------------------");

//		• 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		int lottoNum = 1, lottoCount = 0;
		String lottoString = "";

		while (lottoNum <= 49) {
			if ((lottoNum % 10) != 4 && (lottoNum / 10) != 4) {
				lottoString = lottoString + lottoNum + " ";
				lottoCount += 1;
			}
			lottoNum += 1;
		}

		System.out.println("阿文可以選擇的數字有" + lottoString);
		System.out.println("總共有" + lottoCount + "個");
		System.out.println("-------------------");

//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
		// 10 橫列 10 個數字(行)

		for (int row = 0; row < 10; row++) {
			String str2 = "";
			for (int column = 1; column <= 10 - row; column++) {
				str2 = str2 + column + " ";
			}
			System.out.println(str2);
		}

		System.out.println("-------------------");

//		• 請設計一隻Java程式，輸出結果為以下：
//		 A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF
		// 6 橫列 6 個字母(行)
		

		for (int row = 1; row <= 6; row++) {
			String letter = "";

			switch (row) {
				case 1: {
					letter = "A";
					break;
				}
				case 2: {
					letter = "B";
					break;
				}
				case 3: {
					letter = "C";
					break;
				}
				case 4: {
					letter = "D";
					break;
				}
				case 5: {
					letter = "E";
					break;
				}
				case 6: {
					letter = "f";
					break;
				}
			}
			
			String letterRow = "";
			
			for(int column = 1; column <= row; column++) {
				
				letterRow += letter;
				
			}
			
			System.out.println(letterRow);
		}
		
		System.out.println("-------------------");

//		可輸出九九乘法表 
//		• 一：使用for迴圈+ while迴圈
		
		System.out.println("for迴圈+ while迴圈");

		for (int i = 1; i <= 9; i++) {

			int j = 1;

			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println("for迴圈+ do while迴圈 ");

		for (int i = 1; i <= 9; i++) {

			int j = 1;

			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
		}

		System.out.println("while迴圈+ do while迴圈 ");
//
//		• 三：使用while迴圈+ do while迴圈 

		int i = 1, j = 1;

		while (i <= 9) {

			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
			i += 1;
			j = 1;
		}

		
	}

}
