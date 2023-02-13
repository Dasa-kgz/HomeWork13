import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" **********My nout***********");
        Marka marka = new Marka("Asus", "Notebook");
        System.out.println(marka);

        System.out.println("*****************************");


        Display display = new Display("Asus", 15.9, "LED");
        System.out.println(display);
        System.out.println("*****************************");

        HardDisc hardDisc = new HardDisc(1024, 2);
        HardDisc hardDisc1 = new HardDisc(256, 1);
        System.out.println("HDD " + hardDisc);
        System.out.println("SSD M2 " + hardDisc1);
        System.out.println("*****************************");

        Ram ram = new Ram(8192, "ASUS");
        System.out.println(ram);
        System.out.println("*****************************");

        PortUSB portUSB = new PortUSB(3.0, 'y');
        System.out.println(portUSB);
        System.out.println("*****************************");

        Keyboard keyboard = new Keyboard("yes", "yes");
        System.out.println(keyboard);
        System.out.println("*****************************");

        VRAM vram = new VRAM(4, "Nvidia GeForce 1050Ti");
        System.out.println(vram);
        System.out.println("*****************************");


    }
}