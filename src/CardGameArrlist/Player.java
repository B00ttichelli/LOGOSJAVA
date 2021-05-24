package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;

abstract class Player implements GamePlay {
    protected String name;
    protected List<Card> hand = new ArrayList<>();

}
