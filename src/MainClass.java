/**
 * Created by User on 05.10.2016.
 */

import java.util.Scanner;

public class MainClass {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome to magaz techniki!\n");
        System.out.print("Сколько техники добавлять: ");
        int countTech = input.nextInt();
        Techic masTech[] = new Techic[countTech];

        for (int i = 0; i < masTech.length; i++) {
            masTech[i] = new VacuumCleaner();
        }

        for (int i = 0; i < masTech.length; i++) {
            System.out.println(masTech[i].toString());
        }
    }
}
