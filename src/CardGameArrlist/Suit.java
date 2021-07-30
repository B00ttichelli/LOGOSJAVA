package CardGameArrlist;

public enum Suit {
/*♠,♥,♣,♦;*/
    CLUBS("♠"),DIAMONDS("♦"),HEARTS("♥"),SPADES ("♣");

private String value;
    Suit(String value ) {
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
}
