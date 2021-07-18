package CardGameArrlist;

import java.util.ArrayList;
import java.util.Random;

public class Bot extends Player{

    private static  Random random = new Random();

    @Override
    public Card Respond(ArrayList<Card> table) {
        return null;
    }

    @Override
    public Card Attack() {
        int randomNumber = random.nextInt(hand.size());
        Card randomCard = hand.get(randomNumber);
        hand.remove(randomNumber);
        return randomCard;
    }

    public Bot() {
        super.name = "Робот Василий";
    }
}
