package characters;

public class ChillOgre extends BadOgre{
    public ChillOgre(){
        super();
    }
    public ChillOgre(int energy){
        super(energy);
    }
    public ChillOgre(int energy, boolean hungry){
        super(energy, hungry);
    }
    @Override
    public void revenge(Knight knight){
        if(!getHungry()){
            knight.setEnergy(knight.getEnergy() + 10);
        }
    }
    @Override
    public String toString(){
        return "Chill ogre is " + ((!getHungry())? "not " : "") + "hungry\n" + "\tenergy : " + getEnergy();
    }
}
