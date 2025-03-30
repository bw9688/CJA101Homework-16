package hw5;


public class Homework05_Method {
//	請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：
	public void starSquare(int width, int height) {
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖

	public void randAvg() {
		int[] randomNums = new int[10];
		int avg = 0;
		String string = "";
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = (int) (Math.random() * 101);
			avg += randomNums[i];
			string = string + randomNums[i] + " ";
		}
		avg = avg / 10;
		System.out.println("本次亂數結果為：\n" + string + "\n平均為 " + avg);
	}

//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳，如圖

	public int maxElement(int x[][]) {
		int highestScore = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (highestScore <= x[i][j]) {
					highestScore = x[i][j];
				}
			}
		}
		return highestScore;
	}
	
	public double maxElement(double x[][]) {
		double highestScore = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (highestScore <= x[i][j]) {
					highestScore = x[i][j];
				}
			}
		}
		return highestScore;
	}

//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合，如圖：
	
	public String genAuthCode() {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] charArray = str.toCharArray();
		String resultStr = "";
		
		for(int length = 0; length <= 8; length++) {
			int index = (int)(Math.random() * charArray.length);
			resultStr = resultStr + charArray[index];
		}
		return resultStr;
	}
	
}
