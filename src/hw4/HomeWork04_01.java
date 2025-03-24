package hw4;

public class HomeWork04_01 {
	public static void main(String[] arg) {
		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		/*
		 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 (提示：陣列，length屬性)
		 */
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			sum = sum + intArray[i];
		}

		int avg = sum / intArray.length;
		String str = "";

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > avg) {
				str = str + intArray[i] + " ";
			}
		}

		System.out.println("平均值是：" + avg);
		System.out.println(str);
	}
}
