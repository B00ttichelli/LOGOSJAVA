package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Bot extends Player{

    private static  Random random = new Random();

    @Override
    public Card Respond(ArrayList<Card> table) {
        Card card = table.get(table.size()-1);
        List<Card> bigestInHand;
         if(!card.getSuit().equals(tramp)){
              bigestInHand = hand.stream().filter(
                     (a) -> a.getSuit().equals(card.getSuit())).filter(
                     (a) -> a.getRank().ordinal() > card.getRank().ordinal()).collect(Collectors.toList());
             //добавляем козыри
             bigestInHand.addAll(hand.stream().filter((a)->a.getSuit().equals(getTramp())).collect(Collectors.toList()));
         } else {
             bigestInHand = hand.stream().filter(
                     (a) -> a.getSuit().equals(card.getSuit())).filter(
                     (a) -> a.getRank().ordinal() > card.getRank().ordinal()).collect(Collectors.toList());
         }

        if(bigestInHand.size() == 0){
            System.out.println(this.name + " Cant beat your card !! And taking " + card);
            return null;

        } else {
            // моя логика рандом сцуко !!!
            int randNumber = random.nextInt(bigestInHand.size());
            Card responsiveCard  = bigestInHand.get(randNumber);
            hand.remove(responsiveCard);
            System.out.println(this.name + " Beat your card with " + responsiveCard);
            return responsiveCard;
        }

    }

    @Override
    public Card Attack() {
        int randomNumber = random.nextInt(hand.size());
        Card randomCard = hand.get(randomNumber);
        hand.remove(randomNumber);
        return randomCard;
    }

    public Bot() {
        super.name = "MegaTron";
    }
}
