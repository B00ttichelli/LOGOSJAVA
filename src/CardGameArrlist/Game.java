package CardGameArrlist;

import java.util.*;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private List <Card> deck  = new ArrayList<>();
    private List <Card> table = new ArrayList<>() ;
    private List <Card> discarded  = new ArrayList<>();
    private List <Player> players  = new ArrayList<>();
    private Suit trump;





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

    public void initGame () {
        generateDeck();
        System.out.println("Type your name");
        ConsolePlayer consolePlayer = new ConsolePlayer(scanner.next());
        Bot bot = new Bot();
        players.add(bot);
        players.add(consolePlayer);
        dealCards();
        setTrump();
        declareBeginner();

    }
    public void startGame (){

        // логика игры

    }

    private int howmuchtodeal(Player player){
        return player.getHand().size()>=6?0:6-player.getHand().size();
    }
    private void dealCards (){

        for (Player player: players
             ) {
            for (int i = 0; i < howmuchtodeal(player); i++) {
                //рандомно вытягиваем карту из колоды и даем в руки каждому  играку
                int randomindex = random.nextInt(deck.size());
                player.addCard(deck.get(randomindex));
                deck.remove(randomindex);

            }

        }

    }
    private void setTrump(){
        int randomindex = random.nextInt(deck.size());
        this.trump = deck.get(randomindex).getSuit();

    }

    private void declareBeginner(){
        Comparator<Player> trumpComparator = new Comparator<>() {
            @Override
            public int compare(Player player, Player t1) {
                return player.lowTrump(trump).compareTo(t1.lowTrump(trump));
            }
        };
        this.players.sort(trumpComparator);


    }
}
