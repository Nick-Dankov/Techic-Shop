/**
 * Created by User on 05.10.2016.
 */

import java.util.Scanner;

public class VacuumCleaner extends Techic {
    private int power; //мощность
    private int volume; //объем

    public VacuumCleaner() {
        init();
    }

    @Override
    public void init() {
        super.init();
        Scanner input = new Scanner(System.in);
        System.out.print("Мощность: ");
        this.power = input.nextInt();
        System.out.print("Объем: ");
        this.volume = input.nextInt();

    }

    public int getPower() {
        return power;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + "\nМощность: " + getPower() + "\nОбъем: " + getVolume();
    }
}
