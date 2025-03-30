package hw6;

public class Calculator {
	private int x, y;

	// 私有方法作為計算
	private double power(int x, int y) {
		return Math.pow(x, y);
	}

	public Calculator(int x, int y) throws CalException {
		powerXY(x, y);
	}

	public Calculator() {

	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public double powerXY(int x, int y) throws CalException {
		checkXY(x, y);
		setX(x);
		setY(y);
		return power(x, y);
	}

	void checkXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數");			
		}
	}
}
