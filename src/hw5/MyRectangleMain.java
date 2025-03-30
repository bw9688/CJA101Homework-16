package hw5;

// 第四題
public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle myRect1 = new MyRectangle();
		myRect1.setWidth(10);
		myRect1.setDepth(20);
		System.out.println(myRect1.getArea());
		
		
		MyRectangle myRect2 = new MyRectangle(10,20);
		System.out.println(myRect2.getArea());
	}
}
