import java.util.*;
import java.io.*;
import ShirtPackage.Shirt;

final class PullOver extends Shirt
{
	public Boolean hasHood, hasStripes;

	PullOver(int size, float price, Boolean hood, Boolean stripes)
	{
		super(size, price);
		hasHood = hood;
		hasStripes = stripes;
	}

	protected String getColour()
	{
		return super.colour;
	}

	protected void setColour(String c)
	{
		super.colour = c;
	}

	protected void getDetails()
	{
		System.out.println("\nSize: " + super.size + "\nPrice: " + super.price + "\nHood: " + hasHood + "\nStripes: " + hasStripes + "\nColour: " + this.getColour());
	}
}

class FormalShirt extends Shirt
{
	public Boolean hasFullSleeve, hasStripes;

	FormalShirt(int size, float price, Boolean sleeve, Boolean stripes)
	{
		super(size, price);
		hasFullSleeve = sleeve;
		hasStripes = stripes;
	}

	protected String getColour()
	{
		return super.colour;
	}

	protected void setColour(String c)
	{
		super.colour = c;
	}

	protected void getDetails()
	{
		System.out.println("\nSize: " + super.size + "\nPrice: " + super.price + "\nSleeves: " + hasFullSleeve + "\nStripes: " + hasStripes + "\nColour: " + this.getColour());
	}
}

class PartyWear extends FormalShirt
{
	String brand;

	PartyWear(int size, float price, Boolean sleeve, Boolean stripes, String b)
	{
		super(size, price, sleeve, stripes);
		brand = b;
	}

	protected void getDetails()
	{
		System.out.println("\nBrand: " + brand + "\nSize: " + super.size + "\nPrice: " + super.price + "\nSleeves: " + hasFullSleeve + "\nStripes: " + hasStripes + "\nColour: " + this.getColour());
	}
}

class MainShirt
{
	public static void main(String[] args)
	{
		System.out.println("Generating three shirts... ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Entering data to the shirts... ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PullOver s1 = new PullOver(32, 350, true, false);
		s1.setColour("Red");
		FormalShirt s2 = new FormalShirt(30, 350, true, false);
		s2.setColour("Blue");
		PartyWear s3 = new PartyWear(36, 450, true, false, "PUMA");
		s3.setColour("Green");
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
	}
}