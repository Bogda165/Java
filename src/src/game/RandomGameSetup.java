package game;
import characters.*;
import java.util.Random;
public class RandomGameSetup implements GameSetup{
        public void setup(Knight[] knights, Ogre[] ogres, int nKnights, int nBraveKnights, int nBadOgres) {
        int numberOfWarriors = nKnights + nBraveKnights - 1;

        while(numberOfWarriors != -1){
            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 0) {
                knights[numberOfWarriors] = new FatKnight(80, new HeavySword(numberOfWarriors));
            }else if(random == 1) {
                knights[numberOfWarriors] = new Knight(80, new IronSword(numberOfWarriors));
            }else{
                knights[numberOfWarriors] = new BraveKnight(100, new LightSword(numberOfWarriors));
            }
            random = rand.nextInt(2);
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
