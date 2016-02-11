package labtest01;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item implements Comparable<Item>
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
	}
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	/** 
	 * 
	 * @param pItem
	 * @return Negative if this price is lower, 0 if prices are equal, positive if this price is higher
	 */
	
	public int compareTo(Item pItem)
	{	
		return (this.aPrice - pItem.getPrice());
	}
}