package game;
import characters.*;

public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	static int findEnergyDifference(Energy being1, Energy being2) {
		return being1.getEnergy() - being2.getEnergy();
	}

	public static Ogre getOgre() {
		int type = (int)(Math.random() * 4) + 1;
		int energy = (int)(Math.random() * 30) + 30;
		int hungr = (int)(Math.random() * 2) + 1;

		if (type == 1) {
			return new BadOgre(energy, hungr == 1);
		} else if (type == 2) {
			return new ChillOgre(energy, hungr == 1);
		} else if (type == 3){
			return new Ogre(energy, hungr == 1);
		} else {
			return new TerrifyingOgre(energy, hungr == 1);
		}
	}
	public static Knight getKnight() {
		int type = (int)(Math.random() * 2) + 1;
		int energy = (int)(Math.random() * 30) + 30;
		int sword_e = (int)(Math.random() * 2) + 1;

		Sword sword = null;
		if(sword_e == 1){
			sword = new Sword((int)(Math.random() * 30) + 10);
		}

		if (type == 1) {
			return new Knight(energy, sword);
		} else {
			return new BraveKnight(energy, sword);
		}
	}

	int countEnergy(Energy[] e){
		int amount = 0;

		for (var i: e){
			amount += i.getEnergy();
		}

		return amount;
	}

	public static void createArraysRandom(Knight[] knights, Ogre[] ogres, int n){

		for(int i = 0; i < n; i++){

			knights[i] = getKnight();
			ogres[i] = getOgre();

		}
	}
	/*
	public static void main1(String[] args) {
		Ogre[] o = new Ogre[120];
		Knight[] k = new Knight[120];
		
		for (int i = 0; i < 20; i++) {
			k[i] = new BraveKnight(140, new Sword(i));
			o[i] = new BadOgre(50, true);

//			o[i].eat(k[i]);
//			((BadOgre) o[i]).eat(k[i]);
			
			System.out.println(findEnergyDifference(o[i], k[i]) + " " +
					findEnergyDifference(k[i], o[i]) + " " +
					findEnergyDifference(k[i], k[i]));
		}
		
		for (int i = 20; i < 40; i++) {
			k[i] = new Knight(40, new Sword(i));
			o[i] = new BadOgre(50);
		}

		for (int i = 40; i < 100; i++) {
			k[i] = new Knight(40, new Sword(i));
			o[i] = new Ogre(50);
		}

		for(int i = 100; i < 120; i++){
			k[i] = new Knight(30, new Sword(i));
			o[i] = new TerrifyingOgre(10);
			((TerrifyingOgre)o[i]).roar();
		}

		for (int i = 0; i < 120; i++) {
			clash(o[i], k[i]);
			
			System.out.println(i + ":" + "knight " + k[i].getEnergy() +
					" / " + "ogre " + o[i].getEnergy() + " sword: " + k[i].showSword());
		}
	}
	*/
	public static void main(String[] args) {
		int n = 200;
		Knight[] k = new Knight[n];
		Ogre[] o = new Ogre[n];

		//createArrays(k, o);
		createArraysRandom(k, o, n);

		for (int i = 0; i < n; i++) {
			clash(o[i], k[i]);
			System.out.println("R:" + (i + 1) + "--------------------------------------------\n\n");
			System.out.println(k[i] + " / " + o[i] + "\n");
			System.out.println("------------------------------------------------\n");
		}
	}
}
