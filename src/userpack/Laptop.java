package userpack; /**
 * Created by User on 06.10.2016.
 */
import java.util.Scanner;
public class  Laptop extends Technic {
    private double diag; //диагональ
    private String procname; //название процессора
    private double procgc; //частота процессора
    private String videoname; //название видеокарты
    private int videovol; //объем видеопамяти
    private int hardvol; //объем жесткого диска

    public Laptop() {
        init();
    }

    @Override
    public void init() {
        super.init();
        Scanner input = new Scanner(System.in);
        System.out.print("Диагональ: ");
        this.diag = input.nextInt();
        System.out.print("Процессор: ");
        this.procname = input.next();
        System.out.print("Частота: ");
        this.procgc = input.nextInt();
        System.out.print("Видеокарта: ");
        this.videoname = input.next();
        System.out.print("Объем видеопамяти: ");
        this.videovol = input.nextInt();
        System.out.print("Объем жесткого диска: ");
        this.hardvol = input.nextInt();
    }

    public double getDiag() { return diag; }

    public String getProcname() { return procname;  }

    public double getProcgc() { return procgc; }

    public String getVideoname() { return videoname; }

    public int getVideovol() { return videovol; }

    public int getHardvol() { return hardvol; }

    @Override
    public String toString() {
        return super.toString() + "\nДиагональ: " + getDiag() + "\nПроцессор: " + getProcname() + " " + getProcgc() + " Ггц\n" +
                "\nВидеокарта: " + getVideoname() + " " + getVideovol() + " Гб\n" + "Объем жесткого диска: " + getHardvol() + " Гб";
    }
}
