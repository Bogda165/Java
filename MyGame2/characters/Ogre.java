package characters;

public class Ogre implements Energy {
	protected boolean hungry;
	protected int energy;

	public Ogre(){
		this.energy = 0;
	}
	public Ogre(int energy){
		this.energy = energy;
	}
	public Ogre(int energy, boolean hungry){
		this.energy = energy;
		this.hungry = hungry;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void increaseEnergy(int energy) {
		this.energy += energy;
	}
	public void decreaseEnergy(int energy) {
		this.energy -= energy;
	}
	public int getEnergy() {
		return energy;
	}
	public boolean getHungry(){
		return hungry;
	}
	public void setHungry(boolean tmp){
		hungry = tmp;
	}
	
	public void setValues(int energy) {
		this.energy = energy;
	}

	public void setValues(boolean hungry) {
		this.hungry = hungry;
	}
	
	public void setValues(int energy, boolean hungry) {
		this.energy = energy;
		this.hungry = hungry;
	}
	
	void revenge(Knight knight) {
		if (energy > knight.getEnergy())
			knight.setEnergy((int) (0.9 * knight.getEnergy()));
	}

	public String toString(){
		return "Ogre is " + ((!hungry)? "not " : "") + "hungry\n" + "\tenergy : " + energy;
	}
}
