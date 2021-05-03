package minigame;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select warior typing his name from list below");
        System.out.println("Necromancer");
        System.out.println("Knight");
        Scanner scanner = new Scanner(System.in);

        Warior warior = null;
        Integer selector = 0;
        while (selector==0){

            String selectedwarior = scanner.nextLine();
            switch (selectedwarior) {
                case "Necromancer":
                    warior = new Necromancer();
                    selector =1;
                    break;
                case "Knight" :
                    warior = new Knight();
                    selector = 2;
                    break;
                default:
                    System.out.println("Type name exactly !!!");
            }
        }

        System.out.println("Your selected " );
        warior.showInfo();


        List<Warior> batelfield = new ArrayList<Warior>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int x = random.nextInt();
            if (x%2==0){
                Warior enemy = new Necromancer();
                batelfield.add(enemy);

            }
            else{
                Warior enemy2 = new Knight();
                batelfield.add(enemy2);
            }


        }
        Integer score = 0;
        for (Warior x:batelfield
        ) {

            System.out.println("You meet" + x.getName()+" on your path !" );
            System.out.println("Press 1 to fight or 0 to Run");
            int choice  = scanner.nextInt();
            if(choice!=0){
                x.atack(warior);
                warior.atack(x);
                score++;
            }
            else {
                System.out.println("You cant Run always !!");
                score--;
            }

            if (warior.getHealth()<0){
                System.out.println("You Died");
                System.out.println("Yuor score "+ score);
                break;
            }
        }

        warior.showInfo();

        if(warior.getHealth()>0){
            System.out.println("Congratulations you Won !!!");
            System.out.println("Yor score "+ score);
        }



    }
}

