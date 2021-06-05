package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;

abstract class Player {
    protected String name;
    protected List<Card> hand = new ArrayList<>();
    protected boolean isAtcker = false;

    public List<Card> getHand() {
        return hand;
    }
    public void addCard (Card card){
        this.hand.add(card);
    }

    public boolean isAtcker() {
        return isAtcker;
    }

    public void setAtcker(boolean atcker) {
        isAtcker = atcker;
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

    abstract public Card Attack();


}
