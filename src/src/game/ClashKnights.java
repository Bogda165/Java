package game;

import characters.BraveKnight;
import characters.FatKnight;

public class ClashKnights implements ClashFollower{
    Game game;

    public ClashKnights(Game game){
        this.game = game;
    }

    public void inform(){
        for(int i = 0; i < game.numberOfWarriors; i++){
            if(game.knights[i].getClass() == BraveKnight.class) {
                System.out.print("B");
            }else if(game.knights[i].getClass() == FatKnight.class) {
               System.out.print("F");
            }else {
                System.out.print("K");
            }
            System.out.print((i == game.numberOfWarriors - 1)? "\n": ", ");
        }
    }

}
