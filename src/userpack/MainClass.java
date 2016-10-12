package userpack; /**
 * Created by User on 05.10.2016.
 */

import java.util.Scanner;
public class MainClass {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome to magaz techniki!\n");
        System.out.print("Сколько техники добавлять: ");
        int countTech = input.nextInt();
        Technic masTech[] = new Technic[countTech];

        for (int i = 0; i < masTech.length; i++) {
            System.out.println("0 - Пылесос\n1 - Ноутбук");
            int TypeT = input.nextInt();
            masTech[i]=Technic.create(TypeT);
        }

        for (int i = 0; i < masTech.length; i++) {
            System.out.println(masTech[i].toString());
        }
    }
}
