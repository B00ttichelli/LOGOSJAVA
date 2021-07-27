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

    // функция генерации колоды
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

    //функция инициализации игры
    public void initGame() {
        generateDeck(); ///генерируем новую колоду
        System.out.println("Type your name"); // спрашиваем имя пользователя
        players.add(new ConsolePlayer(scanner.next())); //добавляем нового игрока с заданым именем в список
        players.add(new Bot()); //добавляем нового бота в список игроков
        dealCards(); // раздали карты
        setTrump(); // определили козырь
        declareBeginner(); //обявили начинающего

    }

    // основная функция игры
    public void startGame() {

        // логика игры

        int nextPlayer = 0;

        //пока в списке игроков количество игроков больше одного будем играть
        while (players.size() > 1) {
            for (int i = 0; i < players.size(); i++) {
                if (nextPlayer >= players.size() - 1) {
                    nextPlayer = nextPlayer - (players.size() - 1);
                } else {
                    nextPlayer = i + 1;
                }
                if (players.get(i).isAtcker()) {
                    table.add(players.get(i).Attack());
                    players.get(i).setAtcker(false);
                    table.add(players.get(nextPlayer).Respond(table));
                    if (table.get(table.size() - 1) == null) {
                        table.remove(table.size() - 1);
                        for (Card card : table
                        ) {
                            players.get(nextPlayer).addCard(card);
                        }

                        table.clear();
                        if (nextPlayer + 1 >= players.size()) {
                            players.get(players.size() - (nextPlayer + 1)).setAtcker(true);
                        } else {
                            players.get(nextPlayer).setAtcker(true);
                        }
                        /* players.get(nextPlayer+1).setAtcker(true); /// проблема решить завтра*/
                        dealCards();
                        if (players.get(i).getHand().isEmpty()) {
                            winner.add(players.get(i));
                            players.removeAll(winner);
                        }
                    } else {
                        for (Card card : table
                        ) {
                            discarded.add(card);

                        }
                        table.clear();
                        players.get(nextPlayer).setAtcker(true);
                        dealCards();
                        if (players.get(i).getHand().isEmpty()) {
                            winner.add(players.get(i));
                            players.removeAll(winner);
                        }
                        if (players.get(nextPlayer).getHand().isEmpty()) {
                            winner.add(players.get(nextPlayer));
                            players.removeAll(winner);
                        }
                    }
                }
            }
            /// конец круга по логике


        }

        winner.forEach(a-> System.out.println(a.name));
        System.out.println("are Winners");
    }

    // функция определения недостающих карт у игрока
    private int howMuchToDeal(Player player) {
        return player.getHand().size() >= 6 ? 0 : 6 - player.getHand().size();
    }

    // функция раздачи карт игрокам
    private void dealCards() {

        if (!deck.isEmpty()) {
            for (Player player : players
            ) {
                int cardQuantity = howMuchToDeal(player);
                for (int i = 0; i < cardQuantity; i++) {
                    //рандомно вытягиваем карту из колоды и даем в руки каждому  играку
                    int randomIndex = random.nextInt(deck.size());
                    player.addCard(deck.get(randomIndex));
                    deck.remove(randomIndex);

                }

            }
        }

    }

    // функция определения козыря
    private void setTrump() {
        int randomIndex = random.nextInt(deck.size());
        this.trump = deck.get(randomIndex).getSuit();
        for (Player player : players) {
            player.setTramp(trump);
        }
        System.out.println("Trump is " + trump);
    }

    // функция определения геймстартера игрок с найменьшим козырем будет в начале списка игроков
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

    private void checkGameStatus() {

    }
}
