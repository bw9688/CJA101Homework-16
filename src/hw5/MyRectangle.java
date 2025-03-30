package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return  this.width * this.depth;
	}
	
	public MyRectangle() {
		width = 0;
		depth = 0;
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
