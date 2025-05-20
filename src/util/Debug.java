package util;

public class Debug {
	
	//工具類別不實例化
	private Debug() {}
	
	public static void log() {
		System.out.println("here");
	}

	public static void log(int data) {
		System.out.println(data);
	}

	public static void log(double data) {
		System.out.println(data);
	}

	public static void log(long data) {
		System.out.println(data);
	}

	public static void log(char data) {
		System.out.println(data);
	}

	public static void log(String data) {
		System.out.println(data);
	}

	public static void log(Boolean data) {
		System.out.println(data);
	}

//===================錯誤訊息印出===================

	public static void errorLog(String data) {
		System.err.println("例外： " + data);
	}

//===================陣列印出===================
	
	public static void log(int... data) {
		String output = "Array: ";
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				output = output + "[" +  data[i] + ",";
			}else if (i == data.length - 1) {
				output = output + data[i] + "]";
			}else {
				output = output + data[i] + ",";
			}
		}
		System.out.println(output);
	}

	public static void log(long... data) {
		String output = "Array: ";
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				output = output + "[" +  data[i] + ",";
			}else if (i == data.length - 1) {
				output = output + data[i] + "]";
			}else {
				output = output + data[i] + ",";
			}
		}
		System.out.println(output);
	}

	public static void log(double... data) {
		String output = "Array: ";
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				output = output + "[" +  data[i] + ",";
			}else if (i == data.length - 1) {
				output = output + data[i] + "]";
			}else {
				output = output + data[i] + ",";
			}
		}
		System.out.println(output);
	}

	public static void log(char... data) {
		String output = "Array: ";
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				output = output + "[" +  data[i] + ",";
			}else if (i == data.length - 1) {
				output = output + data[i] + "]";
			}else {
				output = output + data[i] + ",";
			}
		}
		System.out.println(output);
	}

	public static void log(String... data) {
		String output = "Array: ";
		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				output = output + "[" +  data[i] + ",";
			}else if (i == data.length - 1) {
				output = output + data[i] + "]";
			}else {
				output = output + data[i] + ",";
			}
		}
		System.out.println(output);
	}

}