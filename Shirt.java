package ShirtPackage;

public abstract class Shirt
{
	public int size;
	public float price;
	public String colour;

	protected Shirt(int s, float p)
	{
		size = s;
		price = p;
	}

	protected abstract String getColour();
	protected abstract void setColour(String c);
	protected abstract void getDetails();
}
