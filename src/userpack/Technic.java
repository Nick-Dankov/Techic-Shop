package userpack; /**
 * Created by User on 05.10.2016.
 */

import java.util.Scanner;

public abstract class Technic {
    private String name;
    private int sizel; //длина
    private int sizeh; //высота
    private int sizew; //ширина
    private int weight; //вес
    private int price; //цена


    public static Technic create (int TypeT){
        TypeTecnik var = TypeTecnik.values()[TypeT];
        switch (var.ordinal()){
            case 0: {return new VacuumCleaner();}
            case 1: {return new Laptop();}
            default: throw new RuntimeException(" Нет такого типа!");
        }
    }


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
        return "Техника \n" + "Название: '" + getName() + "'\n" + "Размеры(ДхШхВ см): " + getSizel() + "x" + getSizew() + "x" + getSizeh() +
                "\nВес (кг): " + getWeight() + "\nЦена: " + getPrice();
    }
}
