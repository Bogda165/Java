package game;
import characters.*;
import java.util.Random;
public class RandomGameSetup implements GameSetup{
        public void setup(Knight[] knights, Ogre[] ogres, int nKnights, int nBraveKnights, int nBadOgres) {
        int numberOfWarriors = nKnights + nBraveKnights - 1;

        while(numberOfWarriors != -1){
            Random rand = new Random();
            int random = rand.nextInt(2);
            if(random == 0){
                knights[numberOfWarriors] = new Knight(80, new Sword(numberOfWarriors));
            }
            else{
                knights[numberOfWarriors] = new BraveKnight(100, new Sword(numberOfWarriors));
            }

            if(random == 0){
                ogres[numberOfWarriors] = new Ogre(100);
            }
            else{
                ogres[numberOfWarriors] = new BadOgre(100);
            }

            numberOfWarriors--;
        }
    }
}
