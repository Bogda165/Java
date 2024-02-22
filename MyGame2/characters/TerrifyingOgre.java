package characters;

public class TerrifyingOgre extends BadOgre{

    public TerrifyingOgre(){
        super();
    }
    public TerrifyingOgre(int energy){
        super(energy);
    }
    public TerrifyingOgre(int enegry, boolean hungry){
        super(enegry, hungry);
    }

    void eat(Knight knight){
        super.eat(knight);
    }

    public void roar(){
        System.out.println("AAAAAAAA!!!!!!");
    }
    public String toString(){
        return "Terrifying ogre is " + ((!getHungry())? "not " : "") + "hungry\n" + "\tenergy : " + getEnergy();
    }
}
