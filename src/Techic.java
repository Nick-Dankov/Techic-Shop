/**
 * Created by User on 05.10.2016.
 */

import java.util.Scanner;

public abstract class Techic {
    private String name;
    private int sizel; //dlina
    private int sizeh; //visota
    private int sizew; //shirina
    private int weight; //ves
    private int price; //cena

    public void init() {
        Scanner input = new Scanner(System.in);
        System.out.print("Название: ");
        this.name = input.next();

        //System.out.print("Размеры\n");
        System.out.print(" длина (см): ");
        this.sizel = input.nextInt();
        System.out.print(" ширина (см): ");
        this.sizew = input.nextInt();
        System.out.print(" высота (см): ");
        this.sizeh = input.nextInt();


        System.out.print("Вес (кг): ");
        this.weight = input.nextInt();
        System.out.print("Цена: ");
        this.price = input.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getSizel() {
        return sizel;
    }

    public int getSizeh() {
        return sizeh;
    }

    public int getSizew() {
        return sizew;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Техника \n" + "Название: '" + getName() + ", Размеры(ДхШхВ см): " + getSizel() + "x" + getSizew() + "x" + getSizeh() +
                ", Вес (кг): " + getWeight() + ", Цена: " + getPrice();
    }
}
