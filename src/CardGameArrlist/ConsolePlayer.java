package CardGameArrlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsolePlayer extends Player {


    public ConsolePlayer(String name) {
        super.name = name;
    }

    @Override
    public Card Respond(ArrayList<Card> table) {
        Card card = table.get(table.size() - 1);
        System.out.println("U must beat this card : " + card);
        List<Card> biggestInHand = new ArrayList<>();

        if (!card.getSuit().equals(getTramp())) {
            biggestInHand = hand.stream().filter(
                    (a) -> a.getSuit().equals(card.getSuit())).filter(
                    (a) -> a.getRank().ordinal() > card.getRank().ordinal()).collect(Collectors.toList());
            //добавляем козыри
            biggestInHand.addAll(hand.stream().filter((a) -> a.getSuit().equals(getTramp())).collect(Collectors.toList()));
        } else {


            biggestInHand.addAll(hand.stream().filter((a) -> a.getSuit().equals(getTramp())).collect(Collectors.toList()));

        }


        if (!biggestInHand.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select one on your choice");
            for (int i = 0; i < biggestInHand.size(); i++) {
                System.out.println(i + " : " + biggestInHand.get(i));
            }
            System.out.println("Or type 99 to get card");
            int choice = scanner.nextInt();
            if (choice != 99) {
                hand.remove(biggestInHand.get(choice));
                return biggestInHand.get(choice);
            } else {

                System.out.println("You are decided to take a card");
                return null;
            }

        } else {
            System.out.println("You can't beat this card and u taking it");
            return null;
        }


    }

    @Override
    public Card Attack() {
        for (int i = 0; i < hand.size(); i++) {

            System.out.println(i + " . : " + hand.get(i));
        }
        System.out.println("Enter Card Number !");
        Scanner scanner = new Scanner(System.in);
        Card card = hand.get(scanner.nextInt());
        hand.remove(card);

        return card;

    }


}
