package characters;

public class BraveKnight extends Knight {

	public BraveKnight() {
		super();
	}
	public BraveKnight(int energy) {
		super(energy);
	}
	public BraveKnight(int energy, Sword sword) {
		super(energy, sword);
	}

	public void attack(Ogre ogre) {
		ogre.setEnergy(0);
	}

	public String toString(){
		return "Brave knight has " + energy + " energy; Knight do " + ((sword != null)? "" : "not ") + "has sword ->" + ((sword != null)? sword.getProductNumber() : 0);
	}
}
