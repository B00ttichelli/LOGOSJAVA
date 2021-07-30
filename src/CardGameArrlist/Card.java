package CardGameArrlist;

public class Card {
private Rank rank;
private Suit suit;

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank +
                " " + suit.toString();
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
