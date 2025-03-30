package hw5;

import java.util.Scanner;

public class TestHomework05 {

	public static void main(String args[]) {
		Homework05_Method h5m = new Homework05_Method();

		// 第一題
		System.out.println("請輸入寬與高");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		h5m.starSquare(width, height);

		// 第二題
		h5m.randAvg();

		// 第三題
		int[][] intAttay = { 
					{ 1, 6, 3 }, 
					{ 9, 5, 2 } 
				};

		double[][] doubleArray = { 
					{ 1.2, 3.5, 2.2 }, 
					{ 7.4, 2.1, 8.2 } 
				};
		
		System.out.println(h5m.maxElement(intAttay));
		System.out.println(h5m.maxElement(doubleArray));
		
		// 第五題
		System.out.println(h5m.genAuthCode());
		
	}
}
