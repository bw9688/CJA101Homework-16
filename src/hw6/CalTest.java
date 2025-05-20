package hw6;

import java.util.Scanner;

import util.Debug;

/*
 *  請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
	方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。
	CalTest.java執行後，使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
		1. x與y同時為0，(產生自訂的CalException例外物件)
		2. y為負值，而導致x的y次方結果不為整數
		3. x與y皆正確情況下，會顯示運算後結果
 */

public class CalTest {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		CalTest calTest = new CalTest();

		Scanner sc = new Scanner(System.in);
		boolean isOk;

		do {

			isOk = false;

			int inputX, inputY;

			System.out.println("請輸入x的值");

			calTest.checkInput(sc);

			inputX = sc.nextInt();

			System.out.println("請輸入y的值");

			calTest.checkInput(sc);

			inputY = sc.nextInt();

			try {
				
				String string = inputX + "的" + inputY + "次方等於" + (int) c1.powerXY(inputX, inputY);
				System.out.println(string);

				isOk = true;
				
			} catch (CalException e) {
				
				System.out.println(e.getMessage());
				Debug.log("請重新輸入");
				
			}

		} while (!isOk);

	}

	private void checkInput(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.println("輸入格式不正確耶");
			sc.next();
			continue;
		}
	}

}
