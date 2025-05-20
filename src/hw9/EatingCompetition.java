package hw9;

import util.Debug;

/*
    • 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
    競賽過程。
    • 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
     Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
    • 參考範例：CounterRunnable.java
    • 需留意主執行緒執行順序
 */

public class EatingCompetition implements Runnable {
	public static boolean already = false;

	private String name;
	private int count = 0;

	public void run() {
		while (count < 10 && already) {
			count++;
			try {
				int i = (int) (Math.random() * 2501) + 500;
//				Debug.log(name + "等了 " + i);
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "吃了第 " + count + "碗飯！");

		}
	}

	public EatingCompetition() {
	}

	public EatingCompetition(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		EatingCompetition[] ec = new EatingCompetition[] { new EatingCompetition("饅頭人"), new EatingCompetition("詹姆士") };
		Thread[] tr = new Thread[] {
				new Thread(ec[0]),
				new Thread(ec[1])
		};
		for (Thread thread : tr) {
			thread.start();
		}
		
//		for(int i = 0; i < ec.length;i++) {
//			tr[i].start();
//		}
		EatingCompetition.already = true;
		System.out.println("======大胃王比賽開始!!!======");

		
		try {
			tr[0].join();
			tr[1].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("======比賽結束!!!======");
	}
}
