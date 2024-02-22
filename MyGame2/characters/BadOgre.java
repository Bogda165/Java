package characters;

public class BadOgre extends Ogre {

	public BadOgre(){
		super();
	}
	public BadOgre(int enegry){
		super(enegry);
	}
	public BadOgre(int energy, boolean hungry){
		super(energy, hungry);
	}
	void revenge(Knight knight) {
		if (hungry)
			eat(knight);
	}
	void eat(Knight knight) {
		knight.setEnergy(0);
	}

	public String toString(){
		return "Bad ogre is " + ((!getHungry())? "not " : "") + "hungry\n" + "\tenergy : " + getEnergy();
	}
}
