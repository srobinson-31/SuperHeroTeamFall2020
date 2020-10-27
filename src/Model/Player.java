package Model;

import java.util.ArrayList;

public class Player extends Entity
{
	
	private Item equippedItem;
	private ArrayList<Item> inventory;
	
	public Player() 
	{ //double check this one
		super();
		this.equippedItem = new Item();
		this.inventory = new ArrayList<>();
	}

	public Item getEquippedItem() 
	{
		return equippedItem;
	}

	public void setEquippedItem(Item equippedItem) 
	{
		this.equippedItem = equippedItem;
	}

	public ArrayList<Item> getInventory() 
	{
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) 
	{
		this.inventory = inventory;
	}
	
	

}
