package CardGameArrlist;

import java.util.*;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private ArrayList<Card> deck = new ArrayList<>();
    private ArrayList<Card> table = new ArrayList<>();
    private ArrayList<Card> discarded = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private Suit trump;
    private List<Player> winner = new ArrayList<>();


    private void generateDeck() {
        for (Suit suit : Suit.values()
        ) {
            for (Rank rank : Rank.values()
            ) {
                Card card = new Card();
                card.setSuit(suit);
                card.setRank(rank);
                this.deck.add(card);
            }

        }
    }

    public void initGame() {
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

    public void startGame() {

        // логика игры

        int nextplayer = 0;
        while (players.size() > 1 ) {
            for (int i = 0; i < players.size(); i++) {
                if (nextplayer >= players.size()-1) {
                    nextplayer = nextplayer - (players.size() -1);
                } else {
                    nextplayer = i + 1;
                }
                if (players.get(i).isAtcker()) {
                    table.add(players.get(i).Attack());
                    players.get(i).setAtcker(false);
                    table.add(players.get(nextplayer).Respond(table));
                    if(table.get(table.size()-1)==null){
                        table.remove(table.size()-1);
                        for (Card card:table
                             ) {
                            players.get(nextplayer).addCard(card);


                        }
                        table.clear();
                        if(nextplayer+1 >= players.size()){
                            players.get(players.size()-(nextplayer+1)).setAtcker(true);
                        }else{
                            players.get(nextplayer+1);
                        }
                       /* players.get(nextplayer+1).setAtcker(true); /// проблема решить завтра*/
                        dealCards();
                        if(players.get(i).getHand().isEmpty()){
                            winner.add(players.get(i));
                            players.removeAll(winner);
                        }
                    }else {
                        for (Card card: table
                             ) {
                            discarded.add(card);

                        }
                        table.clear();
                        players.get(nextplayer).setAtcker(true);
                        dealCards();
                        if(players.get(i).getHand().isEmpty()){
                            winner.add(players.get(i));
                            players.removeAll(winner);
                        }
                        if(players.get(nextplayer).getHand().isEmpty()){
                            winner.add(players.get(nextplayer));
                            players.removeAll(winner);
                        }
                    }
                }
            }
            /// конец круга по логике


        }
    }

    private int howmuchtodeal(Player player) {
        return player.getHand().size() >= 6 ? 0 : 6 - player.getHand().size();
    }

    private void dealCards() {

        if (!deck.isEmpty()){
            for (Player player : players
            ) {
                int cardQuantity = howmuchtodeal(player);
                for (int i = 0; i < cardQuantity; i++) {
                    //рандомно вытягиваем карту из колоды и даем в руки каждому  играку
                    int randomindex = random.nextInt(deck.size());
                    player.addCard(deck.get(randomindex));
                    deck.remove(randomindex);

                }

            }
        }

    }

    private void setTrump() {
        int randomindex = random.nextInt(deck.size());
        this.trump = deck.get(randomindex).getSuit();
        for (Player player:players){
            player.setTramp(trump);
        }
        System.out.println("Trump is " + trump);
    }

    // игрок с найменьшим козырем будет в начале списка игроков
    private void declareBeginner() {
        Comparator<Player> trumpComparator = new Comparator<>() {
            @Override
            public int compare(Player player, Player t1) {
                return player.lowTrump(trump).compareTo(t1.lowTrump(trump));
            }
        };
        this.players.sort(trumpComparator);
        players.get(0).setAtcker(true);
        System.out.println(players.get(0).name + " Is game starter");

    }

    private void checkGameStatus(){

    }
}
