package Model;

public class Puzzle
{
	private String puzzleID;
	private String roomID;
	private String itemID;
	private String puzzleDescription;
	private String puzzleanswer;
	private boolean isSolved;
	
	public Puzzle() {
		super();
		this.puzzleID = "";
		this.roomID = "";
		this.itemID = "";
		this.puzzleDescription = "";
		this.puzzleanswer = "";
		this.isSolved = false;
	}
	
	public Puzzle(String puzzleID, String roomID, String itemID, String puzzleDescription, String puzzleanswer,
			boolean isSolved) {
		super();
		this.puzzleID = puzzleID;
		this.roomID = roomID;
		this.itemID = itemID;
		this.puzzleDescription = puzzleDescription;
		this.puzzleanswer = puzzleanswer;
		this.isSolved = isSolved;
	}

	public String getPuzzleID() {
		return puzzleID;
	}

	public void setPuzzleID(String puzzleID) {
		this.puzzleID = puzzleID;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getPuzzleDescription() {
		return puzzleDescription;
	}

	public void setPuzzleDescription(String puzzleDescription) {
		this.puzzleDescription = puzzleDescription;
	}

	public String getPuzzleanswer() {
		return puzzleanswer;
	}

	public void setPuzzleanswer(String puzzleanswer) {
		this.puzzleanswer = puzzleanswer;
	}

	public boolean isSolved() {
		return isSolved;
	}

	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}

	@Override
	public String toString() {
		return "Puzzle [puzzleID=" + puzzleID + ", roomID=" + roomID + ", itemID=" + itemID + ", puzzleDescription="
				+ puzzleDescription + ", puzzleanswer=" + puzzleanswer + ", isSolved=" + isSolved + "]";
	}
	
}
