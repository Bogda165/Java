package game;

import characters.BraveKnight;

public class ClashKnights implements ClashFollower{
    Game game;

    public ClashKnights(Game game){
        this.game = game;
    }

    public void inform(){
        for(int i = 0; i < game.numberOfWarriors; i++){
            System.out.print((game.knights[i].getClass() == BraveKnight.class)? "B": "K");
            System.out.print((i == game.numberOfWarriors - 1)? "\n": ", ");
        }
    }

}
