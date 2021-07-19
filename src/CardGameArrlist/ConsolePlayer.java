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

        System.out.println("is you turn now, u must beat this card");
        Card card = table.get(table.size());
        System.out.println(card);


        List<Card> bigestInHand = hand.stream().filter(
                (a) -> a.getSuit().equals(card.getSuit())).filter(
                (a) -> a.getRank().ordinal() > card.getRank().ordinal()).collect(Collectors.toList());
    //дописать
        System.out.println("Select one of those cards");
        return null;
    }

    @Override
    public Card Attack() {
        for (int i = 0; i < hand.size(); i++) {

            System.out.println(i + " . : " + hand.get(i));
        }
        System.out.println("Enter Card Number !");
        Scanner scanner = new Scanner(System.in);

        return hand.get(scanner.nextInt());

    }


}
