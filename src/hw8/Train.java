package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{
	

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train() {
		setNumber(0);
		setType("無");
		setStart("無");
		setDest("無");
		setPrice(0);
	}
	
	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}
	
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Train t) {
		return t.number - this.number ;
		
		/*
		if (this.number > t.number) {
			return 1;
		}
		if (this.number == t.number) {
			return 0;
		}
		if (this.number < t.number) {
			return -1;
		}
		*/
		
	}
	
	
}
