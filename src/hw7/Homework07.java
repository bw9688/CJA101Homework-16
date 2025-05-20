package hw7;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

import util.Debug;

/*
 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
 * Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
 * 
 * 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
 * append功能讓每次執行結果都能被保存起來
 * 
 * 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
 * 代表的檔案會複製到第二個參數代表的檔案
 * 
 * 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
 * 意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
 * 
 * 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
 * 型簡化本題的程式設計)
 */

public class Homework07 {

	public String readText(File input) {
		String str;

		try {
			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			str = "";
			while ((str = br.readLine()) != null) {
			}
			br.close();
			fr.close();

			return str;

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			Debug.errorLog("找不到檔案");
			return null;
		} catch (IOException e) {
			// TODO: handle exception
			Debug.errorLog("關閉Reader失敗");
			return null;
		}

	}

	public void readFile(File input) {

		String str;
//		File sampleTxt = new File("./src/hw7/Sample.txt");
		int countChars = 0, countRows = 0;

		try {
			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);

			str = "";

			while ((str = br.readLine()) != null) {
				countRows += 1;
				countChars += str.length();
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			Debug.errorLog("找不到檔案");
		} catch (IOException e) {
			// TODO: handle exception
			Debug.errorLog("關閉Reader失敗");
		}

		System.out.printf("第一題：%s檔案共有%d個位元組，%d個字元，%d列資料", input.getName(), input.length(), countChars, countRows);
		System.out.println();
	}

	public void randomNumber(String target) {
		Set<Integer> numSet = new HashSet<Integer>();
		while (numSet.size() < 10) {
			numSet.add((int) (Math.random() * 1000) + 1);
		}

		try {
			File dataTxt = new File("./src/hw7/" + target);

			if (dataTxt.createNewFile()) {
				System.out.println("建立" + dataTxt.getName());
			} else {
				System.out.println(dataTxt.getName() + "已存在");
			}

			FileWriter fw = new FileWriter(dataTxt, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(numSet.toString());

			System.out.println("隨機亂數陣列為" + numSet.toString());
			System.out.println("已存入" + dataTxt.getAbsolutePath());

			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void copyFile(File input, File output) {

		String storage = "";
		if (input.equals(output)) {
			Debug.log("來源地與目的地相同");
			return;
		}

		// inputRead
		try {

			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);

			String str = br.readLine();
			while (str != null) {
				storage += str + "\n";
				str = br.readLine();
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			fe.printStackTrace();
			Debug.errorLog("找不到來源檔案");
			return;
		} catch (IOException ie) {
			// TODO: handle exception
			Debug.errorLog("讀取失敗");
			return;
		}

		// OutPutWriter
		try {
			if (output.createNewFile()) {
				Debug.log("成功建立" + output.getName());
			} else {
				Debug.log(output + "已存在，準備寫入");
			}
			FileWriter fw = new FileWriter(output);
			PrintWriter pw = new PrintWriter(fw, true);

			pw.println(storage);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Debug.errorLog("輸出失敗");
			return;
		}

		Debug.log("輸出完成");
		System.out.println("檔案位置: " + output.getAbsolutePath());
	}

	public void writeObject(File target) {

		Animal[] obj = new Animal[] { new Cat("波斯喵"), new Dog("柴柴") };

//		File target = new File("C:\\data\\Object.ser");
		File dir = target.getParentFile();

		if (!dir.exists()) {
			dir.mkdirs();
		}

		try {
			FileOutputStream fos = new FileOutputStream(target);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(obj[0]);
			oos.writeObject(obj[1]);

			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Debug.log("輸出完成");
	}

	public void readObject(File target) {

		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(target)))) {
			
		
			while(true) {
				Object obj = ois.readObject();
				if(obj instanceof Animal) {
					((Animal) obj).speak();
					System.out.println("----------------");
				}
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			Debug.errorLog("找不到所屬型別");
		} catch (EOFException e) {
			System.out.println("讀完啦");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] arg) {
		Homework07 h07 = new Homework07();

		// 第一題
		File sampleTxt = new File("./src/hw7/Sample.txt");
		h07.readFile(sampleTxt);

		// 第二題
		System.out.println("第二題");
		h07.randomNumber("Data.txt");

		// 第三題
		System.out.println("第三題");
		File outFile = new File("./src/hw7/Test.txt");
		h07.copyFile(sampleTxt, outFile);

		// 第四題
		System.out.println("第四題");
		
		File target = new File("C:\\data\\Object.ser");
		
		h07.writeObject(target);
//		System.out.println();

		// 第五題
		System.out.println("第五題");
		h07.readObject(target);

	}
}
