package hw9;

import java.util.Iterator;

import util.Debug;

class Account {
	private int balance; // 存款餘額

	// 存錢
	synchronized public boolean deposit(int money) {
		String name = Thread.currentThread().getName();
		while (balance > 3000) {
			System.out.println(name + "看到餘額在3000以上，暫停匯款");
			try {
//				System.out.println("媽媽告訴熊大帳戶有錢了");
				wait();
			} catch (InterruptedException e) {
				// main方法呼叫媽媽執行緒的interrupt()，就是代表wait被中斷了，就會觸發此例外
				System.out.println(name + "可以結束匯款惹～");
				// 結束此方法並回傳false讓媽媽執行緒該停了
				return false;
			}
			// 被notify時，會從wait狀態醒過來並執行至此
			System.out.println(name + "被要求匯款");
		}
		setBalance(balance + money);
		System.out.println(name + "存了" + money + "，帳戶目前共有：" + balance + "元");
		notify();
		return true; // 回傳true告訴媽媽還可以繼續匯款
	}

	// 領錢
	synchronized public void withdraw(int money) {
		String name = Thread.currentThread().getName();
		while (balance < money) {
			System.out.println("                            " + name + "看到帳戶沒錢，暫停提款");
			try {
				wait();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 會從wait狀態醒過來並執行至此，代表被Mom執行緒notify
			System.out.println(name + "被老媽告知帳戶已經有錢!");
		}
		setBalance(balance - money);
		System.out.println("                            熊大領了" + money + "帳戶目前共有" + balance + "元");

		if (balance <= 2000) {
			System.out.println("                            " + name + "看到餘額在2000以下，要求匯款");
			notify();
		}
	}

	public Account() {
		balance = 0;
	}

	synchronized public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}

class MomBear extends Thread {
	private Account account;

	public MomBear(Account account) {
		super("媽媽");
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			// 存錢
			if (!account.deposit(2000)) {
				break;
			}

//		System.out.println("MomBear finished.");
	}
}

class LittleBear extends Thread {
	private Account account;
	public static boolean isFinished = false;

	public LittleBear(Account account) {
		super("熊大");
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			account.withdraw(1000); // 領錢
//		System.out.println("                    LittleBear finished.");
		isFinished = true; // 代表熊大已領了10次，要結束自己的執行緒
	}

}

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		MomBear mBear = new MomBear(account);
		LittleBear lBear = new LittleBear(account);
		mBear.start();
		lBear.start();

		while (true) {
			// 熊大執行緒跑完了而且媽媽還在等，就中斷wait
			if (lBear.isFinished && mBear.isAlive()) {
				mBear.interrupt();
			}
			// 讓無窮迴圈睡一下，把執行權讓出來
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			//// 兩個執行緒都結束了，跳出迴圈
			if (lBear.isFinished && !mBear.isAlive()) {
				break;
			}
		}

	}
}
