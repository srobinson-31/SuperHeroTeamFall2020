package Model;

public class Entity

{

	private String entityID;
	private int health;
	private String locationID;
	// There is a foreign key here in Astah called inARoom and idk why

	public Entity() 
	{
		this.entityID = "";
		this.health = 0;
		this.locationID = "";
	}

	public Entity(String entityID, int health, String locationID) 
	{
		this.entityID = entityID;
		this.health = health;
		this.locationID = locationID;
	}

	public String getEntityID() 
	{
		return entityID;
	}

	public void setEntityID(String entityID) 
	{
		this.entityID = entityID;
	}

	public int getHealth() 
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public String getLocationID() 
	{
		return locationID;
	}

	public void setLocationID(String locationID) 
	{
		this.locationID = locationID;
	}

	@Override
	public String toString() 
	{
		return "Entity [entityID=" + entityID + ", health=" + health + ", locationID=" + locationID + "]";
	}

}
