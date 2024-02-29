package characters;

public class HeavySword extends Sword {
    public HeavySword(int productNumber) {
        super(productNumber);
    }

    public void hit(Knight knight, Ogre ogre) {
        if (knight.getEnergy() >= ogre.getEnergy())
            ogre.setEnergy((int) (1.5 * ogre.getEnergy()));

        System.out.println("Knight - heavy sword");
    }

    public void hit(BraveKnight knight, Ogre ogre) {
        ogre.setEnergy((int) (1.3 * ogre.getEnergy()));

        System.out.println("Brave Knight - heavy sword");
    }
}
