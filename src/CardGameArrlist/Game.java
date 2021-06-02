package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private List <Card> deck  = new ArrayList<>();
    private List <Card> table = new ArrayList<>() ;
    private List <Card> discarded  = new ArrayList<>();
    private List <Player> players  = new ArrayList<>();
    private Random random = new Random();


    private void generateDeck (){
        for (Suit suit: Suit.values()
             ) {
            for (Rank rank: Rank.values()
                 ) {
                Card card = new Card();
                card.setSuit(suit);
                card.setRank(rank);
                this.deck.add(card);
            }

        }
    }

    public void intitGame (){
        generateDeck();
        System.out.println("Type your name");
        ConsolePlayer consolePlayer = new ConsolePlayer(scanner.next());
        Bot bot = new Bot();


    }



}
