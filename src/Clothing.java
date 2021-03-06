import java.awt.Image;

import javax.swing.ImageIcon;

public class Clothing extends Product {
	double myPrice;
	String mySize;
	String myColor;
	String myType;
	String myImage;
	int myQuantity;
	int commit;
	
	public Clothing (double price, String color, String type, int quantity, String image) {
		myPrice = price;
		myColor = color;
		myType = type;
		myQuantity = quantity;
		myImage = image;
	}
	
	public double getPrice() {
		return myPrice;
	}
	public String[] getSize() {
		String[] size = {"S","M","L","XL"};
		return size;
	}
	public String getColor() {
		return myColor;
	}
	public String getType() {
		return myType;
	}
	public String getQuantity() {
		return Integer.toString(myQuantity);
	}
	public String toString() {
		return (myType + ", " + myColor + ": " + "$" + myPrice);
	}
	
}
