package Model;

public class Enemy extends Entity
{

	private String enemyDescription;
	private String itemID;
	private int dodgeChance;
	private String enemyName;
	
	public Enemy() {
		super();
		this.enemyDescription = "";
		this.itemID = "";
		this.dodgeChance = 0;
		this.enemyName = "";
	}

	public Enemy(String enemyDescription, String itemID, int dodgeChance, String enemyName) {
		super();
		this.enemyDescription = enemyDescription;
		this.itemID = itemID;
		this.dodgeChance = dodgeChance;
		this.enemyName = enemyName;
	}

	public String getEnemyDescription() {
		return enemyDescription;
	}

	public void setEnemyDescription(String enemyDescription) {
		this.enemyDescription = enemyDescription;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getDodgeChance() {
		return dodgeChance;
	}

	public void setDodgeChance(int dodgeChance) {
		this.dodgeChance = dodgeChance;
	}

	public String getEnemyName() {
		return enemyName;
	}

	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}

	@Override
	public String toString() {
		return "Enemy [enemyDescription=" + enemyDescription + ", itemID=" + itemID + ", dodgeChance=" + dodgeChance
				+ ", enemyName=" + enemyName + "]";
	}
	
	
}
