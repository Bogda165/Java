package game;

public class ClashOgrs implements ClashFollower{

    Game game;

    public ClashOgrs(Game game){
        this.game = game;
    }

    public void inform(){
        for(int i = 0; i < game.numberOfWarriors; i++){
            System.out.print((game.ogres[i].getClass() == characters.BadOgre.class)? "B": "O");
            System.out.print((game.numberOfWarriors - 1 == i)? "\n": ", ");
        }
    }
}
