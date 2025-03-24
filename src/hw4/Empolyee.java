package hw4;

public class Empolyee {
	private int empNo;
	private int money;
	
	Empolyee(int empNo, int money) {
		this.empNo = empNo;
		this.money = money;
	}
	
	public Empolyee() {
		this.empNo = 0;
		this.money = 0;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}
