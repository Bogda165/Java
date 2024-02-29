package characters;

public class FatKnight extends Knight {

    public FatKnight() {
        super();
    }
    public FatKnight(int energy) {
        super(energy);
    }
    public FatKnight(int energy, Sword sword) {
        super(energy, sword);
    }

    public void attack(Ogre ogre) {
        sword.hit(this, ogre);

        ogre.revenge(this);
    }
}
