package CardGameArrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsolePlayer extends Player {

    public ConsolePlayer(String name) {
            super.name = name;
    }

    @Override
    public Card Respond(ArrayList<Card> table) {
        return null;
    }

    @Override
    public Card Attack() {
        for (int i = 0; i < hand.size(); i++) {

            System.out.println(i+" . : " + hand.get(i));
        }
        System.out.println("Enter Card Number !");
        Scanner scanner = new Scanner(System.in);

        return hand.get(scanner.nextInt());

    }


}
