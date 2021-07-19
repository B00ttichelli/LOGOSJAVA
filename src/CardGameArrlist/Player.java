package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;

abstract class Player {
    protected String name;
    protected List<Card> hand = new ArrayList<>();
    protected boolean isAtcker = false;
    protected  Suit tramp;

    public Suit getTramp() {
        return tramp;
    }

    public void setTramp(Suit tramp) {
        this.tramp = tramp;
    }
    /*    protected boolean isResponder = false;*/

    public List<Card> getHand() {
        return hand;
    }
    public void addCard (Card card){
        this.hand.add(card);
    }

    public boolean isAtcker() {
        return isAtcker;
    }
 /*   public boolean isResponder() {return isResponder; }*/
    public void setAtcker(boolean atcker) {
        isAtcker = atcker;
    }
   /* public void setResponder(boolean responder) {isResponder = responder;}*/


    public Rank lowTrump (Suit suit){
            Rank result = Rank.ACE;
        for (Card card: hand
             ) {
            if(card.getSuit().equals(suit) && card.getRank().ordinal() <= result.ordinal()){
                result = card.getRank();
            }

        }
        return result;
    }

    abstract public Card Attack();
    abstract public Card Respond(ArrayList<Card> table);


}
