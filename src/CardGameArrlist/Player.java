package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;

abstract class Player implements GamePlay {
    protected String name;
    protected List<Card> hand = new ArrayList<>();


    public List<Card> getHand() {
        return hand;
    }
    public void addCard (Card card){
        this.hand.add(card);
    }

    public Rank lowTrump (Suit suit){
            Rank result = Rank.ASS;
        for (Card card: hand
             ) {
            if(card.getSuit().equals(suit) && card.getRank().ordinal() <= result.ordinal()){
                result = card.getRank();
            }

        }
        return result;
    }


}
