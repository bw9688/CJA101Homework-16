package hw1;

import javax.sql.rowset.JoinRowSet;

public class HomeWork01 {

	public static void main(String[] arg) {
//		請設計一隻Java程式，計算12，6這兩個數值的和與積

		int sum = 12 + 6;
		System.out.println("和" + sum);

		System.out.println("積" + (12 * 6));

		System.out.println("-------------------");

//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)

		int eggs = 200;

//		int dozenEggs = eggs / 12, lefteggs = eggs % 12;
//		int lefteggs = eggs % 12;
		System.out.println((eggs / 12) + "打" + (eggs % 12) + "顆"); // 16打8顆

		System.out.println("-------------------");

//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒

		int days = 256559 / 86400;
		int hours = (256559 % 86400) / 3600;
		int mins = ((256559 % 86400) % 3600) / 60;
		int sec = (((256559 % 86400) % 3600) % 60);

		System.out.println(days + "天" + hours + "時" + mins + "分" + sec + "秒"); // 2天23時15分59秒

		System.out.println("-------------------");

//		請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

		final float PI = 3.1415f;

		int radius = 5;

		float circumference = radius * 2 * PI;

		float area = radius * radius * PI;

		System.out.println("半徑為" + radius + "的圓面積為" + area);
		System.out.println("半徑為" + radius + "的圓周長為" + circumference);

		System.out.println("-------------------");

//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
//		FV ＝ PV×（1 ＋ R）n 次方 
//		期末本利和＝期初本金×（1＋利率）期數次方

		double money = 150_0000;

		money = money * Math.pow((1 + 0.02), 10);

		System.out.printf("%.0f", money);
		System.out.print("元");

		System.out.println();
		System.out.println("-------------------");

//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因

		System.out.println(5 + 5); // 兩數字相加
		System.out.println(5 + '5'); // 數字5與「5」這個字元的編碼數字，兩者相加，是數字58
		System.out.println(5 + "5"); // 數字5與「5」這個字串串接，變成字串55

	}
}
