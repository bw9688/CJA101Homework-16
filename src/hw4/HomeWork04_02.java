package hw4;

import java.util.Scanner;

public class HomeWork04_02 {
	public static void main(String[] args) {
		String str = "今天放假而且天氣很好適合出去玩，但我現在在家裡寫作業，因為我的作業快要寫不完了哇";
		// 請建立一個字串，經過程式執行後，輸入結果是反過來的
		// 例如String s = “Hello World”,執行結果即為dlroW olleH
		// (提示：String方法，陣列)

		char[] strChar = str.toCharArray();
		char[] resultChar = new char[strChar.length];

		int index = strChar.length - 1; // index 只在運算過程中使用，通常做為索引值

		for (int i = 0; i < strChar.length; i++) {
			resultChar[index] = strChar[i];
			index = index - 1;
		}

		String resultStr = new String(resultChar);

		System.out.println(resultStr);

//		  • 有個字串陣列如下(八大行星)：
//		 {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		 (提示：字元比對，String方法)

		String[] planets = new String[] { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus",
				"neptune" };
		int count = 0; //count只在運算過程中使用，通常做為計算次數用

		for (index = 0; index < planets.length; index++) {
			char[] c = planets[index].toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
					count++;
				}
			}
		}

		System.out.println("這陣列裡面共有" + count + "個母音");

//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共3 人!」
//		(提示：Scanner，二維陣列)

		// 
		Empolyee[] empArr = new Empolyee[5];

		empArr[0] = new Empolyee(25, 2500);
		empArr[1] = new Empolyee(32, 800);
		empArr[2] = new Empolyee(8, 500);
		empArr[3] = new Empolyee(19, 1000);
		empArr[4] = new Empolyee(27, 1200);

		System.out.println("請輸入要借的金額");
		Scanner sc = new Scanner(System.in);
		int borrowM = sc.nextInt();
		
		// 因為換下一題，重設呈現結果用的字串跟計算用的數字
		resultStr = "";
		count = 0;

		for (int i = 0; i < empArr.length; i++) {
			if (empArr[i].getMoney() >= borrowM) {
				resultStr = resultStr + empArr[i].getEmpNo() + " ";
				count++;
			}
		}

		System.out.println("有錢可借的員工編號: " + resultStr + "共" + count + "人");

//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		 (提示1：Scanner，陣列)
//		 (提示2：需將閏年條件加入)
//		 (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		System.out.println("請輸入年、月、日");

		int years = sc.nextInt();
		int inputMounth = sc.nextInt();
		
		// 所有月份的天數 1月31天、2月28天等等
		int[] mounths = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 如果是閏年，2月有29天
		if (years % 4 == 0) {
			mounths[1] = 29;
		}
		
		//月份數字與檢查
		while (inputMounth > 12 || inputMounth < 0) {
			System.out.println("請重新輸入1~12之間的數字代表月份");
			inputMounth = sc.nextInt();
		}

		//日期數字與檢查
		int day = sc.nextInt();
		count = 0;

		while (day > mounths[inputMounth - 1] || day < 0) {
			if (inputMounth == 2) {
				System.out.println("2月只有" + mounths[1] + "天");
			}
//			System.out.println("請重新輸入日期");
			System.out.printf("請輸入1~%d之間的數字代表日期", mounths[inputMounth - 1]);
			System.out.println();
			day = sc.nextInt();
		}

		// 計算為該年第幾天
		for (index = 0; index < inputMounth - 1; index++) {
			count = count + mounths[index];
		}
		count += day;

		System.out.println("輸入的日期為該年第" + count + "天");

//		• 班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)

		//小考成績建成二維陣列
		int[][] scores = new int[6][8];

		scores[0] = new int[] { 10, 35, 40, 100, 90, 85, 75, 70 };
		scores[1] = new int[] { 37, 75, 77, 89, 64, 75, 70, 95 };
		scores[2] = new int[] { 100, 70, 79, 90, 75, 70, 79, 90 };
		scores[3] = new int[] { 77, 95, 70, 89, 60, 75, 85, 89 };
		scores[4] = new int[] { 98, 70, 89, 90, 75, 90, 89, 90 };
		scores[5] = new int[] { 90, 80, 100, 75, 50, 20, 99, 75 };


		int[] countHighestScore = new int[8];	// 每位學生考最高分的次數

		// 在每次小考中找出考最高分的學生並記錄考最高分的次數
		for (int c = 0; c < scores.length; c++) {
			int highestScore = 0;
			// 找出本次小考最高分
			for (index = 0; index < scores[c].length; index++) {
				if (highestScore <= scores[c][index]) {
					highestScore = scores[c][index];
				}
			}
			// 找出符合最高分者並記數(可能不只一人)
			for (index = 0; index < scores[c].length; index++) {
				if (scores[c][index] == highestScore) {
					countHighestScore[index] += 1;
				}
			}
		}
		
		for (int i = 0; i < countHighestScore.length; i++) {
			System.out.printf("第%d位學生考了%d次最高分 ", (i + 1), countHighestScore[i]);

		}

	}
}
